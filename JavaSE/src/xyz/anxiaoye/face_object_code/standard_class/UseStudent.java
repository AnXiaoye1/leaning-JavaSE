package xyz.anxiaoye.face_object_code.standard_class;

/**
 * @ClassName UseStudent
 * @Author zhuye
 * @Date 2020/1/28 23:33
 * @Version 1.0
 */
public class UseStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName( "曹孟德" );
        student1.setAge( 33 );
        System.out.println("姓名："+student1.getName()+" 年龄："+student1.getAge());
        Student student2 = new Student("刘玄德",28);
        System.out.println("姓名："+student2.getName()+" 年龄："+student2.getAge());
    }
}
