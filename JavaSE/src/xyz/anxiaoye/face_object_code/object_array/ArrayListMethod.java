package xyz.anxiaoye.face_object_code.object_array;

import java.util.ArrayList;

/**
 * ArrayList中常用的方法：
 * public boolean add(E e); 向集合中添加元素，参数类型和泛型一致
 * 【备注】
 * 对于ArrayList集合来说，add添加动作一定成功，返回值可用可不用
 * 对于其他集合来说，add动作不一定成功
 * public E get(int index); 从集合中获取元素，参数是索引编号，返回值是对应位置的元素
 * public E remove(int index); 从集合中删除元素，参数是索引编号，返回值是被删除的元素
 * public int size(); 获取集合的长度尺寸，返回值是集合中包含的元素个数
 */
public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println( list );

        //添加元素
        boolean success = list.add( "柳岩" );
        System.out.println( list );
        System.out.println( "添加的动作是否成功：" + success );

        list.add( "赵丽颖" );
        list.add( "高圆圆" );
        list.add( "刘亦菲" );

        System.out.println( list );
        //从集合中获取元素，get，索引值从0开始
        String name = list.get( 1 );
        System.out.println( "1号索引位置是：" + name );

        //从集合中删除元素，remove，索引值从0开始
        String who = list.remove( 0 );
        System.out.println( "被删除的人是：" + who );
        System.out.println( list );

        //获取集合的长度
        int size = list.size();
        System.out.println( "集合的长度是：" + size );
        
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get( i ));
        }
    }
}
