package items;

import java.lang.reflect.Method;
//用来保存截断器的实例的数据结构
public class interceptorimpl {
	private Method predo;
	private Method afterdo;
	private Object interceptor;	
	public void doafter(String result)throws Exception {
		afterdo.invoke(interceptor, result);
	}
	public void dopre()throws Exception {
		predo.invoke(interceptor);
	}
public interceptorimpl(Method predo, Method afterdo, Object interceptor) {
	super();
	this.predo = predo;
	this.afterdo = afterdo;
	this.interceptor = interceptor;
}
	
}
