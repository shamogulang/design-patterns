package observer;

public class Fan2 implements Fans{

    @Override
    public void message(String msg) {
        System.out.println("fan2 收到消息！"+msg);
    }
}
