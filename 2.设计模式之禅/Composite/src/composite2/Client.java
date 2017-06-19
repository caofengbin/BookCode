package composite2;

import java.util.ArrayList;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Branch ceo = (Branch)compositeCorpTree();
		
		System.out.println(ceo.getInfo());
		System.out.println(getTreeInfo(ceo));

	}
	
	public static Branch compositeCorpTree() {
		
		Branch ceo = new Branch("��������", "�ܾ���", 1000000);
		Branch developDep = new Branch("����ȳ��", "�з����ž���", 100000);
		Branch salesDep = new Branch("�������","���۲��ž���", 20000);
		Branch financeDep = new Branch("��������","���񲿾���", 30000);
		
		Branch firstDevGroup = new Branch("����Ь��", "����һ���鳤", 5000); 
		Branch secondDevGroup = new Branch("�����", "���������鳤", 6000);
		
		Leaf a = new Leaf("a", "������Ա", 2000);
		Leaf b = new Leaf("b", "������Ա", 2000);
		Leaf c = new Leaf("c", "������Ա", 2000);
		Leaf d = new Leaf("d", "������Ա", 2000);
		Leaf e = new Leaf("e", "������Ա", 2000);
		Leaf f = new Leaf("f", "������Ա", 2000);
		Leaf g = new Leaf("g", "������Ա", 2000);
		Leaf h = new Leaf("h", "������Ա", 2000);
		Leaf i = new Leaf("i", "������Ա", 2000);
		Leaf j = new Leaf("j", "������Ա", 2000);
		Leaf k = new Leaf("k", "CEO����", 8000);
		
		Leaf zhengLaoLiu = new Leaf("֣����", "�з�������", 20000);
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
		
		return ceo;

	}

	
	public static String getTreeInfo(Branch root) {
		
		ArrayList<Corp> subordinateList = root.getSubordinate();
		String info = "";
		
		for(Corp s : subordinateList) {
			
			if(s instanceof Leaf) {
				
				info = info + s.getInfo() + "\n";
				
			} else {
				
				info = info + s.getInfo() + "\n" + getTreeInfo((Branch)s);
				
			}
			
		}
		
		return info;
		
	}

}
