package observer;

public class Fan1 implements Fans{

    @Override
    public void message(String msg) {
        System.out.println("fan1 收到消息！"+msg);
    }
}
