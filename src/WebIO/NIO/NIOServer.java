package WebIO.NIO;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Iterator;

/**
 * @author Li Yan
 * 2019/10/7 20:59
 */
public class NIOServer implements Runnable {
    private Selector selector;

    //需要一个线程来负责selector的轮询
    public void run() {
        while (true) {
            try {
                //1. 多路复用器监听阻塞
                selector.select();
                //2. 多路复用器已经选择的结果集
                Iterator<SelectionKey> selectionKeys = selector.selectedKeys().iterator();
                //3. 不停的轮询
                while (selectionKeys.hasNext()) {
                    //4. 获取一个选中的key
                    SelectionKey selectionKey = selectionKeys.next();
                    //5. 获取后便将其从容器中移除
                    selectionKeys.remove();
                    //6. 只获取有效的key
                    if (!selectionKey.isValid()) continue;
                    //阻塞状态处理
                    if (selectionKey.isAcceptable()) {

                    }
                    //可读状态处理
                    if (selectionKey.isReadable()) {

                    }

                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    private void accept(SelectionKey selectionKey) {

    }
}
