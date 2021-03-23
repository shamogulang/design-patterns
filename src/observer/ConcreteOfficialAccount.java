package observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteOfficialAccount implements OfficialsAccount{

    private List<Fans> fanList = new ArrayList<>();

    private String msg;

    @Override
    public void follow(Fans fans) {
        fanList.add(fans);
    }

    @Override
    public void unFollow(Fans fans) {
        fanList.remove(fans);
    }

    @Override
    public void notifyFans() {
        for (Fans fans : fanList) {
            fans.message(msg);
        }
    }

    @Override
    public void sendMessage(String msg) {
        this.msg = msg;
    }
}
