package test;

public class GamePlayer implements IGamePlayer {
	
	private String name = "";
	
	private IGamePlayer proxy = null;
	
	public GamePlayer(String name) {
		this.name = name;
	}

	public IGamePlayer getProxy() {

		this.proxy = new GamePlayerProxy(this);
		
		return this.proxy;
	}

	public void killMonster() {
		
		if (this.isProxy()) {
			
			System.out.println(this.name + "�ڴ�֣�");
			
		} else {
			
			System.out.println("��ʹ��ָ���Ĵ������");
			
		}
		
	}

	public void login(String user, String password) {

		if (this.isProxy()) {
			
			System.out.println("��¼��Ϊ" + user + "���û�" + this.name + "��¼�ɹ���");
			
		} else {
			
			System.out.println("��ʹ��ָ���Ĵ������");
			
		}
		
	}

	public void upgrade() {

		if (this.isProxy()) {
			
			System.out.println(this.name + " ������һ���� ");
			
		} else {
			
			System.out.println("��ʹ��ָ���Ĵ������");
			
		}
		
	}
	
	private boolean isProxy() {
		
		if (this.proxy == null) {
			
			return false;
			
		} else {
			
			return true;
		}
		
	}

}
