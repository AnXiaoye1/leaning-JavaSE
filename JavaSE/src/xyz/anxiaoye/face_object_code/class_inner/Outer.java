package xyz.anxiaoye.face_object_code.class_inner;

/**
 * @ClassName Outer
 * Create by zhuye on 2020/2/8.
 * 访问重名的外部类成员变量：外部类名.this.外部类成员变量
 */
public class Outer {

    int num=10;//外部类成员变量

    public class Inner{
        int num=20;//内部类成员变量

        public void methodInner(){
            int num=30;//内部方法局部变量
            System.out.println(num);//局部变量，就近原则
            System.out.println(this.num);//内部类成员变量
            System.out.println(Outer.this.num);//外部类成员变量

        }
    }
}
