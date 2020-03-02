package xyz.anxiaoye.face_object_code.class_of_Random;

import java.util.Random;

/**
 * 生成1-n的随机数
 */
public class DemoRandom {
    public static void main(String[] args) {
        int n=10;
        Random random=new Random();
        for (int i = 0; i < 100; i++) {
            int result = random.nextInt(n)+1;
            System.out.println(result);
        }
    }
}
