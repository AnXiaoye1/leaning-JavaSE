package xyz.anxiaoye.new_characteristics_of_Java.thread.synchronized_problem;

/**
 * 卖票时出现重复和不存在的票怎么解决
 * Create by zhuye on 2020/2/25.
 * 1.创建runnable接口的实现类
 */
public class RunnableImpl1 implements Runnable {

    /**
     * 设置共享线程票源
     */
    private int ticket = 100;

    /**
     * 创建一个锁对象,在 run 方法外面创建保证了锁的唯一性
     */
    Object object=new Object();

    /**
     * 2.重写Runnable接口中的run方法，并实现具体任务
     */
    @Override
    public void run() {
        //让票一直买完为止
        while (true) {
            sellTicket();
        }
    }
    /**
     * 同步方法
     * 会把内部代码锁住，只让一个线程执行
     * 同步方法的锁对象是谁？
     * 是实现类对象RunnableImpl1
     */
    public synchronized void sellTicket(){
        //判断是否有票
        if (ticket > 0) {
            //提高安全问题出现的概率，让程序睡眠
            try {
                Thread.sleep( 10 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println( Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票" );
            ticket--;
        }
    }
}
