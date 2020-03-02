package xyz.anxiaoye.new_characteristics_of_Java.thread;

/**
 * @ClassName OneMoreThread
 * Create by zhuye on 2020/2/24.
 */
public class OneMoreThread {
    public static void main(String[] args) {
        //3.创建Thread类的子类对象
        MyThread myThread=new MyThread();
        //4.调用Thread类的start()方法
        myThread.run();
        myThread.setName( "光头强" );//设置线程名
        myThread.start();

        //开启另外2个线程
        new MyThread("熊大").start();
        new MyThread("熊二").start();

        System.out.println(Thread.currentThread().getName());
        //主线程的方法
        for (int i = 0; i < 60; i++) {
            System.out.println( "main:" + i );
            //使用Thread的sleep方法，让程序睡眠1秒钟
            try {
                Thread.sleep( 1000 );
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
