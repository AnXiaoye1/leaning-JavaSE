package xyz.anxiaoye.face_object_code.polymorphic;

/**
 * 子类：狗
 */
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃shit");
    }

    public void watchHouse(){
        System.out.println("狗看家");
    }
}
