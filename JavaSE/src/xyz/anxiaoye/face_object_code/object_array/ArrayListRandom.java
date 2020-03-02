package xyz.anxiaoye.face_object_code.object_array;

import java.util.ArrayList;
import java.util.Random;

/**
 * 题目：
 * 随机产生6个1-33的整数，放到集合中，并遍历集合
 *
 * 思路：
 * 1.需要6个数字，创建一个集合，<Integer>
 * 2.产生随机数，用到Random
 * 3.6个随机数，用到for循环
 * 4.循环内调的随机数处理
 * 5.添加到集合中要用add方法
 * 6.遍历集合：for循环、get、size
 */
public class ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Random random=new Random();
        //产生随机数并放入集合
        for (int i = 0; i < 6; i++) {
            int number = random.nextInt( 33 )+1;
            list.add( number );
        }
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get( i ));
        }
    }
}
