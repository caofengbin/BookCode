package test;

public class ClothesCorp extends Corp {

//	@Override
//	protected void produce() {
//		System.out.println("服装公司生产服装...");
//	}
//
//	@Override
//	protected void sell() {
//		System.out.println("服装公司出售衣服...");
//	}
	
	public ClothesCorp(Product product) {
		super(product);
	}
	
	public void makeMoney() {
		super.makeMoney();
		System.out.println("服装公司赚小钱...");
	}
}
