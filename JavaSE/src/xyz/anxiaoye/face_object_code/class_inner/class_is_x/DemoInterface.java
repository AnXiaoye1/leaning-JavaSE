package xyz.anxiaoye.face_object_code.class_inner.class_is_x;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName DemoInterface
 * Create by zhuye on 2020/2/8.
 * java.util.List 是 ArrayList 所实现的接口
 */
public class DemoInterface {
    public static void main(String[] args) {
        //左边接口名称，右边实现类名称，多态写法
        List<String> list=new ArrayList<>();

        List<String> result=addName( list );
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get( i ));
        }
    }

    public static List<String> addName(List<String> list){
        list.add( "古力娜扎" );
        list.add( "德玛西亚" );
        list.add( "扎西德勒" );
        list.add( "沙扬娜拉" );
        return list;
    }
}
