package concurrent;

/**
 * @author Li Yan
 * 2019/8/31 16:43
 */
public class VolatileNotAtomic {
    private final static int THREAD_COUNT = 20;
    private static volatile int race = 0;

    public synchronized static void increase() {
        race++;
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREAD_COUNT];
        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i] = new Thread(new Runnable() {
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        increase();
                    }
                }
            });
            threads[i].start();
        }

        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println(race);

    }
}
