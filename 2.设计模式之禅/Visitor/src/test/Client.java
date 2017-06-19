package test;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		
		for(Employee emp : mockEmployee()) {
			
			emp.report();
		}
		
	}
	
	public static List<Employee> mockEmployee() {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		CommonEmployee zhangSan = new CommonEmployee();
		zhangSan.setJob("��дJava����,���Ե����졢�๤�Ӱ��˹�");
		zhangSan.setName("����");
		zhangSan.setSalary(1800);
		zhangSan.setSex(Employee.MALE);
		empList.add(zhangSan);
		
		CommonEmployee liSi = new CommonEmployee();
		liSi.setJob("ҳ����������������̫�������ˣ�");
		liSi.setName("����");
		liSi.setSalary(1900);
		liSi.setSex(Employee.MALE);
		empList.add(liSi);
		
		Manager wangWu = new Manager();
		wangWu.setName("����");
		wangWu.setPerformance("�������Ǹ�ֵ�������һ�����ƨѽ");
		wangWu.setSalary(18750);
		wangWu.setSex(Employee.MALE);
		empList.add(wangWu);
		
		return empList;
		
	}
	
}
