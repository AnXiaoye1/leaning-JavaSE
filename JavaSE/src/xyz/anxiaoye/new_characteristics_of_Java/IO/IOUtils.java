package xyz.anxiaoye.new_characteristics_of_Java.IO;

import java.io.*;

/**
 * @ClassName IOUtils IO流工具
 * Create by zhuye on 2020/2/27.
 */
public class IOUtils {
    /***********************************************
     * 读取指定文件的数据，按照 16进制  输出到控制台
     * 每输出10给byte换行
     * @param fileName
     **********************************************/
    public static void printHex(String fileName) throws IOException {
        //把文件作为字节流进行读操作
        FileInputStream in = new FileInputStream( fileName );
        int b;//用来接收读取的字节
        int i = 1;
        while ((b = in.read()) != -1) {
            /**
             * 单个字节数，在前面补0
             */
            if (b <= 0xf) {
                System.out.print( "0" );
            }
            System.out.print( Integer.toHexString( b ) + "\t" );//将整型b转换为16进制表示的字符串
            if (i++ % 10 == 0) {
                System.out.println();
            }
        }
        in.close();//关闭文件
    }

    /***********************************************
     * 读取指定文件的数据，按照 16进制  输出到控制台
     * 每输出10给byte换行
     * @param fileName
     **********************************************/
    public static void printHexByByteArray(String fileName) throws IOException {
        FileInputStream in = new FileInputStream( fileName );
        byte[] buf = new byte[20 * 1024];
        /**从in中批量读取字节，放入到buf字节数组中，
         * 从0位置开始，最多可以放buf.length个，
         * 返回的是读到的字节个数
         */
        int bytes = in.read( buf, 0, buf.length );
        int j = 1;
        for (int i = 0; i < bytes; i++) {
            //单个字节前补0
            if (buf[i] <= 0xf) {
                System.out.print( "0" );
            }
            System.out.print( Integer.toHexString( buf[i] ) + "\t" );
            //每行满10个换行
            if (j++ % 10 == 0) {
                System.out.println();
            }
        }
    }

    /****************************************
     * 文件拷贝，字节批量读取
     * @param srcFile 源文件
     * @param destFile 目标文件
     * @throws IOException
     ***************************************/
    public static void copyFile(File srcFile, File destFile) throws IOException {
        //先判断源文件是否存在
        if (!srcFile.exists()) {
            throw new IllegalArgumentException( "文件：" + srcFile + "不存在" );
        }
        if (!srcFile.isFile()) {
            throw new IllegalArgumentException( srcFile + "不是文件" );
        }
        FileInputStream in = new FileInputStream( srcFile );//进行读操作
        FileOutputStream out = new FileOutputStream( destFile );//进行写操作

        //批量读写
        byte[] buf = new byte[8 * 1024];
        int b;//用于存储读取字节的个数
        while ((b = in.read( buf, 0, buf.length )) != -1) {
            out.write( buf, 0, b );//将字节写入到buf中，从0写b个
            out.flush();//最好加上
        }
        //关闭文件
        in.close();
        out.close();
    }

    /****************************************
     * 拷贝文件，利用带缓冲区的方法
     * @param srcFile 源文件
     * @param destFile 目标文件
     * @throws IOException
     ***************************************/
    public static void copyFileByBuffer(File srcFile, File destFile) throws IOException {
        //判断源文件是否存在
        if (!srcFile.exists()) {
            throw new IllegalArgumentException( "文件：" + srcFile + "不存在" );
        }
        //判断是否是文件
        if (!srcFile.isFile()) {
            throw new IllegalArgumentException( srcFile + "不是文件" );
        }
        //写缓冲区
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream( srcFile ) );
        //读缓冲区
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream( destFile ) );
        int c;
        //用c来记录从写缓冲区读到的字节个数
        while ((c = bis.read()) != -1) {
            bos.write( c );//将数据写入读缓冲区
            bos.flush();//刷新缓冲区
        }
        //关闭
        bis.close();
        bos.close();
    }

    /****************************************
     * 拷贝文件，单字节，不带缓冲
     * @param srcFile 源文件
     * @param destFile 目标文件
     * @throws IOException
     ***************************************/
    public static void copyFileByByte(File srcFile, File destFile) throws IOException {
        //判断源文件是否存在
        if (!srcFile.exists()) {
            throw new IllegalArgumentException( "文件：" + srcFile + "不存在" );
        }
        //判断是否是文件
        if (!srcFile.isFile()) {
            throw new IllegalArgumentException( srcFile + "不是文件" );
        }
        FileInputStream in = new FileInputStream( srcFile );//进行读操作
        FileOutputStream out = new FileOutputStream( destFile );//进行写操作
        int c;
        while ((c = in.read()) != -1) {
            out.write( c );
            out.flush();
        }
        in.close();
        out.close();
    }
}
