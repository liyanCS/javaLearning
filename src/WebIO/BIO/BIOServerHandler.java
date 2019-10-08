package WebIO.BIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author Li Yan
 * 2019/10/7 17:55
 */
public class BIOServerHandler implements Runnable {
    private Socket socket;

    public BIOServerHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        PrintWriter printWriter = null;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            printWriter = new PrintWriter(this.socket.getOutputStream(), true);
            while (true) {
                String body = bufferedReader.readLine();
                if (body == null) break;
                System.out.println("Server 服务端接收参数： " + body);
                printWriter.println(body + "=" + "服务端返回的数据");

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (printWriter != null) {
                printWriter.close();
            }
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (this.socket != null) {
                    this.socket.close();
                    this.socket = null;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}
