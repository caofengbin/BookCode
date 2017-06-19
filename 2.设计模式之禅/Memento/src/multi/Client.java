package multi;

public class Client {

	public static void main(String[] args) {
		
		Originator originator = new Originator();
		Caretaker caretaker =  new Caretaker();
		
		originator.setState1("中国");
		originator.setState2("强盛");
		originator.setState3("繁荣");
		System.out.println("-------初始化的状态-------\n" + originator);
		
		caretaker.setMemento(originator.createMemento());
		
		originator.setState1("软件");
		originator.setState2("架构");
		originator.setState3("优秀");
		
		System.out.println("\n-----修改后的状态-----\n" + originator);
		originator.restoreMemento(caretaker.getMemento());
		
		System.out.println("\n-------恢复后的状态-------\n" + originator);
		
	}
	
}
