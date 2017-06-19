package multi;

public class Client {

	public static void main(String[] args) {
		
		Originator originator = new Originator();
		Caretaker caretaker =  new Caretaker();
		
		originator.setState1("�й�");
		originator.setState2("ǿʢ");
		originator.setState3("����");
		System.out.println("-------��ʼ����״̬-------\n" + originator);
		
		caretaker.setMemento(originator.createMemento());
		
		originator.setState1("���");
		originator.setState2("�ܹ�");
		originator.setState3("����");
		
		System.out.println("\n-----�޸ĺ��״̬-----\n" + originator);
		originator.restoreMemento(caretaker.getMemento());
		
		System.out.println("\n-------�ָ����״̬-------\n" + originator);
		
	}
	
}
