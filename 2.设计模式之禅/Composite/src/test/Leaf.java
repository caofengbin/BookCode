package test;

public class Leaf implements ILeaf {
	
	private String name = "";
	
	private String position = "";
	
	private int salary = 0;
	
	public Leaf(String name, String position, int salary) {
		
		this.name = name;
		this.position = position;
		this.salary = salary;
		
	}

	public String getInfo() {
		
		String info = "";
		info = "���ƣ�" + this.name;
		info = info + "\tְλ��" + this.position;
		info = info + "\tнˮ��" + this.salary;
		
		return info;

	}

}
