package test;

public class HighScoreDecorator extends Decorator {
	
	public HighScoreDecorator(SchoolReport sr) {
		super(sr);
	}
	
	private void reportHighScore() {
		
		System.out.println("��ο������������75�� ��ѧʷ78�� ��Ȼ��80");
		
	}
	
	public void report() {
		
		this.reportHighScore();
		super.report();
		
	}
	
}
