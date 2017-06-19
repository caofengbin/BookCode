package test;

public class HighScoreDecorator extends Decorator {
	
	public HighScoreDecorator(SchoolReport sr) {
		super(sr);
	}
	
	private void reportHighScore() {
		
		System.out.println("这次考试语文最高是75， 数学史78， 自然是80");
		
	}
	
	public void report() {
		
		this.reportHighScore();
		super.report();
		
	}
	
}
