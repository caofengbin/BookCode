package test;

import java.lang.reflect.InvocationHandler;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		IGamePlayer player = new GamePlayer("张三");
		//IGamePlayer proxy = player.getProxy();
		InvocationHandler handler = new GamePlayerIH(player);
		
		System.out.println("开始时间是： 2009-8-25 10:45");
		
		ClassLoader cl = player.getClass().getClassLoader();
		
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[] {IGamePlayer.class}, handler);
		
		proxy.login("张三", "password");
		
		proxy.killMonster();
		//proxy.killMonster();
		proxy.upgrade();
		
		System.out.println("结束时间是：2009-8-26 03:40");
		
	}

}
