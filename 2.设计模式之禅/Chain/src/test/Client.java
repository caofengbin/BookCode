package test;

import java.util.ArrayList;
import java.util.Random;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Random rand = new Random();
		ArrayList<IWomen> arrayList = new ArrayList<IWomen>();
		
		for(int i = 0; i < 5; i ++) {
			arrayList.add(new Women(rand.nextInt(3),"我要出去逛街"));
		}
		
		Handler father = new Father();
		Handler husband = new Husband();
		Handler son = new Son();
		
		father.setNext(husband);
		husband.setNext(son);
		
		for(IWomen women : arrayList) {
			
//			if(women.getType() == 1) {
//				
//				System.out.println("\n--------女儿向父亲请示--------");
//				father.handleMessage(women);
//				
//			} else if (women.getType() == 2) {
//				
//				System.out.println("\n--------妻子向丈夫请示--------");
//				husband.handleMessage(women);
//				
//			} else if (women.getType() == 3) {
//				
//				System.out.println("\n--------母亲向儿子请示--------");
//				son.handleMessage(women);
//				
//			} else {
//				
//			}
//		}
			father.handleMessage(women);
		}
	}

}
