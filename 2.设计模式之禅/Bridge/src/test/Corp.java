package test;

public abstract class Corp {
	
//	protected abstract void produce();
//	
//	protected abstract void sell();
	
	private Product product;{}
	
	public Corp(Product product) {
		this.product = product;
	}
	
	public void makeMoney() {
		this.product.beProduced();
		this.product.beSelled();
	}
}
