package proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author chenjianhui on 2019/10/21
 */
public class LogHandle implements InvocationHandler {

    //实际代理的对象
    private Object target;

    public LogHandle(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start...");
        Object obj = method.invoke(target,args);
        System.out.println("end...");
        return obj;
    }

    public Object getProxyTarget(){
       return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}
