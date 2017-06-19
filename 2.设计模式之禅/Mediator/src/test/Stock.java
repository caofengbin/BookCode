package test;

public class Stock extends AbstractColleague {
	
	private static int COMPUTER_NUMBER = 100;
	
	public Stock(AbstractMediator mediator) {
		
		super(mediator);
		
	}
	
	public void increase(int number) {
		
		this.COMPUTER_NUMBER = this.COMPUTER_NUMBER + number;
		System.out.println("库存数量为：" + this.COMPUTER_NUMBER);
		
	}
	
	public void decrease(int number) {
		
		this.COMPUTER_NUMBER = this.COMPUTER_NUMBER - number;
		System.out.println("库存数量为：" + this.COMPUTER_NUMBER);
	}
	
	public int getStockNumber() {
		
		return this.COMPUTER_NUMBER;
		
	}
	
	public int getCOMPUTER_NUMBER() {
		return COMPUTER_NUMBER;
	}
	
	public void clearStock() {
		super.mediator.execute("stock.clear", null);
	}
	
}
