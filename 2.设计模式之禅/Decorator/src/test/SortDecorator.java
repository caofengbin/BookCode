package test;

public class SortDecorator extends Decorator {

	public SortDecorator(SchoolReport sr) {
		
		super(sr);
		
	}
	
	private void reportSort() {
		
		System.out.println("����������38��...");
		
	}
	
	public void report() {
		super.report();
		this.reportSort();
	}
	
}
