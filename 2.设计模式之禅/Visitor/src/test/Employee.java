package test;

public abstract class Employee {
	
	public final static int MALE = 0;
	
	public final static int FEMALE = 1;
	
	private String name;
	
	private int salary;
	
	private int sex;
	
	public final void report() {
		
		String info = "������" + this.name + "\t";
		info = info + "�Ա�" + (this.sex == FEMALE ? "Ů":"��") + "\t";
		info = info + "нˮ��" + this.salary + "\t";
		info = info + this.getOtherInfo();
		
		System.out.println(info);
		
	}
	
	protected abstract String getOtherInfo();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}
	
}
