package singleton;

/**
 * @author chenjianhui on 2019/10/12
 */
public class SingletonLazySafeFastly {

    /**
     * volatile用于禁止指令的重排
     */
    private static volatile SingletonLazySafeFastly singletonLazySafeFastly;

    private SingletonLazySafeFastly() {
        //do nothing
    }

    /**
     * 线程安全的懒汉式（double check方式），但是性能相对比较好一些
     * @return
     */
    public static synchronized SingletonLazySafeFastly getSingletonLazySafeSlowly(){
        if(singletonLazySafeFastly == null){
            synchronized (SingletonLazySafeFastly.class){
                if(singletonLazySafeFastly == null){
                    /**
                     * 创建一个对象在jvm中会经过三步
                     * 1、分配内存空间
                     * 2、初始化对象
                     * 3、设置singletonLazySafeFastly的内存地址
                     * 对于多线程中来说，jvm因为一些性能问题可能会进行指令的重排
                     * 也就是2跟3会出现指令重排的一些情况，那么就有可能会出现
                     * 对象有内存地址，但是却没有初始化完成的情况（volatile可以禁止指令的重排）
                     * 具体情况可以参考这个博主的文章：http://ifeve.com/double-checked-locking-with-delay-initialization/
                     */
                    singletonLazySafeFastly = new SingletonLazySafeFastly();
                }
            }
        }
        return singletonLazySafeFastly;
    }

}
