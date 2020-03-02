package xyz.anxiaoye.new_characteristics_of_Java.thread.synchronized_problem;

/**
 * @ClassName ThreadSynchronization
 * Create by zhuye on 2020/2/25.
 * 创建3个线程，同时开启
 */
public class ThreadSynchronization {
    public static void main(String[] args) {
        //3.创建Runnable接口的实现类对象
        RunnableImpl1 run = new RunnableImpl1();

        //4.创建Thread类对象，在构造方法中传递Runnable接口的实现类对象
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);

        //5.调用Thread的start方法开启线程
        t1.start();
        t2.start();
        t3.start();
    }
}
