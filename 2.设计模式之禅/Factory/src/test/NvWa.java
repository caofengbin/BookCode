package test;

public class NvWa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		AbstractHumanFactory yinYangLu = new HumanFactory();
		
//		System.out.println("---造成的第一批人是黑种人---");
//		Human whiteHuman = new BlackHumanFactory().createHuaman();
//		whiteHuman.getColor();
//		whiteHuman.talk();
//		
//		System.out.println("---造出的第三批人是黄色人种---");
//		Human yelloHuman = new YelloHumanFactory().createHuaman();
//		yelloHuman.getColor();
//		yelloHuman.talk();
		// 第一条生产线
		HumanFactory maleHumanFactory = new MaleFactory();		
		HumanFactory femaleHumanFactory = new FemaleFactory();
		
		// 第二条生产线
		Human maleYellowHuman = maleHumanFactory.createYelloHuman();
		Human femaleYellowHuman = femaleHumanFactory.createYelloHuman();
		
		System.out.println("------生产一个黄色女性------");
		femaleYellowHuman.getColor();
		femaleYellowHuman.talk();
		femaleYellowHuman.getSex();
		
		System.out.println("\n------生产一个黄色男性------");
		maleYellowHuman.getColor();
		maleYellowHuman.talk();
		maleYellowHuman.getSex();

	}

}
