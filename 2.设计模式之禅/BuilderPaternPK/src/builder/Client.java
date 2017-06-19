package builder;

public class Client {

	public static void main(String[] args) {
		
		SuperMan adultSuperMan = Director.getAdultSuperMan();
		adultSuperMan.getSpecialTalent();
		adultSuperMan.getBody();
		adultSuperMan.getSpecialSymbol();

	}

}
