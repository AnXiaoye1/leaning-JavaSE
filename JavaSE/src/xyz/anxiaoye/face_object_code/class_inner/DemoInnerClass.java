package xyz.anxiaoye.face_object_code.class_inner;

/**
 * @ClassName DemoInnerClass
 * 内部类：一个类内部包含另一个类
 * 分类：
 * 1.成员内部类 ：内用外，可随意；外用内，借助内部对象
 * 使用方法：
 * 【1】间接使用：在外部类的方法中，使用内部类，在Main方法中调用外部类的方法
 * 【2】直接使用：外部类名.内部类名 对象名 = new 外部类名().new 内部类();
 * 2.局部内部类（包含匿名内部类）
 */
public class DemoInnerClass {
    public static void main(String[] args) {
        System.out.println("------------Body类-------------");
        //【1】间接使用
        Body body=new Body();
        body.methodBody();

        //【2】直接调用
        Body.Heart heart=new Body().new Heart();
        heart.dancing();

        System.out.println("------------Outer类-------------");
        Outer.Inner inner=new Outer().new Inner();
        inner.methodInner();

        System.out.println("------------Out类-------------");
        Out out=new Out();
        out.methodOut();
    }

}
