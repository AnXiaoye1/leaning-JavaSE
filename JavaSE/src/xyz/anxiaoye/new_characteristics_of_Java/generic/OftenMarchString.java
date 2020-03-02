package xyz.anxiaoye.new_characteristics_of_Java.generic;

import xyz.anxiaoye.basic_coding.array.Array;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName OftenMarchString 泛型的通配符
 * Create by zhuye on 2020/2/23.
 */
public class OftenMarchString {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add( 95 );
        list1.add( 911 );

        ArrayList<String> list2=new ArrayList<>();
        list2.add( "zhu" );
        list2.add( "yee" );

        printArray(list1);
        printArray( list2 );
    }
    /**
     * 定义一个方法，能遍历所有类型的ArrayList集合
     * 此时，并不知道集合是什么类型的，可以使用泛型的通配符，来接收数据
     * 【泛型没有继承关系】
     */
    public static void printArray(ArrayList<?> list){
        //使用迭代器遍历集合
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
