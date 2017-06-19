package test;

import java.util.ArrayList;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		IRoot ceo = new Root("王大麻子", "总经理", 1000000);
		IBranch developDep = new Branch("刘大瘸子", "研发部门经理", 100000);
		IBranch salesDep = new Branch("马儿拐子","销售部门经理", 20000);
		IBranch financeDep = new Branch("赵三驼子","财务部经理", 30000);
		
		IBranch firstDevGroup = new Branch("杨三鞋子", "开发一组组长", 5000); 
		IBranch secondDevGroup = new Branch("五大棒槌", "开发二组组长", 6000);
		
		ILeaf a = new Leaf("a", "开发人员", 2000);
		ILeaf b = new Leaf("b", "开发人员", 2000);
		ILeaf c = new Leaf("c", "开发人员", 2000);
		ILeaf d = new Leaf("d", "开发人员", 2000);
		ILeaf e = new Leaf("e", "开发人员", 2000);
		ILeaf f = new Leaf("f", "开发人员", 2000);
		ILeaf g = new Leaf("g", "开发人员", 2000);
		ILeaf h = new Leaf("h", "开发人员", 2000);
		ILeaf i = new Leaf("i", "开发人员", 2000);
		ILeaf j = new Leaf("j", "开发人员", 2000);
		ILeaf k = new Leaf("k", "CEO秘书", 8000);
		
		ILeaf zhengLaoLiu = new Leaf("郑老六", "研发部副总", 20000);
		ceo.add(developDep);
		ceo.add(salesDep);
		ceo.add(financeDep);
		
		ceo.add(k);
		
		developDep.add(firstDevGroup);
		developDep.add(secondDevGroup);
		developDep.add(zhengLaoLiu);
		
		firstDevGroup.add(a);
		firstDevGroup.add(b);
		firstDevGroup.add(c);
		firstDevGroup.add(d);
		firstDevGroup.add(e);
		firstDevGroup.add(f);
		firstDevGroup.add(g);
		
		secondDevGroup.add(h);
		salesDep.add(i);
		financeDep.add(j);
		financeDep.add(k);
		
		System.out.println(ceo.getInfo());
		getAllSubordinateInfo(ceo.getSubordinateInfo());
		
	}
	
	private static void getAllSubordinateInfo(ArrayList subordinateList) {
		
		int length = subordinateList.size();
		
		for(int m = 0; m < length; m ++) {
			Object s = subordinateList.get(m);
			
			if( s instanceof Leaf ) {
				
				ILeaf employee = (Leaf)s;
				System.out.println(((Leaf)s).getInfo());
				
			} else {
				
				IBranch branch = (IBranch)s;
				System.out.println(branch.getInfo());
				
				getAllSubordinateInfo(branch.getSubordinateInfo());
				
			}
		}
		
	}

}
