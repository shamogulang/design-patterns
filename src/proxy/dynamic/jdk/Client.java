package proxy.dynamic.jdk;


/**
 * @author chenjianhui on 2019/10/21
 */
public class Client {
    /**
     * JDK动态代理主要涉及两个类：java.lang.reflect.Proxy 和 java.lang.reflect.InvocationHandler
     */

    //已经使用了一个InvocationHandler类了，那么接下来通过Proxy获取代理对象
    public static void main(String[] args) {
        LogHandle logHandle = new LogHandle(new LogOut());
        LogOutInterface logOut = (LogOutInterface)logHandle.getProxyTarget();
        logOut.showLog();
    }

}
