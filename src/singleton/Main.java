package singleton;

/**
 * @author chenjianhui on 2019/10/12
 */
public class Main {
    public static void main(String[] args) {

        //1、测试不是线程安全懒汉式
        checkSingletonLazyUnsafe();

    }

    private static void checkSingletonLazyUnsafe(){
        SingletonLazyUnsafe singletonLazyUnsafe = SingletonLazyUnsafe.getSingletonLazyUnsafe();
        System.out.println("SingletonLazyUnsafe 是否同一个实例："+singletonLazyUnsafe.equals(SingletonLazyUnsafe.getSingletonLazyUnsafe()));
    }
}
