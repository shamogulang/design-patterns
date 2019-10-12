package factory.function;


/**
 * @author chenjianhui on 2019/10/12
 */
public class WeChatLoginFactory implements Factory {

    @Override
    public Login getLogin() {
        return new WechatLogin();
    }
}
