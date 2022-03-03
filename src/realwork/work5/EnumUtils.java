package realwork.work5;

import realwork.work5.base.AddressBean;
import realwork.work5.base.AiBean;
import realwork.work5.base.BaseBean;

import java.util.Arrays;

public enum  EnumUtils {

    AI("AI"){
        @Override
        public BaseBean convertBean() {
            AiBean bean = new AiBean();
            bean.setAge("12");
            bean.setName("jeffchan");
            return bean;
        }
    },
    ADDRESS("ADDRESS"){
        @Override
        public BaseBean convertBean() {
            AddressBean bean = new AddressBean();
            bean.setAddress("广州1");
            return bean;
        }
    };

    private String hello;

    public String getHello() {
        return hello;
    }

    EnumUtils(String hello) {
        this.hello = hello;
    }

    public abstract BaseBean convertBean();

    public EnumUtils getEnumUtilsByHello(String hello){

        return Arrays.stream(values()).filter(item -> item.getHello().equals(hello)).findFirst().orElse(null);
    }

}
