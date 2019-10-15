package factory.abst;


/**
 * @author chenjianhui on 2019/10/12
 */
public class Client {
    public static void main(String[] args) {
         //微信工厂
         Factory factory = new WeixinFactory();
         factory.getLogin().login();
         factory.logOut().logout();

         //qq工厂
         factory = new QqFactory();
         factory.getLogin().login();
         factory.logOut().logout();

         //如今如果是添加weibo，这个是指微博这个产品族，族里面有login和logout两个产品
         //添加微博工厂，微博login和logout两个产品的两个实现类即可(支持向外扩展，同时对修改封闭)
         factory = new WeiboFactory();
         factory.getLogin().login();
         factory.logOut().logout();

         //注意这个微博的扩展，是对整个产品族的扩展，抽象工厂不支持产品的扩展。就是login和logout
         //这两个要求不能再增加其他的了，比如如果你增加了一个xxx,那么，就需要在工厂接口中，加入
         //getxxx的方法，就不满足对修改关闭的原则了。

         //如果现在增加一个 facebook功能，要怎么去实现呢？可以自己尝试一下
    }
}
