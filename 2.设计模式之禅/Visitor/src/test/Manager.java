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
		
		return "ҵ����" + this.performance + "\t";
	}
	
}
