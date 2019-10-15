package factory.abst;


/**
 * @author chenjianhui on 2019/10/15
 */
public class WeixinFactory implements Factory {

    @Override
    public Login getLogin() {
        return new WeixinLogin();
    }

    @Override
    public Logout logOut() {
        return new WeixinLogout();
    }
}
