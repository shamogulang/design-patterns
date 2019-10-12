package factory.function;



/**
 * @author chenjianhui on 2019/10/12
 */
public class QqLoginFactory implements Factory {

    @Override
    public Login getLogin() {
        return new QqLogin();
    }
}
