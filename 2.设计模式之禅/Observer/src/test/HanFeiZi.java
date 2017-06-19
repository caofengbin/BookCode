package test;

public class HanFeiZi implements IHanFeiZi {
	
	private ILiSi liSi = new LiSi();
	
	private boolean isHavingBreakfast = false;
	
	private boolean isHavingFun = false;

	public void haveBreakfast() {
		
		System.out.println("韓非子：开始吃饭了...");
		this.liSi.update("韩非子在吃饭");
		this.isHavingBreakfast = true;
		
	}

	public void haveFun() {
		
		System.out.println("韩非子：开始娱乐了...");
		this.liSi.update("韩非子在娱乐");
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
