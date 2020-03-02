package xyz.anxiaoye.face_object_code.polymorphic;

/**
 * 如何才能知道一个父类引用的对象，是什么子类？
 * 格式：
 * 对象 instanceof 类名
 * 得到一个Boolean值结果，就是判断当前对象能否可以当成后面类的实例
 */
public class DemoInstanceof {
    public static void main(String[] args) {
        Animal animal = new Cat();

        //如果调用子类特有方法，需要向下转型
        //判断父类引用是不是Dog类的实例
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }

        giveMeAPat( animal );

    }

    public static void giveMeAPat(Animal animal){
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
