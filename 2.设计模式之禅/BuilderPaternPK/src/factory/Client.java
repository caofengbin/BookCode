package factory;

public class Client {

	public static void main(String[] args) {
		
		ISuperMan adultSuperMan = SuperManFactory.createSuperMan("adult");
		adultSuperMan.specialTalent();

	}

}
