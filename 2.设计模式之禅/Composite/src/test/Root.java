package test;

import java.util.ArrayList;

public class Root implements IRoot {
	
	private ArrayList subordinateList = new ArrayList();
	
	private String name = "";
	
	private String position = "";
	
	private int salary = 0;
	
	public Root(String name, String position, int salary) {
		
		this.name = name;
		this.position = position;
		this.salary = salary;
		
	}

	public void add(IBranch branch) {

		this.subordinateList.add(branch);
		
	}

	public void add(ILeaf leaf) {

		this.subordinateList.add(leaf);
		
	}

	public String getInfo() {

		String info = "";
		info = "名称：" + this.name;
		info = info + "\t职位：" +this.position;
		info = info + "\t薪水：" +this.salary;

		return info;
	}

	public ArrayList<?> getSubordinateInfo() {
		
		return this.subordinateList;
	}

}
