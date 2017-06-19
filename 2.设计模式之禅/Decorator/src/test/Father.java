package test;

public class Father {
	
	public static void main(String[] args) {
		
		SchoolReport sr = new SugarFouthGradeSchoolReport();
		sr = new HighScoreDecorator(sr);
		sr = new SortDecorator(sr);
		
		sr.report();
		sr.sign("ÀÏÈý");
	}

}
