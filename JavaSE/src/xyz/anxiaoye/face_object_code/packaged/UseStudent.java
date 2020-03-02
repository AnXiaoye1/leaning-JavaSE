package xyz.anxiaoye.face_object_code.packaged;

/**
 * @ClassName UseStudent
 * @Author zhuye
 * @Date 2020/1/28 22:58
 * @Version 1.0
 */
public class UseStudent {
    public static void main(String[] args) {
        Student student1= new Student();
        Student student2=new Student("王大锤",29);
        System.out.println("姓名："+student2.getName()+"年龄："+student2.getAge());
        /** 结果输出：
         * 无参构造方法执行了！
         * 我是王大锤，今年29
         * 有参构造方法执行了！
         * 姓名：王大锤年龄：29
         */
    }
}
