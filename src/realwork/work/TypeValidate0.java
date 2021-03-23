package realwork.work;

public class TypeValidate0 implements ValidateParam{

    @Override
    public void validate(HandleContext context) {

        if(context.getReq().getName() == null){
            context.getErrors().add("名字不能为空！");
        }
        if(context.getReq().getAge() > 35 || context.getReq().getAge() < 20){
            context.getErrors().add("年龄不在20到35范围！");
        }
    }
}
