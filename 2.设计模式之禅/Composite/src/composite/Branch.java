package composite;

import java.util.ArrayList;

public class Branch implements IBranch {
	
	private ArrayList<ICorp> subordinateList = new ArrayList<ICorp>();
	
	private String name = "";
	
	private String position = "";
	
	private int salary = 0;
	
	public Branch(String name, String position, int salary) {
		
		this.name = name;
		this.position = position;
		this.salary = salary;
		
	}

	public void addSubordinate(ICorp corp) {
		
		this.subordinateList.add(corp);
		
	}

	public ArrayList<ICorp> getSubordinate() {
		
		return this.subordinateList;
	}

	public String getInfo() {
		
		String info = "";
		info = "���ƣ�" + this.name;
		info = info + "\tְλ��" + this.position;
		info = info + "\tнˮ��" + this.salary;
		
		return info;
		
	}

}
