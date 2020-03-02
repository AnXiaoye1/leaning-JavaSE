package xyz.anxiaoye.new_characteristics_of_Java.generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName DemoGeneric 泛型学习
 * Create by zhuye on 2020/2/23.
 */
public class DemoGeneric {

    public static void main(String[] args) {
        collectionUnuseGeneric();
        collectionUseGeneric();
    }

    /**
     * 创建集合对象时，不使用泛型
     * 默认类型是Object类型，可接受任意类型数据，但不安全
     */
    private static void collectionUnuseGeneric() {
        ArrayList list = new ArrayList();
        list.add( "zhuyee" );
        list.add( 95911 );

        //使用迭代器来遍历集合
        //获取迭代器
        Iterator it = list.iterator();
        //使用迭代器中的hasNext()和next()遍历
        while (it.hasNext()){
            //取出元素也是Object类型
            Object obj= it.next();
            System.out.println(obj);

            //使用String类的length方法获取字符串的长度，不能使用
            //需要向下转型
            //会抛出类型转换异常：java.lang.ClassCastException:
            // java.lang.Integer cannot be cast to java.lang.String 异常
            String str = (String) obj;//类型转换
            System.out.println(str.length());
        }
    }

    /**
     * 创建集合对象使用泛型
     * 避免了类型转换的麻烦
     * 把运行期异常，提升到编译期
     */
    private static void collectionUseGeneric() {
        ArrayList<String> list= new ArrayList<>();
        list.add( "zhuyee" );

        //使用迭代器遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s+":"+s.length());
        }
    }
}
