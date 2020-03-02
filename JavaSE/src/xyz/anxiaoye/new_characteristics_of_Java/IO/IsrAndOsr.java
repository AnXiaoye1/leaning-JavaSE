package xyz.anxiaoye.new_characteristics_of_Java.IO;

import java.io.*;

/**
 * @ClassName IsrAndOsr
 * Create by zhuye on 2020/2/27.
 */
public class IsrAndOsr {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream( "D:\\Code\\Java\\demo\\demo.txt" );
        InputStreamReader isr = new InputStreamReader(in,"gbk" );

        FileOutputStream out = new FileOutputStream( "D:\\Code\\Java\\demo\\demo1.txt" );
        OutputStreamWriter osw= new OutputStreamWriter( out ,"utf-8");

        /*int c;
        while ((c=isr.read())!=-1){
            System.out.print((char) c );
        }*/

        char[] buffer=new char[8*1024];
        int c;
        /**
         * 批量读取，放入buffer字符数组，从0开始放置，最多放buffer.length个，返回的是字符个数
         */
        while ((c=isr.read(buffer,0,buffer.length))!=-1){
            //读取文件到控制台
            String s=new String(buffer,0,c);
            System.out.print(s);
            //写文件到指定文件
            osw.write( buffer );
            osw.flush();//刷新
        }
        isr.close();
        osw.close();
    }
}
