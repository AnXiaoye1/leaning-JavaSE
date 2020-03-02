package xyz.anxiaoye.new_characteristics_of_Java.net_code.tcp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName TcpServerDemo1 服务端
 * Create by zhuye on 2020/2/29.
 */
public class TcpServerDemo1 {
    public static void main(String[] args) {
        ServerSocket serverSocket=null;
        Socket socket=null;
        InputStream is=null;
        ByteArrayOutputStream baos=null;
        try {
            //1.创建一个地址
            serverSocket = new ServerSocket(9999);
            //2.等待客户端连接
            socket = serverSocket.accept();
            //3.接收客户端发的消息
            is = socket.getInputStream();
            //管道流接收数据
            baos = new ByteArrayOutputStream();
            byte[] buffer=new byte[1024];
            int length;
            while ((length=is.read(buffer))!=-1){
                baos.write( buffer,0,length );//可能会乱码
            }
            System.out.println(baos.toString());//toString后不会乱码
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (baos!=null){
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverSocket!=null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
