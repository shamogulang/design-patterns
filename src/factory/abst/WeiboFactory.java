package factory.abst;

/**
 * @author chenjianhui on 2019/10/15
 */
public class WeiboFactory implements Factory {

    @Override
    public Login getLogin() {
        return new WeiboLogin();
    }

    @Override
    public Logout logOut() {
        return new WeiboLogout();
    }
}
