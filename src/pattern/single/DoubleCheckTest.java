package pattern.single;

/**
 * @author Li Yan
 * 2019/8/31 17:08
 */
public class DoubleCheckTest {
    public static void main(String[] args) {
        Thread[] threads = new Thread[5000];
        for (int i = 0; i < 5000; i++) {
            threads[i] = new Thread(new Runnable() {
                public void run() {
                    System.out.println(DoubleCheck.getInstance().getA());
                }
            });
            threads[i].start();
        }
    }
}
