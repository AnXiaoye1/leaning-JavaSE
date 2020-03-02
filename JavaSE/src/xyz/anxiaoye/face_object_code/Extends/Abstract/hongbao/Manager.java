package xyz.anxiaoye.face_object_code.Extends.Abstract.hongbao;

import java.util.ArrayList;
import java.util.Random;

/**
 * @ClassName Manager 群主的类
 * @Author zhuye
 * @Date 2020/2/2 18:32
 */
public class Manager extends User {
    public Manager() {

    }

    public Manager(String name, int money) {
        super( name, money );
    }

    /**
     * 平均红包
     *
     * @param totalMoney 总金额
     * @param count      红包个数
     * @return
     */
    public ArrayList<Integer> send(int totalMoney, int count) {
        //首先需要有一个集合来存储若干红包金额
        ArrayList<Integer> redList = new ArrayList<>();

        //需要看余额可够,群主当前余额
        int leftMoney = super.getMoney();

        //判断钱是否够
        if (totalMoney > leftMoney) {
            System.out.println( "余额不足！" );
            //返回空集合
            return redList;
        }
        //扣钱，即重新设置余额
        super.setMoney( leftMoney - totalMoney );

        //发红包需要拆分为count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;//余数，就是零头

        //除不开的零头，放在最后一个红包中,单独处理
        //把红包一个一个放在集合中
        for (int i = 0; i < count - 1; i++) {
            redList.add( avg );
        }
        int last = avg + mod;
        redList.add( last );

        return redList;
    }


    /**
     * 手气红包
     *
     * @param totalMoney 总金额
     * @param totalCount 红包个数
     * @return
     */
    public ArrayList<Integer> luckyRed(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        //随机红包策略：最少1分钱，最多不超过剩余金额的平均数的2倍
        //公式：1 + random.nextInt(leftMoney/leftCount * 2);
        Random random = new Random();//随机数生成器

        //额外定义2个变量，用来存储剩余金额和剩余次数
        int leftMoney = totalMoney;
        int leftCount = totalCount;

        for (int i = 0; i < totalCount - 1; i++) {
            //按照公式随机生成金额
            int money = random.nextInt( leftMoney / leftCount * 2 ) + 1;
            list.add( money );//把红包包好放集合中
            leftMoney -= money;//剩下的金额减少
            leftCount--;//剩余红包个数，递减
        }
        //最后一个红包不用随机，直接放到集合
        list.add( leftMoney );
        return list;
    }
}
