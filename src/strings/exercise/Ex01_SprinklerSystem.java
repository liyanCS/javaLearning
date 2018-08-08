package strings.exercise;

/**
 * @author Li Yan
 * 分析reusing/SprinklerSystem.java的SprinklerSystem.tString()方法，
 * 看看明确地使用StringBuilder是否确实能够避免产生过多的StrngBuilder对象
 */
class WaterSource {
    private String s;
    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }
    @Override
    public String toString() { return s; }
}

public class Ex01_SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    @Override
    public String toString() {
        return
                "valve1 = " + valve1 + " " +
                        "valve2 = " + valve2 + " " +
                        "valve3 = " + valve3 + " " +
                        "valve4 = " + valve4 + "\n" +
                        "i = " + i + " " + "f = " + f + " " +
                        "source = " + source;
    }
    public static void main(String[] args) {
        Ex01_SprinklerSystem sprinklers = new Ex01_SprinklerSystem();
        System.out.println(sprinklers);
    }
}
