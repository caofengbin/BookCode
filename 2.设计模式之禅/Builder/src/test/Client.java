package test;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
//		BenzModel benz = new BenzModel();
//		ArrayList<String> sequence = new ArrayList<String> ();
//		sequence.add("engine boom");
//		sequence.add("start");
//		sequence.add("alarm");
//		sequence.add("stop");
//		
//		BenzBuilder benzBuilder = new BenzBuilder();
//		benzBuilder.setSequence(sequence);
//		BenzModel benz = (BenzModel) benzBuilder.getCarModel();
//		
//		benz.run();
//		
//		BMWBuilder bmwBuilder = new BMWBuilder();
//		bmwBuilder.setSequence(sequence);
//		BMWModel bmw = (BMWModel)bmwBuilder.getCarModel();
//		bmw.run();
		Director director = new Director();
		
//		for(int i = 0; i < 10; i ++) {
//			System.out.println();
//			System.out.println("-------A sequence------");
//			director.getABenzModel().run();
//		}
//		
//		for (int i = 0; i < 10; i ++) {
//			System.out.println();
//			System.out.println("-------B sequence------");
//			director.getBBenzModel().run();
//		}
//		
//		for (int i = 0; i < 10; i ++) {
//			System.out.println();
//			System.out.println("-------A sequence------");
//			director.getBBenzModel().run();
//		}
//		
//		for (int i = 0; i < 10; i ++) {
//			System.out.println();
//			System.out.println("-------B sequence------");
//			director.getBBMWModel().run();
//		}
		batchProduce(director.getABenzModel());
		batchProduce(director.getBBenzModel());
		batchProduce(director.getABMWModel());
		batchProduce(director.getBBMWModel());
	}
	
	private static void batchProduce(CarModel carModel) {
		System.out.println();
		System.out.println("-------B sequence------");
		carModel.run();
	}
}
