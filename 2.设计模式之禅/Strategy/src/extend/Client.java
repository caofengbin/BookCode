package extend;

import java.util.Arrays;

public class Client {

	public static void main(String[] args) {
		
		int a = Integer.parseInt("1");
		String symbol = args[1];
		
		int b = Integer.parseInt("3");
		System.out.println("输入的参数为：" + Arrays.toString(args));
		
		Caculator cal = new Caculator();
		System.out.println("运行结果为：" + a + symbol + b + "=" + cal.exec(a, b, symbol));
		
	}
	
}
