package test;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Boy boy = new Boy();
		Originator originator = new Originator();
		//Caretaker caretaker = new Caretaker();
		
		originator.setState("初始状态...");
		System.out.println("初始状态是: " + originator.getState());
		
		originator.createMemento();
		
		originator.setState("修改后的状态...");
		System.out.println("修改后的状态是：" + originator.getState());
		
		originator.restoreMemento();
		System.out.println("修复后的状态是：" + originator.getState());
		//originator.createMemento();
		//caretaker.setMemento(originator.createMemento());
		//originator.restoreMemento(caretaker.getMemento());
		//boy.setState("心情很棒！");
		//System.out.println("---------男孩现在的状态--------");
		//System.out.println(boy.getState());
		
		//Memento mem = boy.createMemento();
		//caretaker.setMemento(boy.createMemento());
		
//		Boy backup = new Boy();
//		backup.setState(boy.getState());
		//boy.changeState();
		//System.out.println("\n--------男孩追女孩子后的状态---------");
		//System.out.println(boy.getState());
		
		//System.out.println("\n--------男孩恢复后的状态-------");
		//boy.restoreMemento(caretaker.getMemento());
		//System.out.println(boy.getState());
		

	}

}
