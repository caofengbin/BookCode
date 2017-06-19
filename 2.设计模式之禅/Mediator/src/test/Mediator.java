package test;

public class Mediator extends AbstractMediator {

	@Override
	public void execute(String str, Object obj) {

		if(str.equalsIgnoreCase("purchase.buy")) {
			this.buyIBMcomputer((Integer)obj);
		} else if (str.equalsIgnoreCase("sale.sell")) {
			this.sellIBMComputer((Integer)obj);
		} else if (str.equalsIgnoreCase("sale.offsale")) {
			this.offSale();
		} else if (str.equalsIgnoreCase("stock.clear")) {
			this.clearStock();
		}
		
	}
	
	private void buyIBMcomputer(int number) {
		
		int saleStatus = sale.getSaleStatus();
		
		if(saleStatus > 80) {
			
			System.out.println("采购IBM电脑：" + number + "台");
			stock.increase(number);
			
		} else {
			
			int buyNumber = number/2;
			System.out.println("采购IBM电脑：" + buyNumber + "台");
			
		}
		
		System.out.println("库存数量为：" + stock.getCOMPUTER_NUMBER());
		
	}
	
	private void sellIBMComputer(int number) {
				
		if(stock.getStockNumber() < number) {
			buyIBMcomputer(number);
		}
		
		System.out.println("销售IBM电脑" + number + "台");
		stock.decrease(number);
		
	}

	public void offSale() {
		
		System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");
		
	}
	
	public void clearStock() {
		
		System.out.println("清理存货数量为：" + stock.getCOMPUTER_NUMBER());
		this.offSale();
		purchase.refuseBuyIBM();
		
	}
	

}
