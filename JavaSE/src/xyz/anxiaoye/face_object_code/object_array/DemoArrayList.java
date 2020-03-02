package xyz.anxiaoye.face_object_code.object_array;

import java.util.ArrayList;

/**
 * @ClassName DemoArrayList
 * ArrayList集合的长度可以随意变换
 * 对于ArrayList，有一个尖括号<E>代表泛型
 * 泛型，就是装在集合内的所有元素，全部是统一的某种类型
 * 【注意】
 * 1.泛型只能是引用类型，不能是基本类型
 * 2.对于ArrayList集合来说，直接打印得到的不是地址值，而是内容，若内容是空，则得到空的[]
 */
public class DemoArrayList {
    public static void main(String[] args) {
        /* 创建一个ArrayList集合，集合的名称是list，里面装的全都是String字符串类型的数据
         * 从JDK1.7开始，右侧尖括号内部可不写内容，但<>本身还要写
         */
        ArrayList<String > list=new ArrayList<>();
        System.out.println(list);

        /*向集合中添加数据，用add方法*/
        list.add( "王语嫣" );
        list.add( "木婉清" );
        list.add( "钟灵儿" );
        System.out.println(list);
    }
}
