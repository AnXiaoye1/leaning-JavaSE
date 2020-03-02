package xyz.anxiaoye.face_object_code.polymorphic;

/**
 * 子类：猫
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){
        System.out.println("猫捉老鼠");
    }
}
