package xyz.anxiaoye.face_object_code.keywords_static;

/**
 * 如果一个成员变量使用的static修饰，那么这个变量不再属于对象自己，而属于所在类，多个对象共享同一个数据
 */
public class StaticFiled {
    public static void main(String[] args) {
        Student one = new Student( "黄蓉", 18 );
        Student.classRoom = "101教室";//不能用类的实例对象来调用静态成员变量
        System.out.println( "姓名：" + one.getName() + "，年龄：" + one.getAge()
                + "，在" + Student.classRoom + "，学号：" + one.getId() );

        Student two = new Student( "郭靖", 19 );
        System.out.println( "姓名：" + two.getName() + "，年龄：" + two.getAge()
                + "，在" + Student.classRoom + "，学号：" + two.getId() );
    }
}
