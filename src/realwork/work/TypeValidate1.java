package realwork.work;

public class TypeValidate1 implements ValidateParam{

    @Override
    public void validate(HandleContext context) {

        if(context.getReq().getAge() > 78 || context.getReq().getAge() < 61){
            context.getErrors().add("年龄不在61到78范围！");
        }
    }
}
