package test;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Boy boy = new Boy();
		Originator originator = new Originator();
		//Caretaker caretaker = new Caretaker();
		
		originator.setState("��ʼ״̬...");
		System.out.println("��ʼ״̬��: " + originator.getState());
		
		originator.createMemento();
		
		originator.setState("�޸ĺ��״̬...");
		System.out.println("�޸ĺ��״̬�ǣ�" + originator.getState());
		
		originator.restoreMemento();
		System.out.println("�޸����״̬�ǣ�" + originator.getState());
		//originator.createMemento();
		//caretaker.setMemento(originator.createMemento());
		//originator.restoreMemento(caretaker.getMemento());
		//boy.setState("����ܰ���");
		//System.out.println("---------�к����ڵ�״̬--------");
		//System.out.println(boy.getState());
		
		//Memento mem = boy.createMemento();
		//caretaker.setMemento(boy.createMemento());
		
//		Boy backup = new Boy();
//		backup.setState(boy.getState());
		//boy.changeState();
		//System.out.println("\n--------�к�׷Ů���Ӻ��״̬---------");
		//System.out.println(boy.getState());
		
		//System.out.println("\n--------�к��ָ����״̬-------");
		//boy.restoreMemento(caretaker.getMemento());
		//System.out.println(boy.getState());
		

	}

}
