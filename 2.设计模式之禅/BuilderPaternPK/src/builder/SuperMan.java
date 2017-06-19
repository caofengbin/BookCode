package builder;

public class SuperMan {

	private String body;
	
	private String specialTalent;
	
	private String specialSymbol;

	public String getBody() {
		
		System.out.println(this.body);
		
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getSpecialTalent() {
		
		System.out.println(this.specialTalent);
		
		return specialTalent;
	}

	public void setSpecialTalent(String specialTalent) {
		this.specialTalent = specialTalent;
	}

	public String getSpecialSymbol() {
		
		System.out.println(this.specialSymbol);
		
		return specialSymbol;
	}

	public void setSpecialSymbol(String specialSymbol) {
		this.specialSymbol = specialSymbol;
	}
	
}
