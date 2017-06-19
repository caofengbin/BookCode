package test;

public class LetterProcess implements ILetterProcess {

	public void fillEnvelope(String address) {
		
		System.out.println("填写收件人的地址及姓名..." + address );
	}

	public void letterIntoEnvelope() {
		
		System.out.println("把信放入信封中...");
	}

	public void sendLetter() {

		System.out.println("邮寄信件...");
	}

	public void writeContext(String context) {
		
		System.out.println("填写信的内容..." + context);
	}

}
