package test;

public class BMWModel extends CarModel {

	@Override
	protected void alarm() {
		System.out.println("BMW��������������������ӵ�...");
		
	}

	@Override
	protected void egineBoom() {
		System.out.println("BMW�������������������...");
		
	}

	@Override
	protected void start() {
		System.out.println("BMW���������������ӵ�...");
		
	}

	@Override
	protected void stop() {
		System.out.println("BMW��Ӧ������ͣ��...");
		
	}

}
