package test;

public class LetterProcess implements ILetterProcess {

	public void fillEnvelope(String address) {
		
		System.out.println("��д�ռ��˵ĵ�ַ������..." + address );
	}

	public void letterIntoEnvelope() {
		
		System.out.println("���ŷ����ŷ���...");
	}

	public void sendLetter() {

		System.out.println("�ʼ��ż�...");
	}

	public void writeContext(String context) {
		
		System.out.println("��д�ŵ�����..." + context);
	}

}
