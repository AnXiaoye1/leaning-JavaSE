package xyz.anxiaoye.face_object_code.class_inner;

/**
 * @ClassName Out
 * Create by zhuye on 2020/2/8.
 * 局部内部类：一个类定义在一个方法里面
 * 这个类属于这个方法，不能超出范围
 */
public class Out {

    //外部类成员方法
    public void methodOut(){
        //局部内部类
        class In{
            int num=10;
            //局部内部类的方法
            public void methodIn(){
                System.out.println(num);
            }
        }
        //创建局部内部类对象
        In in=new In();
        in.methodIn();
    }
}
