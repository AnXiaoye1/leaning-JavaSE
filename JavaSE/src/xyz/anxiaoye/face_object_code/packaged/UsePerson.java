package xyz.anxiaoye.face_object_code.packaged;

/**
 * @ClassName UsePerson
 * @Author zhuye
 * @Date 2020/1/21 22:30
 * @Version 1.0
 */
public class UsePerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();
        //间接访问
        person.setName( "王大锤" );
        person.setAge( -28 ); //年龄不合理，报错
        person.show();
    }
}
