package xyz.anxiaoye.new_characteristics_of_Java.IO;

import java.io.IOException;

/**
 * @ClassName IOUtilTest1
 * Create by zhuye on 2020/2/27.
 */
public class IOUtilTest1 {
    public static void main(String[] args) {
        try {
            IOUtils.printHexByByteArray( "D:\\Code\\FirstApp.java" );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
