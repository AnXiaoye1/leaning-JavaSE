package xyz.anxiaoye.new_characteristics_of_Java.IO;

import java.io.*;

/**
 * @ClassName DataIODemo
 * Create by zhuye on 2020/2/27.
 */
public class DataIODemo {
    public static void main(String[] args) throws IOException {
        String file = "D:\\Code\\Java\\demo\\demo1.txt";
        /**
         * 写入数据
         */
        DataOutputStream dos = new DataOutputStream( new FileOutputStream( file ) );
        dos.writeInt( 10 );
        dos.writeLong( 10L );
        dos.writeDouble( 10.5 );
        dos.writeFloat( 10f );
        dos.writeUTF( "中国" );//采用UTF-8编码写出：e4	b8	ad	e5 9b	bd
        dos.writeChars( "阿中哥" );//采用UTF-16be编码写出：96  3f  4e  2d  54  e5
        dos.close();
        IOUtils.printHex( file );
    }
}
