package test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerIH implements InvocationHandler {
	// ��������
	Class<?> cls = null;
	
	// �������ʵ��
	Object obj = null;
	
	public GamePlayerIH(Object obj) {
		this.obj = obj;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = method.invoke(this.obj , args);
		
		return result;
	}

}
