package test;

public class ClothesCorp extends Corp {

//	@Override
//	protected void produce() {
//		System.out.println("��װ��˾������װ...");
//	}
//
//	@Override
//	protected void sell() {
//		System.out.println("��װ��˾�����·�...");
//	}
	
	public ClothesCorp(Product product) {
		super(product);
	}
	
	public void makeMoney() {
		super.makeMoney();
		System.out.println("��װ��˾׬СǮ...");
	}
}
