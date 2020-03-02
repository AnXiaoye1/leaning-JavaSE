package xyz.anxiaoye.face_object_code.polymorphic;

public class Zi extends Fu {

    int num = 20;

    @Override
    public void shouNum(){
        System.out.println(num);
    }

    @Override
    public void method(){
        System.out.println("这是一个子类方法！");
    }

    public void methodZi(){
        System.out.println("这是一个子类特有方法！");
    }
}
