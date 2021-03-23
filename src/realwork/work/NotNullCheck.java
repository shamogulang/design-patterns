package realwork.work;

public class NotNullCheck implements ValidateParam{

    @Override
    public void validate(HandleContext context) {
        if(context == null || context.getReq() == null){
            throw new RuntimeException("参数不能为空");
        }
    }
}
