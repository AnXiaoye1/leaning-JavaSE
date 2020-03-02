package xyz.anxiaoye.new_characteristics_of_Java.IO;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName IOUtilTest3
 * Create by zhuye on 2020/2/27.
 */
public class IOUtilTest3 {
    public static void main(String[] args) {
        try {
            long start=System.currentTimeMillis();//执行到开始的时刻
            //单字节读取：21517 ms
            /*IOUtils.copyFileByByte(
                    new File( "D:\\谷歌\\stay with me.mp3" ) ,
                    new File( "D:\\Code\\Java\\demo\\demo3.mp3" ));*/
            /*//带缓冲区读取：16041 ms
            IOUtils.copyFileByBuffer(
                    new File( "D:\\谷歌\\stay with me.mp3" ) ,
                    new File( "D:\\Code\\Java\\demo\\demo4.mp3" ));*/
            //批量读取：9 ms
            IOUtils.copyFile(
                    new File( "D:\\谷歌\\stay with me.mp3" ) ,
                    new File( "D:\\Code\\Java\\demo\\demo5.mp3" ));
            long end=System.currentTimeMillis();//执行到结束的时刻
            System.out.println(end-start);//打印拷贝所用时间
            /**
             * 经过对比，拷贝大文件时，拷贝用时：
             * 单字节方式 > 带缓冲区方式 >> 批量读取方式
             */
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
