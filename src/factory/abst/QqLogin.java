package factory.abst;

/**
 * @author chenjianhui on 2019/10/15
 */
public class QqLogin implements Login {

    @Override
    public boolean login() {
        System.out.println("qq login success");
        return true;
    }
}
