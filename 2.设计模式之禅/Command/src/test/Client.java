package test;

public class Client {

	public static void main(String[] args) {
		
		Invoker xiaoSan = new Invoker();
		
		System.out.println("---------�ͻ�Ҫ��ɾ��һ��ҳ��---------");
		Command command = new AddRequirementCommand();
		xiaoSan.setcommand(command);
		xiaoSan.action();
		
		System.out.println("\n---------�ͻ�Ҫ������һ������---------");
		command = new DeletePageCommand();
		xiaoSan.setcommand(command);
		xiaoSan.action();
		
	}
	
}
