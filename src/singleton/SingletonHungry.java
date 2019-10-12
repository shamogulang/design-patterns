package singleton;

/**
 * @author chenjianhui on 2019/10/12
 */
public class SingletonHungry {

    /**
     * 单列模式饿汉式-线程安全
     * 优点：简单
     * 缺点：一开始就创建对象，浪费服务器资源，影响性能
     */
    private static SingletonHungry singletonHungry = new SingletonHungry();

    private SingletonHungry() {
        //do nothing
    }

    public static SingletonHungry getSingletonHungry(){
        return singletonHungry;
    }
}
