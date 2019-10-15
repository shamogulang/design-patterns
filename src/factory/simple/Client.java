package factory.simple;

/**
 * @author chenjianhui on 2019/10/12
 */
public class Client {
    public static void main(String[] args) {
        //创建登陆的工厂
        Factory factory = new Factory();
        //获取登陆的对象
        Login login = factory.getLogin(Login.Type.QQ);
        login.login();

        login = factory.getLogin(Login.Type.WECHAT);
        login.login();

        //返回结果：qq 登陆成功  wechat登陆失败

        //上面一开始就是设计成这样子了，但是这个时候产品又有需求了，说是要增加微博的登陆
        //那么要增加一个WeiboLogin的类（这个符合设计原则，对外扩展），同时要在Factory
        //的判断分支中加多一个if微博的判断，这个是不符合设计原则的（设计原则，对扩展开放，对修改封闭）
        login = factory.getLogin(Login.Type.WEIBO);
        login.login();
        //返回结果：qq 登陆成功  wechat登陆失败   weibo登陆成功
    }
}
