package test;

public class Son extends Handler {
	
	public Son() {
		super(Handler.SON_LEVEL_REQUEST);
	}

	@Override
	protected void response(IWomen women) {
		
		System.out.println("---------ĸ���������ʾ------");
		System.out.println("ĸ�׵���ʾ�ǣ�" + women.getRequest());
		System.out.println("���ӵĴ��ǣ�ͬ��\n");
	
	}
	
}
