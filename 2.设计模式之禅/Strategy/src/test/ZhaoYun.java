package test;

public class ZhaoYun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Context context;
		System.out.println("-----�ոյ������ʱ����һ��-----");
		context = new Context(new BackDoor());
		context.operate();
		System.out.println();
		
		System.out.println("-----�����ֲ�˼���ˣ���ڶ���-----");
		context = new Context(new GivenGreenLight());
		context.operate();
		System.out.println();
		
		System.out.println("------��Ȩ��С��׷�ˣ�զ�죿�������----");
		context = new Context(new BlockEnemy());
		context.operate();
		
	}

}
