package test;

public class HouseCorp extends Corp {

//	@Override
//	protected void produce() {
//		System.out.println("���ز���˾�Ƿ���...");
//	}
//	
//	@Override
//	protected void sell() {
//		System.out.println("���ز���˾���۷���...");
//		
//	}
	public HouseCorp(House house) {
		super(house);
	}
	
	public void makeMoney() {
		super.makeMoney();
		System.out.println("���ز���˾׬��Ǯ��...");
	}
	
}
