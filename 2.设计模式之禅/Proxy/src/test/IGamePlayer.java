package test;

public interface IGamePlayer {

	public void login(String user, String password);
	
	public void killMonster();
	
	public void upgrade();
	
	public IGamePlayer getProxy();
	
}
