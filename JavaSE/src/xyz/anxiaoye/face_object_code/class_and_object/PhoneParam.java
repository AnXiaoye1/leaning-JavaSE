package xyz.anxiaoye.face_object_code.class_and_object;

/**
 * @ClassName PhoneParam 使用对象类型作为方法的参数
 * @Author zhuye
 * @Date 2020/1/20 0:30
 * @Version 1.0
 */
public class PhoneParam {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.brand="华为";
        phone.price=18888;
        phone.color="土豪金";
        phone.memory="16+256G";
        System.out.println(phone);
        method( phone );
    }
    public static void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
        System.out.println(param.memory);
    }
}
