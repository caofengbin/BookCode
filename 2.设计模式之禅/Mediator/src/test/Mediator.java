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
			
			System.out.println("�ɹ�IBM���ԣ�" + number + "̨");
			stock.increase(number);
			
		} else {
			
			int buyNumber = number/2;
			System.out.println("�ɹ�IBM���ԣ�" + buyNumber + "̨");
			
		}
		
		System.out.println("�������Ϊ��" + stock.getCOMPUTER_NUMBER());
		
	}
	
	private void sellIBMComputer(int number) {
				
		if(stock.getStockNumber() < number) {
			buyIBMcomputer(number);
		}
		
		System.out.println("����IBM����" + number + "̨");
		stock.decrease(number);
		
	}

	public void offSale() {
		
		System.out.println("�ۼ�����IBM����" + stock.getStockNumber() + "̨");
		
	}
	
	public void clearStock() {
		
		System.out.println("����������Ϊ��" + stock.getCOMPUTER_NUMBER());
		this.offSale();
		purchase.refuseBuyIBM();
		
	}
	

}
