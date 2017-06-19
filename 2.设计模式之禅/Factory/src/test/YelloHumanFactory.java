package test;

public class YelloHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuaman() {
		// TODO Auto-generated method stub
		return new AbstractYelloHuman();
	}
	
}
