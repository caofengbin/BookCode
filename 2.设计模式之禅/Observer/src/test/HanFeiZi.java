package test;

public class HanFeiZi implements IHanFeiZi {
	
	private ILiSi liSi = new LiSi();
	
	private boolean isHavingBreakfast = false;
	
	private boolean isHavingFun = false;

	public void haveBreakfast() {
		
		System.out.println("�n���ӣ���ʼ�Է���...");
		this.liSi.update("�������ڳԷ�");
		this.isHavingBreakfast = true;
		
	}

	public void haveFun() {
		
		System.out.println("�����ӣ���ʼ������...");
		this.liSi.update("������������");
		this.isHavingFun = true;
		
	}

	public boolean isHavingBreakfast() {
		return isHavingBreakfast;
	}

	public void setHavingBreakfast(boolean isHavingBreakfast) {
		this.isHavingBreakfast = isHavingBreakfast;
	}

	public boolean isHavingFun() {
		return isHavingFun;
	}

	public void setHavingFun(boolean isHavingFun) {
		this.isHavingFun = isHavingFun;
	}

}
