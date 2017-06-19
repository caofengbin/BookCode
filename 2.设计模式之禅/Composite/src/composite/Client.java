package composite;

import java.util.ArrayList;

public class Client {
	
	public static void main(String[] args) {
		
		Branch ceo = (Branch)compositeCorpTree();
		
		System.out.println(ceo.getInfo());
		System.out.println(getTreeInfo(ceo));
		
	}
	
	public static IBranch compositeCorpTree() {
		
		IBranch ceo = new Branch("王大麻子", "总经理", 1000000);
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
		ceo.addSubordinate(developDep);
		ceo.addSubordinate(salesDep);
		ceo.addSubordinate(financeDep);
		
		ceo.addSubordinate(k);
		
		developDep.addSubordinate(firstDevGroup);
		developDep.addSubordinate(secondDevGroup);
		developDep.addSubordinate(zhengLaoLiu);
		
		firstDevGroup.addSubordinate(a);
		firstDevGroup.addSubordinate(b);
		firstDevGroup.addSubordinate(c);
		firstDevGroup.addSubordinate(d);
		firstDevGroup.addSubordinate(e);
		firstDevGroup.addSubordinate(f);
		firstDevGroup.addSubordinate(g);
		
		secondDevGroup.addSubordinate(h);
		salesDep.addSubordinate(i);
		financeDep.addSubordinate(j);
		financeDep.addSubordinate(k);
		
		return ceo;

	}
	
	public static String getTreeInfo(Branch root) {
		
		ArrayList<ICorp> subordinateList = root.getSubordinate();
		String info = "";
		
		for(ICorp s : subordinateList) {
			
			if(s instanceof Leaf) {
				
				info = info + s.getInfo() + "\n";
				
			} else {
				
				info = info + s.getInfo() + "\n" + getTreeInfo((Branch)s);
				
			}
			
		}
		
		return info;
		
	}
	
}
