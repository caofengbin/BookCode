package test;

public class PageGroup extends Group {

	@Override
	public void add() {
		
		System.out.println("�ͻ�Ҫ������һ��ҳ��...");
		
	}

	@Override
	public void change() {
		
		System.out.println("�ͻ�Ҫ���޸�һ��ҳ��...");
		
	}

	@Override
	public void delete() {

		System.out.println("�ͻ�Ҫ��ɾ��һ��ҳ��...");
		
	}

	@Override
	public void find() {

		System.out.println("�ҵ�������...");
		
	}

	@Override
	public void plan() {
		
		System.out.println("�ͻ�ҳ�����ƻ�...");
		
	}

}
