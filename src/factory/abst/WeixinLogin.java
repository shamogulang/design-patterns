package factory.abst;


/**
 * @author chenjianhui on 2019/10/15
 */
public class WeixinLogin implements Login {

    @Override
    public boolean login() {
        System.out.println("weixin login success");
        return true;
    }
}
