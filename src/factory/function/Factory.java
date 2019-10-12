package factory.function;


/**
 * @author chenjianhui on 2019/10/12
 */
public interface Factory {
    /**
     * 工厂方法设计模式,工厂变成一个抽象工厂，不再用参数类型来返回不同的产品，
     * 而是通过不同的子工厂去创建产品,也就是把类型的区分从工厂类中移出到client中了
     */
    Login getLogin();
}
