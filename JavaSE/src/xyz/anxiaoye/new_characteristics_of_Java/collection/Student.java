package xyz.anxiaoye.new_characteristics_of_Java.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Student 学生类
 * Create by zhuye on 2020/2/22.
 */
public class Student {
    private String id;
    private String name;
    private Set courses;//Set接口

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new HashSet();//HashSet是Set接口的一共实现类
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set getCourses() {
        return courses;
    }

    public void setCourses(Set courses) {
        this.courses = courses;
    }
}
