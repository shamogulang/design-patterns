package realwork.work1;

public class UnNormalDistributor implements Distributor{

    @Override
    public void distributor(Req req) {
        System.out.println("un-normal 分发器执行。。。");
    }

    @Override
    public boolean match(Type type) {
        
        return Type.UN_NORMAL.equals(type);
    }
}
