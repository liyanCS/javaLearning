package WebIO.BIO;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Li Yan
 * 2019/10/7 17:35
 */
public class BIOServer {
    private static final Integer PORT = 8888;  //服务器对外的端口号

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        ThreadPoolExecutor executor = null;
        try {
            serverSocket = new ServerSocket(PORT); //ServerSocket启动监听端口
            System.out.println("BIO Server 服务器启动......");
            /*--------------传统的新增线程处理----------------*/
//            while (true){
//                socket = serverSocket.accept();   //服务器监听：阻塞、等待client的请求
//                System.out.println("Server服务器确认请求：" + socket);
//                new Thread(new BIOServerHandler(socket)).start();
//            }
            /*--------------通过线程池处理缓解高并发给程序带来的压力（伪异步IO编程）----------------*/
            executor = new ThreadPoolExecutor(10, 100, 1000, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(50));
            while (true) {
                socket = serverSocket.accept();
                System.out.println("Server服务器确认请求：" + socket);
                executor.execute(new BIOServerHandler(socket));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (socket != null) {
                    socket.close();
                    socket = null;
                }
                if (serverSocket != null) {
                    serverSocket.close();
                    serverSocket = null;
                    System.out.println("BIO server服务器关闭了！！！");
                }
                executor.shutdown();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
