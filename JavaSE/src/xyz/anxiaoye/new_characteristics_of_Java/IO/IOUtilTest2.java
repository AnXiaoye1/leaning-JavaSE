package xyz.anxiaoye.new_characteristics_of_Java.IO;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName IOUtilTest2
 * Create by zhuye on 2020/2/27.
 */
public class IOUtilTest2 {
    public static void main(String[] args) {
        try {
            IOUtils.copyFile( new File( "D:\\Code\\Java\\demo\\demo.txt" ),
                    new File( "D:\\Code\\Java\\demo\\demo1.txt" ) );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
