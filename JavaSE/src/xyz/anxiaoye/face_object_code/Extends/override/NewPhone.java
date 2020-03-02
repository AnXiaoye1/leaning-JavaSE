package xyz.anxiaoye.face_object_code.Extends.override;


public class NewPhone extends Phone {
    @Override
    public void show(){
        super.show();//把父类的方法拿过来复用
        System.out.println("显示姓名！");
        System.out.println("显示头像！");
    }
}
