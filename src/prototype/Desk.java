package prototype;

/**
 * @author chenjianhui on 2019/10/16
 */
public class Desk implements Cloneable{

    private String price;
    private int foot;

    public Desk() {
    }

    public Desk(String price, int foot) {
        this.price = price;
        this.foot = foot;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getFoot() {
        return foot;
    }

    public void setFoot(int foot) {
        this.foot = foot;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
