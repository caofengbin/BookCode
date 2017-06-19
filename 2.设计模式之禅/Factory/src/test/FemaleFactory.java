package test;

public class FemaleFactory implements HumanFactory {

	public Human createBlackHuman() {

		return new FemaleBlackHuman();
	}

	public Human createWhiteHuman() {

		return null;
	}

	public Human createYelloHuman() {

		return new FemaleYelloHuman();
	}

}
