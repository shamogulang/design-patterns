package factory.function;


/**
 * @author chenjianhui on 2019/10/12
 */
public class QqLogin implements Login {
    @Override
    public boolean login() {
        //执行一系列的登陆操作
        System.out.println("qq 登陆成功");
        return true;
    }
}
