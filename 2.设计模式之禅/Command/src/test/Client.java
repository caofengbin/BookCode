package test;

public class Client {

	public static void main(String[] args) {
		
		Invoker xiaoSan = new Invoker();
		
		System.out.println("---------客户要求删除一个页面---------");
		Command command = new AddRequirementCommand();
		xiaoSan.setcommand(command);
		xiaoSan.action();
		
		System.out.println("\n---------客户要求增加一个功能---------");
		command = new DeletePageCommand();
		xiaoSan.setcommand(command);
		xiaoSan.action();
		
	}
	
}
