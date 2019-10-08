package WebIO.BIO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Random;

/**
 * @author Li Yan
 * 2019/10/7 18:11
 */
public class BIOClient {
    private static final String IP_ADDRESS = "127.0.0.1";
    private static final Integer PORT = 8888;

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            clientReq(i);
            Thread.sleep(1000);
        }
    }

    private static void clientReq(int i) {
        Socket socket = null;
        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;
        try {
            socket = new Socket(IP_ADDRESS, PORT);
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            printWriter = new PrintWriter(socket.getOutputStream(), true);
            String[] operators = {"+", "-", "*", "/"};
            Random random = new Random(System.currentTimeMillis());
            String expression = random.nextInt(10) + operators[random.nextInt(4)] + (random.nextInt(10) + 1);
            printWriter.println(expression);
            System.out.println(i + "客户端打印返回的消息： " + bufferedReader.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (printWriter != null) {
                    printWriter.close();
                }
                if (socket != null) {
                    socket.close();
                    socket = null;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
