package xyz.anxiaoye.face_object_code.Extends.Abstract.hongbao;

import java.util.ArrayList;
import java.util.Random;

/**
 * @ClassName Member 普通类
 * @Author zhuye
 * @Date 2020/2/2 18:51
 */
public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super( name, money );
    }

    public void receive(ArrayList<Integer> list) {
        //从多个红包中随机取一个
        //随机取一个集合中的索引编号
        int index = new Random().nextInt( list.size() );
        //根据索引，从集合中删除一个元素，并且得到被删除的红包给自己
        int delta = list.remove( index );
        //当前成员本来有的金额
        int money = super.getMoney();
        // 抢到红包后的金额,设置回去
        super.setMoney( delta + money );
    }
}
