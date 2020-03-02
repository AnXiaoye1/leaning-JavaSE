package xyz.anxiaoye.face_object_code.class_of_Random;
import java.util.Random;

/**
 * @ClassName UseRandom 用于生成随机数
 * 1.导包：import java.util.Random;
 * 2.创建：Random r=new Random();
 * 3.使用：获取一个随机的int数字，范围有正负，int i=r.nextInt();
 *      获取一个int随机数（左闭右开），int i=r.nextInt(100); 表示[0,99）
 * @Author zhuye
 */
public class UseRandom {
    public static void main(String[] args) {
        Random random=new Random();
        int num=random.nextInt();
        System.out.println("随机数是："+num);
        for (int i = 0; i <100 ; i++) {
            int number = random.nextInt( 50 ); /*[0-49]*/
            System.out.println(number);
        }
    }
}
