package test;

public class NvWa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		AbstractHumanFactory yinYangLu = new HumanFactory();
		
//		System.out.println("---��ɵĵ�һ�����Ǻ�����---");
//		Human whiteHuman = new BlackHumanFactory().createHuaman();
//		whiteHuman.getColor();
//		whiteHuman.talk();
//		
//		System.out.println("---����ĵ��������ǻ�ɫ����---");
//		Human yelloHuman = new YelloHumanFactory().createHuaman();
//		yelloHuman.getColor();
//		yelloHuman.talk();
		// ��һ��������
		HumanFactory maleHumanFactory = new MaleFactory();		
		HumanFactory femaleHumanFactory = new FemaleFactory();
		
		// �ڶ���������
		Human maleYellowHuman = maleHumanFactory.createYelloHuman();
		Human femaleYellowHuman = femaleHumanFactory.createYelloHuman();
		
		System.out.println("------����һ����ɫŮ��------");
		femaleYellowHuman.getColor();
		femaleYellowHuman.talk();
		femaleYellowHuman.getSex();
		
		System.out.println("\n------����һ����ɫ����------");
		maleYellowHuman.getColor();
		maleYellowHuman.talk();
		maleYellowHuman.getSex();

	}

}
