package test;

public class Client {

	public static void main(String[] args) {
		House house = new House();
		System.out.println("---------���ز���˾���������е�--------");
		HouseCorp houseCorp = new HouseCorp(house);
		houseCorp.makeMoney();
		System.out.println();
		
//		System.out.println("----------��װ��˾���������е�---------");
//		ClothesCorp clothesCorp = new ClothesCorp();
//		clothesCorp.makeMoney();
		
		System.out.println();
		System.out.println("----------ɽկ��˾�ǰ��������е�-------");
		IPodCorp iPodCorp = new IPodCorp(house);
		iPodCorp.makeMoney();
	}
	
}
