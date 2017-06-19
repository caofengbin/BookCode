package test;

import java.lang.reflect.InvocationHandler;

public class Proxy implements Subject {
	
	private Subject subject;

	public void request() {
		
		if (subject == null) {
			subject = new RealSubject();
		}
		
		subject.request();
		
	}
	
//	public IGamePlayer newProxyInstance(ClassLoader classLoader, Class<?>[] classz, InvocationHandler handler){
//		
//		try {
//			return new GamePlayerProxy((IGamePlayer)classLoader.getClass().newInstance());
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			
//			return null;
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			
//			return null;
//		}
//	}
	
	public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) {
		
		if (true) {
			new BeforeAdvice().exec();
		}
		
		return 
		
	}
	
}
