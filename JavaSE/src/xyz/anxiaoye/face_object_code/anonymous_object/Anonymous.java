package xyz.anxiaoye.face_object_code.anonymous_object;

/**
 * @ClassName Anonymous
 * 创建对象的标准格式：
 * 类名 对象名=new 类名（）；
 * 匿名对象：只有右边的对象
 * 【注意】
 * 匿名对象只能使用一次，下次使用还得在创建一个新的
 * 若一个对象只需要使用唯一一次，就可以用
 */

public class Anonymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "刘亦菲";
        one.show();
        System.out.println( "----------------------------------------" );

        //匿名对象
        new Person().name = "李逍遥";
        new Person().show();
    }
}
