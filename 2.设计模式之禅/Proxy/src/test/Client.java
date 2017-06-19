package test;

import java.lang.reflect.InvocationHandler;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		IGamePlayer player = new GamePlayer("����");
		//IGamePlayer proxy = player.getProxy();
		InvocationHandler handler = new GamePlayerIH(player);
		
		System.out.println("��ʼʱ���ǣ� 2009-8-25 10:45");
		
		ClassLoader cl = player.getClass().getClassLoader();
		
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[] {IGamePlayer.class}, handler);
		
		proxy.login("����", "password");
		
		proxy.killMonster();
		//proxy.killMonster();
		proxy.upgrade();
		
		System.out.println("����ʱ���ǣ�2009-8-26 03:40");
		
	}

}
