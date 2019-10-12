package factory.function;


/**
 * @author chenjianhui on 2019/10/12
 */
public class WeiboLogin implements Login {

    @Override
    public boolean login() {
        //新加的类，执行一系列操作
        System.out.println("weibo登陆成功");
        return true;
    }
}
