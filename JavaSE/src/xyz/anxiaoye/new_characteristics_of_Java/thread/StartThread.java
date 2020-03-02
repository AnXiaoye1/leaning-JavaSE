package xyz.anxiaoye.new_characteristics_of_Java.thread;

/**
 * @ClassName StartThread 创建线程
 * Create by zhuye on 2020/2/24.
 */
public class StartThread {
    public static void main(String[] args) {
        Person one = new Person("猪哥亮");
        one.run();

        Person two = new Person("曹阿蛮");
        two.run();
    }
}
