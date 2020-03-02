package xyz.anxiaoye.new_characteristics_of_Java.IO.listrable;

import java.io.*;

/**
 * @ClassName ObjectSerializable 对象序列化：就是将对象存储起来
 * Create by zhuye on 2020/2/29.
 */
public class ObjectSerializable {
    public static void main(String[] args) throws IOException {
        String file="D:\\Code\\Java\\demo\\obj.dat";
        //1对象序列化
        ObjectOutputStream oos=new ObjectOutputStream(
                new FileOutputStream( file )
        );
        Student student=new Student( "001","张无忌",22 );
        oos.writeObject( student );
        oos.flush();
        oos.close();

        //对象反序列化
        ObjectInputStream ois=new ObjectInputStream(
                new FileInputStream( file )
        );
        try {
            Student student1= (Student) ois.readObject();
            System.out.println(student1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ois.close();
    }
}
