package test;

import java.util.ArrayList;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		IRoot ceo = new Root("��������", "�ܾ���", 1000000);
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
