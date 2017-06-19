package test;

public class Client {

	public static void main(String[] args) {
		House house = new House();
		System.out.println("---------房地产公司是这样运行的--------");
		HouseCorp houseCorp = new HouseCorp(house);
		houseCorp.makeMoney();
		System.out.println();
		
//		System.out.println("----------服装公司是这样运行的---------");
//		ClothesCorp clothesCorp = new ClothesCorp();
//		clothesCorp.makeMoney();
		
		System.out.println();
		System.out.println("----------山寨公司是按这样运行的-------");
		IPodCorp iPodCorp = new IPodCorp(house);
		iPodCorp.makeMoney();
	}
	
}
