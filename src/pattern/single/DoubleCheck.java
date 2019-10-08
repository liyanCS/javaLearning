package pattern.single;

/**
 * @author Li Yan
 * 2019/8/31 17:04
 */

public class DoubleCheck {

    private static DoubleCheck instance;
    private int a;

    private DoubleCheck() {
        a = 10;
    }

    public static DoubleCheck getInstance() {
        if (instance == null) {
            synchronized (DoubleCheck.class) {
                if (instance == null) {
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }

    public int getA() {
        return a;
    }
}
