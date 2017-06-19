package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println("--------H1型号悍马--------");
		System.out.println("H1型号的悍马是否需要喇叭声响？0-不需要  1—需要");
		
		
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
