package xyz.anxiaoye.face_object_code.class_of_Arrays;

import java.util.Arrays;

/**
 * 题目：
 * 随机生成一个字符串，利用Arrays类进行升序排列，并倒序打印
 * 思路：
 * 1.可以利用Random生成该字符串
 * 2.字符串->数组 ，用toCharArray
 * 3.利用Arrays.sort(数组)进行升序
 * 4.利用for循环倒序打印
 */
public class TestArrays {
    public static void main(String[] args) {
        String string = "sdfaskdfmaskcsywerotnmzxvnbaf";
        //String -> 数组,toCharArray
        char[] chars = string.toCharArray();
        //升序排列
        Arrays.sort( chars );
        System.out.println(Arrays.toString( chars ));

        //倒序打印，技巧：chars.forr +Enter键
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }

    }
}
