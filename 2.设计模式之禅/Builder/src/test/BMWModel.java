package test;

public class BMWModel extends CarModel {

	@Override
	protected void alarm() {
		System.out.println("BMW车的喇叭声音是这个样子的...");
		
	}

	@Override
	protected void egineBoom() {
		System.out.println("BMW车的引擎是这个声音的...");
		
	}

	@Override
	protected void start() {
		System.out.println("BMW车跑起来是这样子的...");
		
	}

	@Override
	protected void stop() {
		System.out.println("BMW车应该这样停车...");
		
	}

}
