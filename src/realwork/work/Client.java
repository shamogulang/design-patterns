package realwork.work;

import realwork.work.chain.Chain;

public class Client {

    public static void main(String[] args) {
        Req req = Utils.buildReq();
        HandleContext handleContext = new HandleContext();
        handleContext.setReq(req);
        Chain chain = Utils.getChain(0);
        chain.validate(handleContext);
        if(!handleContext.getErrors().isEmpty()){
            throw new RuntimeException("出错，"+handleContext.getErrors());
        }
        System.out.println("step 2");
    }
}
