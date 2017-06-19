package test;

public class IPodCorp extends Corp {
	
	public IPodCorp(Product product) {
		super(product);
	}

	@Override
	public void makeMoney() {
		super.makeMoney();
		System.out.println("我赚钱呀...");
	}

//	@Override
//	protected void produce() {
//		System.out.println("我生产iPod...");
//	}
//
//	@Override
//	protected void sell() {
//		System.out.println("iPod畅销...");
//	}

}
