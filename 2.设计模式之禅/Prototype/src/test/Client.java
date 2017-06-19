package test;

import java.util.Random;

public class Client {
	
	private static int MAX_COUNT = 6;
	
	public static void main(String[] args) {
		
		int i = 0;
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("XX银行版权所有");
		
		while( i < MAX_COUNT) {
			Mail cloneMail;
			try {
				cloneMail = (Mail)mail.clone();
				cloneMail.setAppellation(getRandString(5) + " 先生（女生）");
				cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
				sendMail(cloneMail);

			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			i ++;
		}
		
		Thing thing = new Thing();
		thing.setValue("张三");
		
		try {
			Thing cloneThing = thing.clone();
			cloneThing.setValue("李四");
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(thing.getValue());
		
	}
	
	public static void sendMail(Mail mail) {
		
		System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver() + "\t...发送成功！");
		
	}
	
	public static String getRandString(int maxLength) {
		
		String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuffer sb = new StringBuffer();
		
		Random rand = new Random();
		
		for(int i = 0; i < maxLength; i ++) {
			sb.append(source.charAt(rand.nextInt(source.length())));
		}
		
		return sb.toString();
	}

}
