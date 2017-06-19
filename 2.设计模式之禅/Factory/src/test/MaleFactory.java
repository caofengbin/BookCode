package test;

public class MaleFactory implements HumanFactory {

	public Human createBlackHuman() {

		return new MaleBlackHuman();
	}

	public Human createWhiteHuman() {
		// TODO Auto-generated method stub
		return null;
	}

	public Human createYelloHuman() {
		// TODO Auto-generated method stub
		return new MaleYellowHuman();
	}
	
}
