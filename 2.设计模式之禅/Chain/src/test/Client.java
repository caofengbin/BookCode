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
			arrayList.add(new Women(rand.nextInt(3),"��Ҫ��ȥ���"));
		}
		
		Handler father = new Father();
		Handler husband = new Husband();
		Handler son = new Son();
		
		father.setNext(husband);
		husband.setNext(son);
		
		for(IWomen women : arrayList) {
			
//			if(women.getType() == 1) {
//				
//				System.out.println("\n--------Ů��������ʾ--------");
//				father.handleMessage(women);
//				
//			} else if (women.getType() == 2) {
//				
//				System.out.println("\n--------�������ɷ���ʾ--------");
//				husband.handleMessage(women);
//				
//			} else if (women.getType() == 3) {
//				
//				System.out.println("\n--------ĸ���������ʾ--------");
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
