package prototype;

/**
 * @author chenjianhui on 2019/10/16
 */
public class Client {
    public static void main(String[] args) {
        House house0 = new House();
        house0.setPrice("100万");
        house0.setWide(100);
        try {
            House house1 = (House) house0.clone();
            System.out.println(house0);//prototype.House@4141d797
            System.out.println(house1);//prototype.House@68f7aae2
            //对于java来说要实现复制只要实现cloneable接口即可，然后重写clone方法，但是都是浅复制，如果
            //要实现深复制，那么要做相关的处理

            //在java中一个对象被clone了，如果属性都是基本类型或者是String的话，那么就可以实现复制，但是
            //如果是其他的引用类型，那么只会复制到那个引用，那么就不能实现真正的复制了，要做相关的处理

            //实现深复制
            //假设现在房子了有一个桌子，加入一个Desk类
            House house2 = new House();
            house2.setPrice("100万");
            house2.setWide(100);
            house2.setDesk(new Desk("300元",4));

            House house3 = (House) house2.clone();

            System.out.println(house2.getDesk());//prototype.Desk@1540e19d
            System.out.println(house3.getDesk());//prototype.Desk@1540e19d

            //看到上面的就是两个一样的引用
            //现在改下那个clone的实现，同时desk也要实现cloneable接口

            //此时上述的结果变成：prototype.Desk@4c3e4790   prototype.Desk@38cccef但是里面的值是一样的，那么就实现了深复制了

            //上述的说明都是针对java来说的

        }catch (Exception e){
            System.out.println("clone error,for details:"+e.getMessage());
        }
    }
}
