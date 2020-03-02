package xyz.anxiaoye.new_characteristics_of_Java.IO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @ClassName DataInDemo
 * Create by zhuye on 2020/2/27.
 */
public class DataInDemo {
    public static void main(String[] args) throws IOException {
        String file = "D:\\Code\\Java\\demo\\demo1.txt";
        /**
         * 读出数据
         */
        DataInputStream dis = new DataInputStream( new FileInputStream( file ) );
        int i = dis.readInt();
        System.out.println(i);
        long l=dis.readLong();
        System.out.println(l);
        double d=dis.readDouble();
        System.out.println(d);
        float f=dis.readFloat();
        System.out.println(f );
        String s=dis.readUTF();
        System.out.println(s);
        dis.close();
    }
}
