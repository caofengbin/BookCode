package test;

public class IPodCorp extends Corp {
	
	public IPodCorp(Product product) {
		super(product);
	}

	@Override
	public void makeMoney() {
		super.makeMoney();
		System.out.println("��׬Ǯѽ...");
	}

//	@Override
//	protected void produce() {
//		System.out.println("������iPod...");
//	}
//
//	@Override
//	protected void sell() {
//		System.out.println("iPod����...");
//	}

}
