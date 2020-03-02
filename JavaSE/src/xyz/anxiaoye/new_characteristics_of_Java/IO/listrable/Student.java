package xyz.anxiaoye.new_characteristics_of_Java.IO.listrable;

import java.io.Serializable;

/**
 * @ClassName Student 学生类实现序列化接口
 * Create by zhuye on 2020/2/29.
 */
public class Student implements Serializable {
    private String sno;//学号
    private String sname;//姓名
    private transient int sage;//年龄,该元素不会被jvm默认序列化

    public Student() {
    }

    public Student(String sno, String sname, int sage) {
        this.sno = sno;
        this.sname = sname;
        this.sage = sage;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", sname='" + sname + '\'' +
                ", sage=" + sage +
                '}';
    }
}
