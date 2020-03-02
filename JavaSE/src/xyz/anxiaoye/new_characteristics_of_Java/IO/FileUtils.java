package xyz.anxiaoye.new_characteristics_of_Java.IO;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName FileUtils 文件工具栏：列出一些重要的操作：过滤、遍历
 * Create by zhuye on 2020/2/26.
 */
public class FileUtils {
    /**
     * 列出指定目录（包括其子目录）下的所有文件
     *
     * @param file
     * @throws IOException
     */
    public static void listDirectory(File file) throws IOException, IllegalArgumentException {
        if (!file.exists()) {
            throw new IllegalArgumentException( "目录" + file + "不存在." );
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException( file + "不是目录." );
        }

        /**
         * file.list()：列出的是 当前目录下 的 子目录名和文件名
         */

        String[] listFileNames = file.list();//返回的是字符串数组，列出并遍历目录
        for (String s : listFileNames) {
            System.out.println( file +":"+ s );
        }

        /**
         * 遍历子目录下的内容，就需要构造成File对象的递归操作，File提供了返回File对象的API
         */

        /*File[] files = file.listFiles();//返回的是直接子目录（文件）的对象
        if (files != null && files.length > 0){
            for (File dirc :files) {
                //如果是目录则递归，否则打印
                if (file.isDirectory()){
                    listDirectory( dirc );
                }else {
                    System.out.println(dirc);
                }
            }
        }*/
    }
}
