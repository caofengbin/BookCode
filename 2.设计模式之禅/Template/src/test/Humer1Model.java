package test;

public class Humer1Model extends HumerModel {
	
	private boolean alarmFlag ;

	@Override
	public void alarm() {
		
		System.out.println("悍马H1鸣笛...");
	}

	@Override
	public void engineBoom() {
		
		System.out.println("悍马H1引擎声是这样的...");
	}

	@Override
	public void start() {
		
		System.out.println("悍马H1发动...");
	}

	@Override
	public void stop() {
		
		System.out.println("悍马H1停车...");
	}
	
	public boolean isAlarm() {
		
		return this.alarmFlag;
	}

	public void setAlarmFlag(boolean alarmFlag) {
		this.alarmFlag = alarmFlag;
	}

}
