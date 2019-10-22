package proxy.dynamic.jdk;

/**
 * @author chenjianhui on 2019/10/22
 */
public class LogOut implements LogOutInterface{

    @Override
    public void showLog(){
        System.out.println("这是logOut日志信息。。。");
    }
}
