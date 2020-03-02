package xyz.anxiaoye.new_characteristics_of_Java.IO;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName DemoFile
 * Create by zhuye on 2020/2/26.
 */
public class DemoFile {
    //回避 IO的异常
    public static void main(String[] args) throws IOException {
        //
        File file=new File( "D:\\Code\\Java\\test.txt" );
        if (!file.exists()){
            //file.mkdir();//文件夹不存在，则创建单极目录
            //mkdirs()创建多级目录
            try {
                file.createNewFile();//创建文件
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(file.isDirectory());//判断是否是目录
            System.out.println(file.isFile());//判断是否是文件
            System.out.println("文件不存在，已重新创建");
        }else {
            file.delete();//存在则删除
            System.out.println("文件存在，已删除");
        }
        /**
         * 常用的File对象的API
         */
        System.out.println(file);//直接打印：路径
        System.out.println(file.getName());//打印文件名
        System.out.println(file.getParentFile());//文件的父路径
        System.out.println(file.getParent());//文件的父路径

        System.out.println("--------------------测试：列出目录下的所有文件---------------------");
        FileUtils.listDirectory( new File( "D:\\Code" ) );
    }
}
