package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println("--------H1�ͺź���--------");
		System.out.println("H1�ͺŵĺ����Ƿ���Ҫ�������죿0-����Ҫ  1����Ҫ");
		
		
		try {
			Humer1Model h1 = new Humer1Model();		
			Humer2Model h2 = new Humer2Model();

			String type = new BufferedReader(new InputStreamReader(System.in)).readLine();
			if (type.equals("1")) {
				h1.setAlarmFlag(true);
			}
			
			h1.run();
			h2.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
