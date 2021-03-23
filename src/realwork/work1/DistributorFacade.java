package realwork.work1;

import java.util.Arrays;
import java.util.List;

public class DistributorFacade {

    private List<Distributor> distributors;

    public DistributorFacade() {
        this.distributors = Arrays.asList(new NormalDistributor(), new UnNormalDistributor());
    }

    public void distributor(Req req, Type type) {

         match(type).distributor(req);
    }

    public Distributor match(Type type) {

        Distributor distributor = distributors.stream().filter(item -> item.match(type)).findFirst().orElse(null);
        if(distributor == null){
            throw new RuntimeException("没有找到相关的分发器！");
        }
        return distributor;
    }
}
