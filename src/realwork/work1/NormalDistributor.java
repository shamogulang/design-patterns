package realwork.work1;

public class NormalDistributor implements Distributor{

    @Override
    public void distributor(Req req) {
        System.out.println("normal 分发器执行。。。");
    }

    @Override
    public boolean match(Type type) {

        return Type.NORMAL.equals(type);
    }
}
