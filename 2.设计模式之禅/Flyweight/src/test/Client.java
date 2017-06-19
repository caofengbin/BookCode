package test;

public class Client {
	
	public static void main(String[] args) {
		
		SignInfoFactory.getSignInfo("subject 1");
		SignInfoFactory.getSignInfo("subject 2");
		SignInfoFactory.getSignInfo("subject 3");
		SignInfoFactory.getSignInfo("subject 4");
		
		SignInfo signInfo = SignInfoFactory.getSignInfo("subject 2");
		
		while(true) {
			signInfo.setId("ZhangSan");
			signInfo.setLocation("ZhangSan");
			
			new MultiThread(signInfo).start();
			
			signInfo.setId("LiSi");
			signInfo.setLocation("LiSi");
			new MultiThread(signInfo).start();
			
			for(int i = 0; i < 100; i ++) {
				signInfo.setId("LiSi " + i);
				signInfo.setLocation("LiSi " + i);
				new MultiThread(signInfo).start();
			}
		}
		
		//SignInfo signInfo = SignInfoFactory.getSignInfo();
//		for(int i = 0; i < 4; i ++) {
//			String subject = "subject " + i;
//			for(int j = 0; j < 30; j ++) {
//				String key = subject + " location " + j;
//				SignInfoFactory.getSignInfo(key);
//			}
//		}
//		SignInfo signInfo = SignInfoFactory.getSignInfo("subject 1 location 1");
	}
}
