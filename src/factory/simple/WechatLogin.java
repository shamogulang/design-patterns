package factory.simple;

/**
 * @author chenjianhui on 2019/10/12
 */
public class WechatLogin implements Login {

    @Override
    public boolean login() {
        //执行一系列的登陆操作
        System.out.println("wechat登陆失败");
        return false;
    }
}
