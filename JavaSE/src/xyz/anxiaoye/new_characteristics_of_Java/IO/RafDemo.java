package xyz.anxiaoye.new_characteristics_of_Java.IO;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * @ClassName RafDemo
 * Create by zhuye on 2020/2/26.
 */
public class RafDemo {
    public static void main(String[] args) throws IOException {
        /**
         * 在指定目录下创建文件夹
         */
        File demo = new File( "D:\\Code\\Java\\demo" );
        if (!demo.exists()) {
            demo.mkdir();
        }
        /**
         * 在指定文件夹下，创建一个文件
         */
        File file = new File( demo, "demo.txt" );
        if (!file.exists()) {
            file.createNewFile();//创建文件
        }

        //随机访问文件
        RandomAccessFile raf = new RandomAccessFile( file, "rw" );
        System.out.println( "指针位置：" + raf.getFilePointer() );//查看指针位置
        raf.write( 'A' );//只写了一个字节
        raf.write( 'B' );
        System.out.println( "指针位置：" + raf.getFilePointer() );//查看指针位置

        /**
         * 如何把整数写进文件
         */
        int k = 0x7eeeeeee;//16进制，一共32位，4个字节，而用write写的时候，每次只能写一个字节，一共写4次
        raf.write( k >>> 24 );//右移动24位，把高8位写进去
        raf.write( k >>> 16 );
        raf.write( k >>> 8 );
        raf.write( k );

        raf.writeInt( k );
        System.out.println( "指针位置：" + raf.getFilePointer() );//查看指针位置
        System.out.println( "文件长度：" + raf.length() );

        //写字符串
        String s = "竹";
        byte[] bytes = s.getBytes( "gbk" );
        raf.write( bytes );
        System.out.println( "文件长度：" + raf.length() );

        /**
         * 读文件，必须把指针移到头部
         */
        raf.seek( 0 );
        //一次性读取
        byte[] buf = new byte[(int) raf.length()];
        raf.read( buf );
        System.out.println( Arrays.toString( buf ) );

        //将字符串以16进制输出
        for (byte b : buf) {
            System.out.print( Integer.toHexString( b & 0xff ) + "\t" );
        }
        //关闭文件
        raf.close();
    }
}
