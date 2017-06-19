package test;

import java.util.HashMap;

public class SignInfoFactory {
	
	private static HashMap<String, SignInfo> pool = new HashMap<String, SignInfo>();
	
	public static SignInfo getSignInfo(String key) {
		SignInfo result = null;
		if (!pool.containsKey(key)) {
			System.out.println(key + "---new Object put it in the pool");
			//result = new SignInfo4Pool(key);
			result = new SignInfo();
			pool.put(key, result);
		} else {
			result = pool.get(key);
			System.out.println(key + "---Obtain it from the pool");
		}
		
		return result;
	}
	
	@Deprecated
	public static SignInfo getSignInfo() {
		return  new SignInfo();
	}
}
