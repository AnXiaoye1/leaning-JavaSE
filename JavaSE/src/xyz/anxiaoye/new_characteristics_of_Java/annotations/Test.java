package xyz.anxiaoye.new_characteristics_of_Java.annotations;

/**
 * @ClassName Test
 * Create by zhuye on 2020/2/25.
 */
public class Test {
    public static void main(String[] args) {

        //使用类加载器加载类
        try{
            Class c=Class.forName( "xyz.anxiaoye.new_characteristics_of_Java.annotations.Child" );
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        Person person =new Child();
        person.sing();
    }
    @SuppressWarnings( "deprecation" ) //忽略过时的警告
    public void sing(){
        Person p=new Child();
        p.sing();
    }
}
