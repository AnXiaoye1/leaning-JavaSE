package xyz.anxiaoye.face_object_code.class_of_String;

import java.util.Scanner;

/**
 * 题目：
 * 键盘输入一个字符串，并且统计各种字符串出现的次数
 * 钟类有：大写、小写字母，数字，其他
 * <p>
 * 思路：
 * 1.键盘输入，Scanner
 * 2.键入的是字符串，String str=sc。next（）；
 * 3.定义4个变量，分别代表4种字符出现的字数
 * 4.需要对字符串的一个字一个字的检查，String->char[],方法就是toCharArray
 * 5.遍历char[],对当前字符类型判断
 * 6.打印输出
 */
public class PractiseTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.println( "请输入一个字符串：" );
        String input = sc.next();

        int countUpper = 0;//大写字母
        int countLower = 0;//小写字母
        int countNumber = 0;//数字
        int countOther = 0;//其它

        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];//当前单个字符
            if ('A' <= ch && ch <= 'Z') {
                countUpper++;
            } else if ('a' <= ch && ch <= 'z') {
                countLower++;
            } else if ('0' <= ch && ch <= '9') {
                countNumber++;
            }else {
                countOther++;
            }
        }

        System.out.println("大写字母有："+ countUpper);
        System.out.println("小写字母有："+ countLower);
        System.out.println("数字有："+ countNumber);
        System.out.println("其他字符有："+ countOther);

    }
}
