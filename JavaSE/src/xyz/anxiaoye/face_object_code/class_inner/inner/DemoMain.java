package xyz.anxiaoye.face_object_code.class_inner.inner;

/**
 * @ClassName DemoMain
 * Create by zhuye on 2020/2/8.
 * 如果接口的实现类（或者父类的子类）只使用唯一的一次
 * 那么这种情况下可以省略该类的定义，直接使用匿名内部类来实现
 * 匿名内部类定义格式：
 * 接口名 对象名=new 接口名(){
 *      //覆盖重写所有抽象方法
 *  };
 *  对格式 new 接口名(){...};的解析：
 *  1.new代表创建对象的过程
 *  2.接口名是匿名内部类要实现哪个接口
 *  3.{...}是匿名内部类的内容
 *
 *  【注意】
 *  匿名内部类，在创建对象的时候，只能使用唯一的一次
 *  匿名对象，在调用方法的时候，只能调用唯一的一次
 */
public class DemoMain {
    public static void main(String[] args) {
        /**
         * 省略定义接口的实现类，直接用【匿名内部类】的方式实现
         */
        MyInterface myInterface=new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现的方法");
            }
        };
        myInterface.method();
    }
}
