package test;

public class BenzModel extends CarModel {

	@Override
	protected void alarm() {
		System.out.println("���۳�������������������ӵ�...");
		
	}

	@Override
	protected void egineBoom() {
		System.out.println("���۳������������������...");
		
	}

	@Override
	protected void start() {
		System.out.println("���۳��������������ӵ�...");
		
	}

	@Override
	protected void stop() {
		System.out.println("���۳�Ӧ������ͣ��...");
		
	}

}
