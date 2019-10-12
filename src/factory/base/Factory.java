package factory.base;

/**
 * @author chenjianhui on 2019/10/12
 */
public class Factory {

    /**
     * 根据不同类型type获取不同的登陆对象
     * @param type
     * @return
     */
     public Login getLogin(Login.Type type){
         if(type.equals(Login.Type.QQ)){
             return new QqLogin();
         }else if(type.equals(Login.Type.WECHAT)){
             return new WechatLogin();
         }else if(type.equals(Login.Type.WEIBO)){
             //这里是添加的代码，违反了对修改关闭的原则
             //这个是工厂模式的一个缺点
             return new WeiboLogin();
         }
         //传入的类型不对，记录日志返回空
         System.out.println("getLogin type error,for type:"+type.toString());
         return null;
     }
}
