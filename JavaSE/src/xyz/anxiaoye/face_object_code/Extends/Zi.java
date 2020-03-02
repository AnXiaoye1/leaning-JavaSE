package xyz.anxiaoye.face_object_code.Extends;

/**
 * 子类
 * super（用于访问父类内容）关键字的用法
 * （1）.在子类的成员方法中，访问父类的成员变量
 * （2）.在子类的成员方法中，访问父类的成员方法
 * （3）.在子类的成员方法中，访问父类的构造方法
 *
 * this（用于访问本类的内容）关键字的用法
 * 【1】.在本类的成员方法中，访问本类的成员变量
 * 【2】.在本类的成员方法中，访问另一个成员方法
 * 【3】.在本类构造方法中，访问另一个构造方法
 *
 * 注意：super 和 this 不能同时使用。
 */
public class Zi extends Fu {
    int num = 20;


    public Zi(){
//        super();//默认隐藏的方法，不写也会调用
        super(534);//（3)在调用父类重载的构造方法
        System.out.println("子类无参构造方法！");//后有

    }
    public Zi(int number){
        this();//【3】本类有参构造，调用本类无参构造。【该语句必须是该方法的第一句】
        System.out.println("子类有参构造方法！");
    }

    public void method() {
        int num = 30;
        //30，局部变量
        System.out.println("局部变量："+num);
        //【1】20，本类的成员变量
        System.out.println("子类成员变量："+this.num);
        //（1）10，父类的成员变量
        System.out.println("父类成员变量："+super.num);
        super.Method();//（2）访问父类的成员方法
        this.Method();//【2】访问本类的另一个成员方法

    }
    public void methodZi(){
        System.out.println("子类成员方法执行！");
    }
    //覆盖父类的方法，返回String类型的值
    @Override
    public String Method(){
        System.out.println("子类重名成员方法执行！");
        return null;
    }
}
