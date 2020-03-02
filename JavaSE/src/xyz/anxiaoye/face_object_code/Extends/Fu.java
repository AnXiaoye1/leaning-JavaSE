package xyz.anxiaoye.face_object_code.Extends;

/**
 * 父类
 */
public class Fu {
    int num=10;

    public Fu(){
        System.out.println("父类无参构造方法！");//先有
    }
    public Fu(int number){
        System.out.println("父类有参构造方法！");
    }
    public void methodFu(){
        System.out.println("父类成员方法执行！");
    }
    public Object Method(){
        System.out.println("父类重名成员方法执行！");
        return null;
    }
}
