package realwork.work;

import realwork.work.chain.Chain;
import realwork.work.chain.Chain0;
import realwork.work.chain.Chain1;

import java.math.BigDecimal;

public class Utils {

    public static Req buildReq(){
        Req req = new Req();
        req.setAge(10);
        req.setHeight(new BigDecimal("1.78"));
        return req;
    }

    public static Chain getChain(int type){
        if(type == 1){
            return new Chain1();
        }else if(type == 0){
            return new Chain0();
        }
        throw  new RuntimeException("未定义执行链类型！");
    }
}
