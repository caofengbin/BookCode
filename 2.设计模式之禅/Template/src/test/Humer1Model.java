package test;

public class Humer1Model extends HumerModel {
	
	private boolean alarmFlag ;

	@Override
	public void alarm() {
		
		System.out.println("����H1����...");
	}

	@Override
	public void engineBoom() {
		
		System.out.println("����H1��������������...");
	}

	@Override
	public void start() {
		
		System.out.println("����H1����...");
	}

	@Override
	public void stop() {
		
		System.out.println("����H1ͣ��...");
	}
	
	public boolean isAlarm() {
		
		return this.alarmFlag;
	}

	public void setAlarmFlag(boolean alarmFlag) {
		this.alarmFlag = alarmFlag;
	}

}
