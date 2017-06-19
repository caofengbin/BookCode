package builder;

public abstract class Builder {

	protected final SuperMan superMan = new SuperMan();
	
	public void setBody(String body) {
		
		this.superMan.setBody(body);
		
	}
	
	public void setSpecialTalent(String str) {
		
		this.superMan.setSpecialTalent(str);
		
	}
	
	public void setSpecialSymbol(String str) {
		
		this.superMan.setSpecialSymbol(str);
		
	}
	
	public abstract SuperMan getSuprMan();
	
}
