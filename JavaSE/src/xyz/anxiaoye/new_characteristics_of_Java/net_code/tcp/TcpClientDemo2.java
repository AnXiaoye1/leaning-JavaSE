package xyz.anxiaoye.new_characteristics_of_Java.net_code.tcp;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;


public class TcpClientDemo2 {
    public static void main(String[] args) throws Exception {
        //1.创建socket连接，需要地址和端口
        Socket socket = new Socket( InetAddress.getByName( "127.0.0.1" ), 8888 );
        //2.创建一个输出流
        OutputStream os = socket.getOutputStream();
        //3.读取文件,从下面这个路径下读取图片，变成一个文件输入流
        FileInputStream fis = new FileInputStream( new File( "D:\\images\\avatar.jpg" ) );
        //4.写出文件，用上面OutputStream来写出文件流
        byte[] buffer=new byte[1024];
        int length;
        while ((length=fis.read(buffer))!=-1){//fis.read(buffer)读取文件
            os.write( buffer,0,length );//写出文件流
        }
        //通知服务器，我已经传送完了
        socket.shutdownOutput();//传输完成了

        //确定服务器端接收完毕后，才能关闭连接
        //获取输入流，【接收服务器端的确认信息】
        InputStream inputStream = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer2=new byte[1024];
        int len;
        while ((len=inputStream.read(buffer2))!=-1){
            baos.write( buffer2,0,len );
        }
        System.out.println(baos.toString());
        //5.关闭资源
        baos.close();
        inputStream.close();
        fis.close();
        os.close();
        socket.close();
    }
}
