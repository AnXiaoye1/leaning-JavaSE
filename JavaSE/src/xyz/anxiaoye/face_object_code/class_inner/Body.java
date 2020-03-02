package xyz.anxiaoye.face_object_code.class_inner;

/**
 * @ClassName Body
 * Create by zhuye on 2020/2/8.
 */
public class Body {
    //成员内部类
    public class Heart{
        //内部类的方法
        public void dancing(){
            System.out.println("心脏跳动！");
            System.out.println(name);
        }
    }

    //外部类的成员变量
    private String name;

    //外部类的方法
    public void methodBody(){
        System.out.println("外部类的方法");
        //内部类的匿名对象
        new Heart().dancing();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
