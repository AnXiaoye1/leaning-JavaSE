package xyz.anxiaoye.new_characteristics_of_Java.IO;

import java.io.IOException;

/**
 * @ClassName IOUtilTest
 * Create by zhuye on 2020/2/27.
 */
public class IOUtilTest {
    public static void main(String[] args) {
        try {
            IOUtils.printHex( "D:\\Code\\FirstApp.java" );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
