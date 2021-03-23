package realwork.work.chain;

import work.HandleContext;
import work.ValidateParam;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractChain implements Chain{


    protected List<ValidateParam> validateParamList = new ArrayList<>();

    @Override
    public void validate(HandleContext context) {
        for(ValidateParam validateParam : validateParamList){
            validateParam.validate(context);
            if(!context.getErrors().isEmpty()){
                System.out.println("执行过程异常，推出执行链:"+validateParam.getClass()+"详情"+context.getErrors().toString());
                break;
            }
        }
    }

}
