package xyz.anxiaoye.face_object_code.class_of_Arrays;

import java.util.Arrays;

/**
 * java.util.Arrays包是一个与数组相关的工具类，里面提供了许多静态方法，用来对数组的操作
 * public static String toString(数组);将参数数组变成字符串（默认格式：[元素1，元素2，...]）
 * public static void sort(数组);按照默认的升序对数组进行排序
 * 【备注】
 * 1.如果是数字，默认按数值大小升序
 * 2.如果是字符串，默认按字母顺序
 * 3.如果是自定义类型，需要有Comparable或Comparator接口的支持【后面学习】
 */
public class DemoArrays {
    public static void main(String[] args) {
        int[] intArray={12,53,64,6,34,234,34};
        //将int[]数组转换为字符串
        String str= Arrays.toString( intArray );
        System.out.println(str);

        //将int[]数组进行排序，然后转换为字符串输出
        Arrays.sort( intArray );
        System.out.println(Arrays.toString( intArray ));

        String[] strings={"bbb","ccc","aaa"};
        Arrays.sort( strings );
        System.out.println(Arrays.toString( strings ));
    }
}
