package test;

import java.util.Random;

public class Client {
	
	private static int MAX_COUNT = 6;
	
	public static void main(String[] args) {
		
		int i = 0;
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("XX���а�Ȩ����");
		
		while( i < MAX_COUNT) {
			Mail cloneMail;
			try {
				cloneMail = (Mail)mail.clone();
				cloneMail.setAppellation(getRandString(5) + " ������Ů����");
				cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
				sendMail(cloneMail);

			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			i ++;
		}
		
		Thing thing = new Thing();
		thing.setValue("����");
		
		try {
			Thing cloneThing = thing.clone();
			cloneThing.setValue("����");
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(thing.getValue());
		
	}
	
	public static void sendMail(Mail mail) {
		
		System.out.println("���⣺" + mail.getSubject() + "\t�ռ��ˣ�" + mail.getReceiver() + "\t...���ͳɹ���");
		
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
