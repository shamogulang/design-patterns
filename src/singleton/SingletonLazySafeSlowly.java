package singleton;

/**
 * @author chenjianhui on 2019/10/12
 */
public class SingletonLazySafeSlowly {

    private static SingletonLazySafeSlowly singletonLazySafeSlowly;

    private SingletonLazySafeSlowly() {
        //do nothing
    }

    /**
     * 线程安全的懒汉式（同步方法），但是性能比较差，因为要等其他线程返回后才能获取实例
     * @return
     */
    public static synchronized SingletonLazySafeSlowly getSingletonLazySafeSlowly(){
        if(singletonLazySafeSlowly == null){
            singletonLazySafeSlowly = new SingletonLazySafeSlowly();
        }
        return singletonLazySafeSlowly;
    }

}
