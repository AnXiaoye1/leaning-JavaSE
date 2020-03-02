package xyz.anxiaoye.face_object_code.class_and_object;

/**
 * @ClassName UseStudentsAndPhone
 * @Author zhuye
 * @Date 2020/1/19 23:15
 * @Version 1.0
 */
public class UseStudentsAndPhone {
    public static void main(String[] args) {
        System.out.println( "---------学生对象---------" );
        //实例化学生类
        Student student = new Student();

        System.out.println( student.name );//null
        System.out.println( student.age );//0
        System.out.println( "------------------" );
        student.name = "西楚霸王-项羽";
        student.age = 18;
        System.out.println( student.name );
        System.out.println( student.age );
        student.sleep();

        System.out.println("----------手机对象-----------");
        Phone phone = new Phone();
        System.out.println(phone.brand);//null
        System.out.println(phone.price);//0.0
        System.out.println(phone.color);//null
        System.out.println(phone.memory);//null
        System.out.println("---------------------");
        phone.brand="华为";
        phone.price=5888;
        phone.color="炫酷黑";
        phone.memory="8-128G";
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);
        System.out.println(phone.memory);
        phone.call("刘邦");
        phone.playGames("曹操");
        phone.sendMsg("关羽");
        phone.watchTV();
    }
}
