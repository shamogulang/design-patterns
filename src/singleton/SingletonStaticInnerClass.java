package singleton;

/**
 * @author chenjianhui on 2019/10/12
 */
public class SingletonStaticInnerClass {

    /**
     * 采用静态内容类的方式，在没有调用getSingletonStaticInnerClass前不会出现SingletonStaticInnerClass的初始化
     * 这是比较推荐的方式
     */
    private static class  InnerSingletonStatic{
        private static SingletonStaticInnerClass singletonStaticInnerClass = new SingletonStaticInnerClass();
    }

    private SingletonStaticInnerClass() {
    }

    public static SingletonStaticInnerClass getSingletonStaticInnerClass(){
        return InnerSingletonStatic.singletonStaticInnerClass;
    }
}
