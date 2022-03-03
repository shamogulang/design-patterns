package realwork.work5;

import realwork.work5.base.AddressBean;

public class EnumTest {

    public static void main(String[] args) {
        AddressBean baseBean = (AddressBean)EnumUtils.ADDRESS.convertBean();
        String address = baseBean.getAddress();
        System.out.println(address);
    }
}
