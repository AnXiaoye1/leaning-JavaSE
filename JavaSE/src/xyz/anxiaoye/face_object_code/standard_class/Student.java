package xyz.anxiaoye.face_object_code.standard_class;

/**
 * @ClassName Student
 * @Author zhuye
 * @Date 2020/1/28 23:22
 * 定义一个标准的类，有以下4点：
 * 1.所有的成员变量都要用 private 关键字修饰
 * 2.为每一个成员变量编写一对getter/setter方法
 * 3.编写一个无参构造方法
 * 4.编写一个有参构造方法
 *
 * 这样的类叫做 Java Bean
 */
public class Student {
    private String name;
    private int age;

    /**
     * 使用快捷键 Alt+Insert ，或者点顶部栏的 Code->generate
     */
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
