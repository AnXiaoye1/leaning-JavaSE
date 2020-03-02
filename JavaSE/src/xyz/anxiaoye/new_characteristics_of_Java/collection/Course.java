package xyz.anxiaoye.new_characteristics_of_Java.collection;

/**
 * @ClassName Course 课程类
 * Create by zhuye on 2020/2/22.
 */
public class Course {
    private int id;
    private String name;

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
