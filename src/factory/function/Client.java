package factory.function;

/**
 * @author chenjianhui on 2019/10/12
 */
public class Client {
    public static void main(String[] args) {
        //工厂类
        Factory factory = null;
        //传入type,这里的type在clent中进行判断，不传入到工厂里面判断
        Login.Type type = Login.Type.QQ;
        if(type.equals(Login.Type.QQ)){
            factory = new QqLoginFactory();
        }
        Login login = factory.getLogin();
        login.login();

        //现在产品要加入微博登陆的话，就可以避免对修改关闭的破坏
        //注意，有人或者会说，那么客户端不修改了吗，也不是封闭啊，
        //这个是不算入设计模式类中的，因为它是使用工厂模块的代码功能的类

        //现在只需要加WeiboLogin,WeiboLoginFactory两个类即可，枚举类的加入代码不算
        //（我这里是看起来方便点而已，实际代码中可能不会有，一般来说都是和前端商量好加一个类型，
        // 那么他传过来，我在client中有一个常量来比较就行了）
        type = Login.Type.WEIBO;
        if(type.equals(Login.Type.WEIBO)){
            factory = new WeiboLoginFactory();
        }
        login = factory.getLogin();
        login.login();

        //返回结果：qq 登陆成功  weibo登陆成功

        //对简单工厂设计模式的改正是遵循了开放封闭原则
    }
}
