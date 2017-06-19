package composite;

import java.util.ArrayList;

public class Client {
	
	public static void main(String[] args) {
		
		Branch ceo = (Branch)compositeCorpTree();
		
		System.out.println(ceo.getInfo());
		System.out.println(getTreeInfo(ceo));
		
	}
	
	public static IBranch compositeCorpTree() {
		
		IBranch ceo = new Branch("��������", "�ܾ���", 1000000);
		IBranch developDep = new Branch("����ȳ��", "�з����ž���", 100000);
		IBranch salesDep = new Branch("�������","���۲��ž���", 20000);
		IBranch financeDep = new Branch("��������","���񲿾���", 30000);
		
		IBranch firstDevGroup = new Branch("����Ь��", "����һ���鳤", 5000); 
		IBranch secondDevGroup = new Branch("�����", "���������鳤", 6000);
		
		ILeaf a = new Leaf("a", "������Ա", 2000);
		ILeaf b = new Leaf("b", "������Ա", 2000);
		ILeaf c = new Leaf("c", "������Ա", 2000);
		ILeaf d = new Leaf("d", "������Ա", 2000);
		ILeaf e = new Leaf("e", "������Ա", 2000);
		ILeaf f = new Leaf("f", "������Ա", 2000);
		ILeaf g = new Leaf("g", "������Ա", 2000);
		ILeaf h = new Leaf("h", "������Ա", 2000);
		ILeaf i = new Leaf("i", "������Ա", 2000);
		ILeaf j = new Leaf("j", "������Ա", 2000);
		ILeaf k = new Leaf("k", "CEO����", 8000);
		
		ILeaf zhengLaoLiu = new Leaf("֣����", "�з�������", 20000);
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
