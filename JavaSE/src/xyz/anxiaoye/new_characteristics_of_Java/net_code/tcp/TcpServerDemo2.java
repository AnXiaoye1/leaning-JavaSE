package xyz.anxiaoye.new_characteristics_of_Java.net_code.tcp;


import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo2 {
    public static void main(String[] args) throws Exception {
        //1.创建服务
        ServerSocket serverSocket = new ServerSocket( 8888 );
        //2.监听客户端的连接
        Socket socket = serverSocket.accept();//阻塞式连接，会一直等待客户端连接
        //3.获取输入流，对应客户端的输出流
        InputStream is = socket.getInputStream();
        //4.文件（管道）输出，将客户端发来的文件写入到下面路径中【从输入流InputStream中读取数据到FileOutputStream】
        FileOutputStream fos = new FileOutputStream( new File( "D:\\Code\\Java\\demo\\receive.jpg" ) );
        byte[] buffer = new byte[1024];
        int length;
        while ((length = is.read( buffer )) != -1) {
            fos.write( buffer, 0, length );
        }
        //通知客户端我这边数据接收完了【服务器端输出】
        OutputStream os = socket.getOutputStream();//创建一个输出流，发信息给客户端
        os.write( "我已接收完毕了，你可以断开连接了".getBytes() );

        //关闭资源
        os.close();
        fos.close();
        is.close();
        socket.close();
        serverSocket.close();
    }
}
