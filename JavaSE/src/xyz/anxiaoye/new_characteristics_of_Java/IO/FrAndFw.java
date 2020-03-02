package xyz.anxiaoye.new_characteristics_of_Java.IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName FrAndFw
 * Create by zhuye on 2020/2/27.
 */
public class FrAndFw {
    public static void main(String[] args) throws IOException {
        //因为文件是utf-8a编码格式，idea默认的是gbk编码，所以出现乱码
        FileReader fr= new FileReader("D:\\Code\\Java\\demo\\demo.txt" );
        FileWriter fw= new FileWriter( "D:\\Code\\Java\\demo\\demo3.txt" ,true);//在文件后面追加内容时加上true
        char[] buffer=new char[2056];
        int c;
        //读数据到buffer中，从0开始，长度为buffer.length，返回的是字符的个数
        while ((c=fr.read(buffer,0,buffer.length))!= -1){
            fw.write( buffer,0,c );
            fw.flush();
        }
        fr.close();
        fw.close();
    }
}
