package factory.abst;

/**
 * @author chenjianhui on 2019/10/15
 */
public class QqFactory implements Factory {

    @Override
    public Login getLogin() {
        return new QqLogin();
    }

    @Override
    public Logout logOut() {
        return new QqLogout();
    }
}
