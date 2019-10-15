package factory.abst;

/**
 * @author chenjianhui on 2019/10/15
 */
public class QqLogout implements Logout {


    @Override
    public boolean logout() {
        System.out.println("qq logout success");
        return true;
    }
}
