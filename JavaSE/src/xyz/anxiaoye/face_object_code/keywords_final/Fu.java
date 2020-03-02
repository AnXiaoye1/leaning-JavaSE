package xyz.anxiaoye.face_object_code.keywords_final;

/**
 * final修饰一个方法，那么这个方法不能被覆盖重写
 * 【对于类、方法来说，abstract关键字和final关键字不能同时使用，因为矛盾】
 * abstract：抽象方法所在类一定是抽象类，要有子类，方法要覆盖重写
 * final：最终的，不可改变的，不能有子类或方法不能覆盖重写
 *
 * 对于成员变量来说，如果用final修饰，这个成员变量是不可变的
 * 1.由于成员变量具有默认值，所以用final修饰后，必须手动赋值，就不会再有默认值了
 * 2.对于final的成员变量，要么直接赋值，要么通过构造方法赋值，二选一
 * 3.必须保证类当中所以重载的构造方法中，都会对final的成员变量赋值
 */
public class Fu {

    private final String name;

    public Fu() {
        name="刘亦菲";
    }

    public Fu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //this.name = name;
    }

    public final void method(){
        System.out.println("这是一个父类方法");
    }
}
