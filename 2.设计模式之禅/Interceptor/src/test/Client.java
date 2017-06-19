package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Client {

	public static void main(String[] args) {
		
		String expStr = getExpStr();
		HashMap<String, Integer> var = getValue(expStr);
		
		Calculator cal = new Calculator(expStr);
		
		System.out.println("运算结果为：" + expStr + "=" + cal.run(var));
		
	}
	
	public static String getExpStr() {
		
		try {
			System.out.print("请输入表达式：");
			
			return (new BufferedReader(new InputStreamReader(System.in))).readLine();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null;
		
	}
	
	public static HashMap<String, Integer> getValue(String expStr) {
		System.out.println("execute getValue(String expStr)");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(char ch: expStr.toCharArray()) {
			
			if(ch != '+' && ch != '-') {
				
				if(!map.containsKey(String.valueOf(ch))) {
							
					try {
						System.out.print("请输入" + ch + "的值：");
						String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
					
						map.put(String.valueOf(ch), Integer.valueOf(in));
				
					} catch (NumberFormatException e) {
					
						e.printStackTrace();
				
					} catch (IOException e) {
					
						e.printStackTrace();
				
					}
			
				}
				
			}
			
			
		}
		
		System.out.println("exit getValue(String expStr)");
		
		return map;
		
	}
	
}
