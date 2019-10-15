package factory.abst;

/**
 * @author chenjianhui on 2019/10/15
 */
public class WeiboLogout implements Logout{

    @Override
    public boolean logout() {
        System.out.println("weibo logout success");
        return true;
    }
}
