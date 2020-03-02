package xyz.anxiaoye.face_object_code.class_of_String;

/**
 * @ClassName CreateString
 * 创建String的4种方法
 */
public class CreateString {
    public static void main(String[] args) {
        //使用空参构造
        String str1=new String();//小括号为空，表示什么都没有
        System.out.println("第一个字符串是："+str1);

        //使用字符数组来创建
        char[] chars={'A','B','C','D'};
        String str2=new String(chars);
        System.out.println("第二个字符串是："+str2);

        //使用字节数组来创建
        byte[] bytes={97,98,99,100};
        String str3=new String(bytes);
        System.out.println("第三个字符串是："+str3);

        //直接创建
        String str4="Hello World!";
        System.out.println("第四个字符串是："+str4);
    }
}
