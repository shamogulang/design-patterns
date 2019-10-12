package factory.base;

/**
 * @author chenjianhui on 2019/10/12
 */
public interface Login {

    enum Type{
        QQ,
        WECHAT,
        WEIBO;//这个是后来加的
    }
    boolean login();
}
