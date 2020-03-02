package xyz.anxiaoye.face_object_code.object_array;

import java.util.ArrayList;

/**
 * @ClassName ArrayListBasic
 * 如果要在集合中使用基本数据类型，则要使用基本类型对应的“包装类”
 * 基本类型  包装类（引用类型，都位于java.lang包下）
 * byte      Byte
 * short     Short
 * int       Integer     【特殊】
 * long      Long
 * float     Float
 * double    Double
 * char      character   【特殊】
 * boolean   Boolean
 *【注意】
 * 从JDK 1.5 开始，支持自动拆箱、自动装箱
 * 自动拆箱：包装类型 -> 基本类型
 * 自动装箱：基本类型 -> 包装类型
 */
public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add( 100 );
        list.add( 351 );
        list.add( 657575 );
        list.add( 8534 );
        list.add( 2345 );
        System.out.println(list);

        int number=list.get( 2 );
        System.out.println(number);
    }
}
