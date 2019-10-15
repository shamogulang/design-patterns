package factory.abst;

/**
 * @author chenjianhui on 2019/10/15
 */
public class WeiboLogin implements Login {

    @Override
    public boolean login() {
        System.out.println("weibo login success");
        return true;
    }
}
