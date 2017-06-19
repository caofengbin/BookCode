package backup;

import multi.Originator;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		
		originator.setState1("中国");
		originator.setState2("强盛");
		originator.setState3("繁荣");
		System.out.println("-------初始化的状态001-------\n" + originator);
		
		caretaker.setMemento("001", originator.createMemento());
		
		originator.setState1("软件");
		originator.setState2("架构");
		originator.setState3("优秀");
		System.out.println("\n-----修改后的状态002-----\n" + originator);
		
		caretaker.setMemento("002", originator.createMemento());
		
		originator.setState1("美国");
		originator.setState2("倒霉");
		originator.setState3("完蛋");
		System.out.println("\n-----修改后的状态003-----\n" + originator);

		
		originator.restoreMemento(caretaker.getMemento("001"));
		System.out.println("\n------恢复到001的状态----\n" + originator);
		
		originator.restoreMemento(caretaker.getMemento("002"));
		System.out.println("\n------恢复到002的状态----\n" + originator);

	}

}
