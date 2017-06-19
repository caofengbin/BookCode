package test;

public class Humer2Model extends HumerModel {
	
	@Override
	public void alarm() {
		
		System.out.println("悍马H2鸣笛...");
	}

	@Override
	public void engineBoom() {
		
		System.out.println("悍马H2引擎声是这样的...");
	}

	@Override
	public void start() {
		
		System.out.println("悍马H2发动...");
	}

	@Override
	public void stop() {
		
		System.out.println("悍马H2停车...");
	}
	
	public boolean isAlarm() {
		
		return false;
	}

}
