package observer;

public class Client {

    public static void main(String[] args) {
        OfficialsAccount officialsAccount = new ConcreteOfficialAccount();

        officialsAccount.follow(new Fan1());
        officialsAccount.follow(new Fan2());

        officialsAccount.sendMessage("最美的不是下雨天，而是与你躲过雨的屋檐！");

        officialsAccount.notifyFans();
    }
}
