package builder;

public class Director {

	private static Builder adultBuilder = new AdultSuperMan();
	
	private static Builder childBuilder = new ChildSuperMan();

	public static SuperMan getAdultSuperMan() {
		
		return adultBuilder.getSuprMan();
		
	}

	public static SuperMan getChildSuperMan() {
		
		return childBuilder.getSuprMan();
		
	}
	
}
