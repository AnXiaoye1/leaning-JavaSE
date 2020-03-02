
package xyz.anxiaoye.face_object_code.packaged;
/**
 * @ClassName Person
 * 定义Person的年龄时，无法阻止不合理的数值被设置进来
 * 解决方法：使用privat关键字将需要保护的成员变量进行修饰
 *
 * 一旦使用private进行修饰，那么本类中任然可以随意访问
 * 但是，超出本类范围之外就不能直接访问
 *
 * 间接访问private成员变量，需要定义一对getter/setter方法
 */
public class Person {
    private String name;
    private int age;
    public void show(){
        System.out.println("我是："+name+". 年龄："+age);
    }

    //传进来的参数和定义的参数同名时用this关键字
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int number) {
        if (number>0 & number<100){
            age = number;
        }else {
            System.out.println("非法年龄！！！");
        }
    }

    public String getName() {
        return name;
    }

    //此方法用于获得age
    public int getAge() {
        return age;
    }
}
