package singleton;

/**
 * @author chenjianhui on 2019/10/12
 */
public class Client {
    public static void main(String[] args) {

        //1、测试单列饿汉式
        checkSingletonHungry();
        //2、测试不是线程安全懒汉式
        checkSingletonLazyUnsafe();
        //3、同步单列模式
        checkSingletonLazySafeSlowly();
        //4、double check 单列
        checkSingletonLazySafeFastly();
        //5、静态内部类单列
        checkSingletonStaticInnerClass();
        //6、枚举单列
        checkSingletonEnum();

    }

    private static void checkSingletonHungry(){
        SingletonHungry singletonHungry = SingletonHungry.getSingletonHungry();
        System.out.println("SingletonHungry 是否同一个实例："+singletonHungry.equals(SingletonHungry.getSingletonHungry()));
    }

    private static void checkSingletonLazyUnsafe(){
        SingletonLazyUnsafe singletonLazyUnsafe = SingletonLazyUnsafe.getSingletonLazyUnsafe();
        System.out.println("SingletonLazyUnsafe 是否同一个实例："+singletonLazyUnsafe.equals(SingletonLazyUnsafe.getSingletonLazyUnsafe()));
    }

    private static void checkSingletonLazySafeSlowly(){
        SingletonLazySafeSlowly singletonLazySafeSlowly = SingletonLazySafeSlowly.getSingletonLazySafeSlowly();
        System.out.println("SingletonLazySafeSlowly 是否同一个实例："+singletonLazySafeSlowly.equals(SingletonLazySafeSlowly.getSingletonLazySafeSlowly()));
    }

    private static void checkSingletonLazySafeFastly(){
        SingletonLazySafeFastly singletonLazySafeFastly = SingletonLazySafeFastly.getSingletonLazySafeSlowly();
        System.out.println("SingletonLazySafeFastly 是否同一个实例："+singletonLazySafeFastly.equals(SingletonLazySafeFastly.getSingletonLazySafeSlowly()));
    }

    private static void checkSingletonStaticInnerClass(){
        SingletonStaticInnerClass singletonStaticInnerClass = SingletonStaticInnerClass.getSingletonStaticInnerClass();
        System.out.println("SingletonStaticInnerClass 是否同一个实例："+singletonStaticInnerClass.equals(SingletonStaticInnerClass.getSingletonStaticInnerClass()));
    }
    private static void checkSingletonEnum(){
        System.out.println("SingletonEnum 是否同一个实例："+SingletonEnum.SINGLETON_ENUM.equals(SingletonEnum.SINGLETON_ENUM));
    }
}
