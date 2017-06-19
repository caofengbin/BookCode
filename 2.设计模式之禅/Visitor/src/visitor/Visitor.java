package visitor;

public class Visitor implements IVisitor {
	
	private final static int MANAGER_CONEFFICIENT = 1;
	
	private final static int COMMONEMPLOYEE_CONEFICIENT = 1;
	
	private int commonTotalSalary = 0;
	
	private int managerTotalSalary = 0;

	public void visit(CommonEmployee commonEmployee) {
		
		this.calCommonSalary(commonEmployee.getSalary());
		System.out.println(this.getCommonEmployee(commonEmployee));
	}

	public void visit(Manager manager) {
		
		this.calManagerSalary(manager.getSalary());
		System.out.println(this.getManagerInfo(manager));
	}

	public int getTotalSalary() {
		
		return this.commonTotalSalary + this.managerTotalSalary;
	}
	
	private String getBasicInfo(Employee employee) {
		
		String info = "姓名：" + employee.getName() + "\t";
		info = info + "性别：" + (employee.getSex() == Employee.FEMALE ? "女":"男") + "\t";
		info = info + "薪水：" + employee.getSalary() + "\t";

		return info;
	}
	
	private String getCommonEmployee(CommonEmployee commonEmployee) {
		
		String basicInfo = this.getBasicInfo(commonEmployee);
		String otherInfo = "工作：" + commonEmployee.getJob() + "\t";
		
		return basicInfo + otherInfo;
		
	}
	
	private String getManagerInfo(Manager manager) {
		
		String basicInfo = this.getBasicInfo(manager);
		String otherInfo = "工作：" + manager.getPerformance() + "\t";
		
		return basicInfo + otherInfo;
		
	}
	
	private void calCommonSalary(int salary) {
		
		this.managerTotalSalary = this.managerTotalSalary + salary*this.MANAGER_CONEFFICIENT;
		
	}
	
	private void calManagerSalary(int salary) {
		
		this.commonTotalSalary = this.commonTotalSalary + salary*this.COMMONEMPLOYEE_CONEFICIENT;
	}

}
