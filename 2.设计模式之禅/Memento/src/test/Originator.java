package test;

public class Originator implements Cloneable {

	private String state = "";
	
	private Originator backup;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void createMemento() {
		
		this.backup = (Originator)this.clone();
	}
	
//	public Memento createMemento() {
//		
//		return new Memento(this.state);
//	}
	
	public void restoreMemento() {
		
		this.setState(this.backup.getState());
	}

	@Override
	protected Object clone() {
		
		try {
			
			return  (Originator)super.clone();
			
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			
		}
		
		return null;
	}
}
