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
		info = "名称：" + this.name;
		info = info + "\t职位：" + this.position;
		info = info + "\t薪水：" + this.salary;
		
		return info;
		
	}

}
