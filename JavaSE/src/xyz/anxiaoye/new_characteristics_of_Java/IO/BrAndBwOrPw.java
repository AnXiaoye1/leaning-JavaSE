package xyz.anxiaoye.new_characteristics_of_Java.IO;

import java.io.*;

/**
 * @ClassName BrAndBwOrPw 字符流过滤器
 * Create by zhuye on 2020/2/29.
 */
public class BrAndBwOrPw {
    public static void main(String[] args)throws IOException {
        //对文件进行读写操作
        //定义读操作
        BufferedReader br= new BufferedReader(
                new InputStreamReader(
                        new FileInputStream( "D:\\Code\\Java\\demo\\demo.txt" )
                        ,"gbk"  //定义文件编码格式,utf-8编码格式会乱码
                )
        );
        //定义写操作
        BufferedWriter bw=new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream( "D:\\Code\\Java\\demo\\demo4.txt" )
                        ,"gbk"
                )
        );
        //使用PrintWriter
        PrintWriter pw=new PrintWriter( "D:\\Code\\Java\\demo\\demo5.txt" );

        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line); //一次读一行，不能识别换行符
            bw.write( line );
            //单独写出换行
            bw.newLine();
            bw.flush();
            //写入
            pw.println( line );
            pw.flush();
        }
        br.close();
        bw.close();
        pw.close();
    }
}
