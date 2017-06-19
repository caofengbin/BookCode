package backup;

import multi.Originator;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		
		originator.setState1("�й�");
		originator.setState2("ǿʢ");
		originator.setState3("����");
		System.out.println("-------��ʼ����״̬001-------\n" + originator);
		
		caretaker.setMemento("001", originator.createMemento());
		
		originator.setState1("���");
		originator.setState2("�ܹ�");
		originator.setState3("����");
		System.out.println("\n-----�޸ĺ��״̬002-----\n" + originator);
		
		caretaker.setMemento("002", originator.createMemento());
		
		originator.setState1("����");
		originator.setState2("��ù");
		originator.setState3("�군");
		System.out.println("\n-----�޸ĺ��״̬003-----\n" + originator);

		
		originator.restoreMemento(caretaker.getMemento("001"));
		System.out.println("\n------�ָ���001��״̬----\n" + originator);
		
		originator.restoreMemento(caretaker.getMemento("002"));
		System.out.println("\n------�ָ���002��״̬----\n" + originator);

	}

}
