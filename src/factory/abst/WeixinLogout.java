package factory.abst;

/**
 * @author chenjianhui on 2019/10/15
 */
public class WeixinLogout implements Logout {

    @Override
    public boolean logout() {
        System.out.println("weixin logout success");
        return true;
    }
}
