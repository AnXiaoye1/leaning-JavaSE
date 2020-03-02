package xyz.anxiaoye.face_object_code.Extends.Abstract.hongbao;

import java.util.ArrayList;

/**
 * @ClassName MainRedPackage
 * @Author zhuye
 * @Date 2020/2/2 22:27
 * @Version 1.0
 */
public class MainRedPackage {
    public static void main(String[] args) {
        Manager manager=new Manager("群主",100);
        Member one=new Member("成员1",0);
        Member two=new Member("成员2",0);
        Member three=new Member("成员3",0);
        Member four=new Member("成员4",0);

        manager.show();
        one.show();
        two.show();
        three.show();
        four.show();
        System.out.println("============平均红包==========");
        //群主总共发40块钱，分成3份
        ArrayList<Integer> list=manager.send( 50,4 );
        //3个成员来抢红包
        one.receive( list );
        two.receive( list );
        three.receive( list );
        four.receive( list );
        //收发完红包打印一下当前状态
        manager.show();
        one.show();
        two.show();
        three.show();
        four.show();


        System.out.println("===========手气红包==========");
        //群主总共发40块钱，随机分成3份
        ArrayList<Integer> redList=manager.luckyRed( 70,4 );
        //3个成员来抢红包
        one.receive( redList );
        two.receive( redList );
        three.receive( redList );
        four.receive( redList );
        //收发完红包打印一下当前状态
        manager.show();
        one.show();
        two.show();
        three.show();
        four.show();
    }
}
