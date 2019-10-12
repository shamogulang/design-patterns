package singleton;

/**
 * @author chenjianhui on 2019/10/12
 */
public class SingletonLazyUnsafe {
    /**
     * 单列模式中的懒汉式，不是线程安全
     * 优点：使用对象时才创建，避免了一开始就创建无用对象的问题
     * 缺点：线程不安全
     */
    private static  SingletonLazyUnsafe singletonLazyUnsafe;

    /**
     * 私有化构造器，防止外部创建实例
     * 其实通过反射也是可以创建实例的，但是不考虑这个问题
     */
    private SingletonLazyUnsafe() {
        //do nothing
    }

    public static SingletonLazyUnsafe getSingletonLazyUnsafe(){
        if(singletonLazyUnsafe == null){
            //当有多个线程进入到这个if条件内部，会出现创建多个实例的时候
            singletonLazyUnsafe = new SingletonLazyUnsafe();
        }
        return singletonLazyUnsafe;
    }
}
