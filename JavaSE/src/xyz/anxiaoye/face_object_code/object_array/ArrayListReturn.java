package xyz.anxiaoye.face_object_code.object_array;

import java.util.ArrayList;
import java.util.Random;

/** ArrayList作为方法返回值和参数【都是地址值】
 * 题目：
 * 用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放入小集合中
 * 要求使用自定义的方法来实现筛选
 * 分析：
 * 1.需要创建一个集合，来存int数字
 * 2.随机数用Random，nextInt
 * 3.循环20次，放入大集合，for循环，add
 * 4.定义一个方法，用来筛选
 * 筛选：根据大集合，筛选符合要求的元素，得到小集合
 * 三要素：
 * 返回值类型：ArrayList小集合
 * 方法名称：getSmallList
 * 参数列表：ArrayList大集合
 * 5.判断是偶数：number%2==0
 * 6.如果是偶数就放到小集合中
 */
public class ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int number = random.nextInt();
            bigList.add( number );
        }

        //定义一个集合来接收结果
        ArrayList<Integer> smallList=getSmallList( bigList );
        System.out.println("偶数一共有多少个："+smallList.size());
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get( i ));
        }

    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList) {
        //创建一个小集合，用来装偶数
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int number = bigList.get( i );
            if (number % 2 == 0) {
                smallList.add( number );
            }
        }
        return smallList;
    }
}
