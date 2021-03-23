package observer;

public interface OfficialsAccount {


    void follow(Fans fans);

    void unFollow(Fans fans);

    void notifyFans();

    void sendMessage(String msg);
}
