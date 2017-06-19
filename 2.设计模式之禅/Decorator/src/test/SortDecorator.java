package test;

public class SortDecorator extends Decorator {

	public SortDecorator(SchoolReport sr) {
		
		super(sr);
		
	}
	
	private void reportSort() {
		
		System.out.println("我是排名第38名...");
		
	}
	
	public void report() {
		super.report();
		this.reportSort();
	}
	
}
