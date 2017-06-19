package test;

public class CommonEmployee extends Employee {
	
	private String job;

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	protected String getOtherInfo() {
		
		return "¹¤×÷£º" + this.job + "\t";
	}

}
