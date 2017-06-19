package test;

public class BlackHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuaman() {

		return new AbstractBlackHuman();
	}

}
