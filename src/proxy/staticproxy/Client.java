package proxy.staticproxy;

/**
 * @author chenjianhui on 2019/10/21
 */
public class Client {

    public static void main(String[] args) {
        MeBuyHouse meBuyHouse = new MeBuyHouse();
        meBuyHouse.buyHouse();
        //一般来说的方式就是这样子，但是如果你不想自己买呢，觉得太麻烦，所以就叫代理机构帮你去买，你给点钱他赚就行了

        //这一次我不想自己买了，则创建一个BuyHouseProxy0
        BuyHouseProxy0 buyHouseProxy0 = new BuyHouseProxy0();
        buyHouseProxy0.buyHouse();
        /**
         * 返回的结果如下：
         * 我是代理机构：
         * 我买房子。。。
         */
    }

}
