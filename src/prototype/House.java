package prototype;

/**
 * @author chenjianhui on 2019/10/16
 */
public class House implements Cloneable {

    private int wide;
    private String price;
    private Desk desk;

    public int getWide() {
        return wide;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Desk getDesk() {
        return desk;
    }

    public void setDesk(Desk desk) {
        this.desk = desk;
    }

    /*
     浅复制 一开始的clone实现
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/

    @Override
    protected Object clone() throws CloneNotSupportedException {
        House house = (House) super.clone();
        if(house.getDesk() != null){
            //为什么不new一个新的呢，如果new一个新的话其实跟工厂模式
            //差不多，但是原型模式就是要通过更快的效率去复制一个对象
            //而不是去创建一个对象，当创建一个耗时的实例时，如果想要
            //相同值的新对象，那么克隆就很有用了，因为它效率很高
            house.setDesk((Desk) house.getDesk().clone());
        }
        return house;
    }
}
