package xyz.anxiaoye.face_object_code.class_and_object;

/**
 * @ClassName PhoneReturn 对象作为方法的返回值
 * @Author zhuye
 * @Date 2020/1/20 0:43
 * @Version 1.0
 */
public class PhoneReturn {
    public static void main(String[] args) {
        Phone getPhone = getPhone();
        System.out.println( getPhone.brand );
        System.out.println( getPhone.price );
        System.out.println( getPhone.color );
        System.out.println( getPhone.memory );
    }

    public static Phone getPhone() {
        Phone phone = new Phone();
        phone.brand = "华为";
        phone.price = 18888;
        phone.color = "土豪金";
        phone.memory = "16+256G";
        return phone;
    }
}
