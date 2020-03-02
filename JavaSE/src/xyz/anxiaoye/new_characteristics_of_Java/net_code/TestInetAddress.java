package xyz.anxiaoye.new_characteristics_of_Java.net_code;

import java.net.InetAddress;
import java.net.UnknownHostException;
/**
 * @ClassName TestInetAddress 测试IP
 */
public class TestInetAddress {
    public static void main(String[] args) {
        try {
            //获取本机地址
            InetAddress inetAddress = InetAddress.getByName( "127.0.0.1" );
            System.out.println( inetAddress );
            InetAddress inetAddress2 = InetAddress.getByName( "localhost" );
            System.out.println( inetAddress2 );
            InetAddress inetAddress3 = InetAddress.getLocalHost();
            System.out.println( inetAddress3 );
            //获取网站地址
            InetAddress inetAddress1 = InetAddress.getByName( "www.anxiaoye.xyz" );
            System.out.println( inetAddress1 );//www.anxiaoye.xyz/185.199.111.153
            //方法
            System.out.println( inetAddress1.getAddress() );
            System.out.println( inetAddress1.getCanonicalHostName() );//规范的名字
            System.out.println( inetAddress1.getHostAddress() );//ip
            System.out.println( inetAddress1.getHostName() );//域名或者本机名字
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
