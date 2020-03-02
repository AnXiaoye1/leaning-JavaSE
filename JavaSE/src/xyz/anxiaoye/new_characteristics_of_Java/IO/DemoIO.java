package xyz.anxiaoye.new_characteristics_of_Java.IO;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName DemoIO
 * Create by zhuye on 2020/2/26.
 */
public class DemoIO {
    public static void main(String[] args) {
        String str = "家A里B蹲C大D学E";
        //默认使用 utf-8 ：中文占用3个字节，英文占用一个字节
        byte[] bytes = str.getBytes();//字符串 转为 字节
        System.out.println( "---------------使用 UTF-8 编码格式---------------" );
        for (byte b : bytes) {
            //把字节（转换位 int ）以 16进制方式显示
            System.out.print( Integer.toHexString( b & 0xff ) + "\t" );//留下后8位
        }

        System.out.println( "\n---------------使用 GBK 编码格式---------------" );
        //使用 GBK 编码格式，中文占用2个字节，英文占用一个字节
        try {
            byte[] bytes1 = str.getBytes( "gbk" );
            for (byte b : bytes1) {
                System.out.print( Integer.toHexString( b & 0xff ) + "\t" );//留下后8位
            }
            String s1 = new String(bytes1,"gbk");//用相同编码格式不会乱码
            System.out.println(s1);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        //Java是双字节编码：UTF-16be 中文和英文都占用2个字节
        System.out.println( "\n---------------使用 UTF_16BE 编码格式---------------" );
        try {
            byte[] bytes1 = str.getBytes( "utf-16be" );
            for (byte b : bytes1) {
                System.out.print( Integer.toHexString( b & 0xff ) + "\t" );//留下后8位
            }
            String s1 = new String(bytes1,"gbk");
            System.out.println("这里原来编码格式 utf-16be，现在用 gbk 格式出现乱码："+s1);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        /**
         * 当你的字节序列是某种编码时，此时将字节序列变成字符串时
         * 需要用同样的编码格式，否则会出现乱码
         */
        String s1 = new String( bytes );
        System.out.println( "\n" + s1 );
    }
}
