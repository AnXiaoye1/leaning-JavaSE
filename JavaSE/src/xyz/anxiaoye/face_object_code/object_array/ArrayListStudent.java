package xyz.anxiaoye.face_object_code.object_array;

import java.util.ArrayList;

/**
 * 题目：
 * 自定义4个学生对象，放到集合并遍历
 * 思路：
 * 1.创建Student学生类，4部分
 * 2.创建集合，用来存储学生对象，泛型，<Student>
 * 3.根据类，创建4个学生对象
 * 4.将4个对象放在集合中，add
 * 5.遍历集合
 */
public class ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        //创建4个学生对象
        Student one = new Student( "张良", 23 );
        Student two = new Student( "司马光", 25 );
        Student three = new Student( "诸葛亮", 22 );
        Student four = new Student( "刘伯承", 26 );
        //添加到集合
        list.add( one );
        list.add( two );
        list.add( three );
        list.add( four );
        //遍历
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get( i );
            System.out.println("姓名："+student.getName()+"，年龄："+student.getAge());
        }
    }
}
