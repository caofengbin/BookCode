package test;

public class Father extends Handler  {

	public Father() {
		
		super(Handler.FATHER_LEVEL_REQUEST);
		
	}
	
	@Override
	protected void response(IWomen women) {
		
		System.out.println("-----------Ů��������ʾ----------");
		System.out.println("Ů������ʾ�ǣ�" + women.getRequest());
		System.out.println("���׵Ĵ��ǣ�ͬ��\n");
		
	}

}
