package xyz.anxiaoye.face_object_code.object_array;

/**
 * @ClassName Person
 * @Author zhuye
 * @Date 2020/1/29 12:50
 * @Version 1.0
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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
