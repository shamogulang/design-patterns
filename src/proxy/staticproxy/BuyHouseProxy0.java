package proxy.staticproxy;

/**
 * @author chenjianhui on 2019/10/21
 */
public class BuyHouseProxy0 implements BuyHouse {

    private MeBuyHouse meBuyHouse = new MeBuyHouse();
    @Override
    public void buyHouse() {
        System.out.println("我是代理机构：");
        meBuyHouse.buyHouse();
    }
}
