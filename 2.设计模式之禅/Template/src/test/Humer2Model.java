package test;

public class Humer2Model extends HumerModel {
	
	@Override
	public void alarm() {
		
		System.out.println("����H2����...");
	}

	@Override
	public void engineBoom() {
		
		System.out.println("����H2��������������...");
	}

	@Override
	public void start() {
		
		System.out.println("����H2����...");
	}

	@Override
	public void stop() {
		
		System.out.println("����H2ͣ��...");
	}
	
	public boolean isAlarm() {
		
		return false;
	}

}
