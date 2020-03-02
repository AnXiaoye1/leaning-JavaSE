package xyz.anxiaoye.face_object_code.object_array;

import java.sql.SQLOutput;
import java.util.ArrayList;

/**
 * 题目：
 * 定义指定格式打印集合的方法（ArrayList类型作为参数），使用{}括起来，使用#分隔
 */
public class ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add( "乔峰" );
        list.add( "段誉" );
        list.add( "虚竹" );
        printArrayList( list );
    }
    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get( i );
            if (i==list.size()-1){
                System.out.println(name+"}");
            }else {
                System.out.print(name+"-+-");
            }
        }
    }
}

