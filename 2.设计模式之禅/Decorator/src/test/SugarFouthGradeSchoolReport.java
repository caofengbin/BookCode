package test;

public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {
	
	private void reportHighScore() {
		
		System.out.println("��ο������������75�� ��ѧ��78�� ��Ȼ��80");
		
	}
	
	private void reportSort() {
		
		System.out.println("�ҵ�������38��...");
		
	}
	
	public void report() {
		
		this.reportHighScore();
		super.report();
		this.reportSort();
		
	}
	
}
