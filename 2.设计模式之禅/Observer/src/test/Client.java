package test;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		LiSi liSi = new LiSi();
		HanFeiZi hanFeiZi = new HanFeiZi();
		
//		Spy watchBreakfast = new Spy(hanFeiZi, liSi, "breakfase");
//		watchBreakfast.start();
//		
//		Spy watchFun = new Spy(hanFeiZi, liSi, "fun");
//		watchFun.start();
//		
//		try {
//			Thread.sleep(10000);
			hanFeiZi.haveBreakfast();
			
//			Thread.sleep(10000);
			hanFeiZi.haveFun();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}
