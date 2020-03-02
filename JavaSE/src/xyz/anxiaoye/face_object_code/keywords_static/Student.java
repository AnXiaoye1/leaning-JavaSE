package xyz.anxiaoye.face_object_code.keywords_static;

/**
 * @ClassName Student
 * @Author zhuye
 * @Date 2020/1/30 21:46
 * @Version 1.0
 */
public class Student {
    private int id;//学号
    private String name;
    private int age;
    static String classRoom;//所在教室
    private static int idCounter = 0;//学号计数器，每当 new了一个新对象，计数器++

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student() {
        this.id = ++idCounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
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
