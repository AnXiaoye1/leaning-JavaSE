package xyz.anxiaoye.face_object_code.class_of_Random;

import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName GuessNumberGame
 * 题目：猜数字游戏
 * 思路：
 * 1.随机产生一个数，一旦产生不再改变，用Random的nextInt（）方法
 * 2.获取键盘输入数字，用Scanner的nextInt（）方法、
 * 3.对于得到的数字进行判断（if）
 *  若大了，提示大了并重新输入
 *  若小了，提示小了并重新输入
 *  若相等，则游戏结束
 * 4.重新来，就要用while（true）
 */
public class GuessNumberGame {
    public static void main(String[] args) {
        Random r=new Random();
        int number = r.nextInt( 100 )+1; //[1,100]
        Scanner scan= new Scanner( System.in );
        /*如果限定猜的次数，则用for循环*/
        while (true){
            System.out.println("请输入你猜的数字：");
            int geuss=scan.nextInt();
            if (geuss>number){
                System.out.println("太大了，请重试！");
            }else if(geuss<number){
                System.out.println("太小了，请重试！");
            }else {
                System.out.println("恭喜你！猜中了！");
                break;//猜中不循环了34
            }
        }
    }
}
