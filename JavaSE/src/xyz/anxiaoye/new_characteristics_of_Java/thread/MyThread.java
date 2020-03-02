package xyz.anxiaoye.new_characteristics_of_Java.thread;

/**
 * @ClassName MyThread
 * 1.创建一个 Thread 类的子类
 */
public class MyThread extends Thread {

    //构造器来设置线程名称

    public MyThread() { }

    public MyThread(String name) {
        super(name);//将参数传给父类，让父类给子类线程起名
    }

    //2.重写 Thread 类中的 run() 方法
    @Override
    public void run() {
        //获取线程名称
//        System.out.println(getName());
        System.out.println(Thread.currentThread().getName()); //静态方式获取线程名

        for (int i = 0; i < 10; i++) {
            System.out.println( "run:" + i );
        }
    }
}
