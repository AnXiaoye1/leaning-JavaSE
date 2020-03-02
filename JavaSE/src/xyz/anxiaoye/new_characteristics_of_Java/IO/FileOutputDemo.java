package xyz.anxiaoye.new_characteristics_of_Java.IO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName FileOutputDemo
 * Create by zhuye on 2020/2/27.
 */
public class FileOutputDemo {
    public static void main(String[] args) throws IOException {
        //如果文件不存在，则直接创建，存在则删除后创建。若要追加内容，在参数后面加一个true
        FileOutputStream out = new FileOutputStream( "D:\\Code\\Java\\demo\\demo.txt" );
        out.write( 'A' );//写入A的低八位
        out.write( 'B' );

        int a = 10;//write每次只能写低八位，int类型一共32位，要写4次
        out.write( a >>> 24 );
        out.write( a >>> 16 );
        out.write( a >>> 8 );
        out.write( a );

        byte[] bytes="阿中哥".getBytes( "gbk" );//gbk字符编码格式每个汉字占用2个字节
        out.write( bytes );
        out.close();

        //将所写的内容打印出来
        IOUtils.printHex( "D:\\Code\\Java\\demo\\demo.txt" );
    }
}
