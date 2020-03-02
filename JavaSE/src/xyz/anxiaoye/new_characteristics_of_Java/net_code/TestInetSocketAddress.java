package xyz.anxiaoye.new_characteristics_of_Java.net_code;

import java.net.InetSocketAddress;

/**
 * @ClassName TestInetSocketAddress
 * Create by zhuye on 2020/2/29.
 */
public class TestInetSocketAddress {
    public static void main(String[] args) {
        InetSocketAddress inetSocketAddress = new InetSocketAddress( "127.0.0.1", 8080 );
        System.out.println(inetSocketAddress);
        InetSocketAddress inetSocketAddress1 = new InetSocketAddress( "localhost", 8080 );
        System.out.println(inetSocketAddress1);
        //方法
        System.out.println( inetSocketAddress.getAddress() );//返回IP地址
        System.out.println( inetSocketAddress.getHostName() );//这个可以去hosts里面更改映射名
        System.out.println( inetSocketAddress.getHostString() );
        System.out.println( inetSocketAddress.getPort() );//返回端口
    }
}
