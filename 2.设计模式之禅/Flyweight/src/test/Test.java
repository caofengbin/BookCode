package test;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "Harmony";
		String str2 = "Social";
		String str3 = "HarmonySocial";
		String str4;
		str4 = str1 + str2;
		System.out.println(str3 == str4);
		str4 = (str1 + str2).intern();
		System.out.println(str3 == str4);
	}

}
