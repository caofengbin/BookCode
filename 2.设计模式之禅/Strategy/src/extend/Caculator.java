package extend;

public class Caculator {
	
	private final static String ADD = "+";
	
	private final static String SUB = "-";
	
	public int exec(int a, int b, String symbol) {
		
		int result = 0;
		
		if(symbol.equalsIgnoreCase(ADD)) {
			
			result = this.add(a, b);
			
		} else if (symbol.equalsIgnoreCase(SUB)) {
			
			result = this.sub(a, b);
			
		}
		
		return result;
		
	}
	
	private int add(int a, int b) {
		
		return a + b;
		
	}
	
	private int sub(int a, int b) {
		
		return a - b;
		
	}
	
}
