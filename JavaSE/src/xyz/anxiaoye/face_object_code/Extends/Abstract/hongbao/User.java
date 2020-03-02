package xyz.anxiaoye.face_object_code.Extends.Abstract.hongbao;

/**
 * @ClassName User
 * @Author zhuye
 * @Date 2020/2/2 18:27
 * @Version 1.0
 */
public class User {
    //姓名
    private String name;
    //余额
    private int money;

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    /**显示姓名及余额*/
    public void show() {
        System.out.println( "我叫：" + name + ", 剩余金额：" + money );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
