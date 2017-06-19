package test;

public class Manager extends Employee {

	private String performance;

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	@Override
	protected String getOtherInfo() {
		
		return "Òµ¼¨£º" + this.performance + "\t";
	}
	
}
