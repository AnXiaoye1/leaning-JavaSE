package xyz.anxiaoye.new_characteristics_of_Java.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName RunnableImpl 卖票系统
 * Create by zhuye on 2020/2/25.
 * 1.创建runnable接口的实现类
 */
public class RunnableImpl implements Runnable {

    /**
     * 设置共享线程票源
     */
    private int ticket = 100;
    /**
     * 在成员位置创建ReentrantLock对象
     */
    Lock lock=new ReentrantLock();

    /**
     * 2.重写Runnable接口中的run方法，并实现具体任务
     */
    @Override
    public void run() {
        //让票一直买完为止
        while (true) {
            lock.lock();
            //判断是否有票
            if (ticket > 0) {
                //提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep( 10 );
                    System.out.println( Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票" );
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        }
    }
}
