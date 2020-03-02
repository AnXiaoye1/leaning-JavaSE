package xyz.anxiaoye.face_object_code.object_array;

/**
 * @ClassName DemoArray
 * 定义一个数组，用来存储3个Person对象
 * 缺点：一旦创建数组，程序运行时长度不可改变
 */
public class DemoArray {
    public static void main(String[] args) {
        Person[] array=new Person[3];

        Person one=new Person("王语嫣",18);
        Person two=new Person("木婉清",16);
        Person three=new Person("钟灵",15);

        /*将one中的地址值赋值到数组的0号元素*/
        array[0] = one;
        array[1] = two;
        array[2] = three;

        /*这里输出的都是地址值*/
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println(array[1].getName());

    }
}
