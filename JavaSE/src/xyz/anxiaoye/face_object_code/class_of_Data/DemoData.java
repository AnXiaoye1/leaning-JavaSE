package xyz.anxiaoye.face_object_code.class_of_Data;


/**
 * @ClassName DemoData
 * Create by zhuye on 2020/2/21.
 *
 * Java.util.Data;表时日期和时间的类
 * Data表示时间的瞬间，精确到毫秒。
 * --------------------------------
 * 毫秒的作用：可以多时间和日期进行计算
 * 可以时间转换为毫秒，然后讲毫秒转换为时间
 * --------------------------------
 * 把日期转换为毫秒：
 *      当前日期：
 *      时间原点（0毫秒）：即 1970 年 1 月 1 日 00:00:00 GMT）以来的指定毫秒数
 *      就是计算当前日期到时间原点一共经历了多少毫秒
 * 把毫秒转换为时间：
 *
 *
 */
public class DemoData {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//获取当前时间到1970 年 1 月 1 日 00:00:00 GMT）的毫秒数

    }
}
