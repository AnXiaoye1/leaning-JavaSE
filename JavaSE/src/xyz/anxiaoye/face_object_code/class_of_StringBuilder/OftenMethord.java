package xyz.anxiaoye.face_object_code.class_of_StringBuilder;

/**
 * @ClassName OftenMethord
 * Create by zhuye on 2020/2/21.
 * StringBuilder的常用方法
 * public StringBuilder append(...); 添加任意类型的字符串数据，并且返回当前对象自身
 */
public class OftenMethord {
    public static void main(String[] args) {
        //创建StringBuilder对象
        StringBuilder bu = new StringBuilder();
        //使用append方法往StringBuilder种添加数据
        StringBuilder bu2 = bu.append( "abc" );
        System.out.println( bu );
        System.out.println( bu2 );
        System.out.println( bu == bu2 );//比较的是地址
    }
}
