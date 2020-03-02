package xyz.anxiaoye.face_object_code.packaged;

/**
 * @ClassName Student
 * 构造方法：是专门用来创建对象的方法，当我们使用 new关键字时，就是在调用构造方法。
 * 【注意】
 * 1.构造方法的名称必须和类名称完全一样
 * 2.构造方法不需要返回值类型，以及 void 也不要
 * 3.构造方法不能return具体值
 * 4.如果没有编写任何构造方法，那么编译器会默认分配一个构造方法，没有参数、方法等，什么都不做
 * public Student(){}
 * 5.一旦编写至少一个构造方法，那么编译器将不会分配构造方法了
 * 6.构造方法可以重载
 */
public class Student {

    private String name;
    private int age;

    public Student() {
        System.out.println( "无参构造方法执行了！" );
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("我是"+name+"，今年"+age);
        System.out.println("有参构造方法执行了！");
    }

    /**set方法便于更改数据*/
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
