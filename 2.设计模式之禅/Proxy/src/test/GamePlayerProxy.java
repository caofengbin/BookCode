package test;

public class GamePlayerProxy implements IGamePlayer, IProxy {
	
	private IGamePlayer gamePlayer = null;
	
	public GamePlayerProxy(IGamePlayer gamePlayer) {
		this.gamePlayer = gamePlayer;
	}

	public IGamePlayer getProxy() {
		
		return this;
	}

	public void killMonster() {
		this.gamePlayer.killMonster();
	}

	public void login(String user, String password) {
		System.out.println(this.gamePlayer);
		this.gamePlayer.login(user, password);
	}

	public void upgrade() {
		this.gamePlayer.upgrade();
		this.count();
	}

	public void count() {
		System.out.println("升级总费用是： 150元");
		
	}

}
