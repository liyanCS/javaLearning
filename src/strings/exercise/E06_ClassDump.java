package strings.exercise;
import java.util.*;


/**
 * 创建一个包含int,long,float与double元素的类。
 * 应用String.format()方法为这个类编写toString()方法，并证明它能正确工作。
 * @author Li Yan
 */
public class E06_ClassDump {
    public static void main(String[] args) {
        System.out.println(new DataHolder());
    }
}

class DataHolder{
    int intField = 1;
    long longField = 2L;
    float floatField = 3.0f;
    double doubleField = 4.0;
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("DataHolder: \n");

        result.append(String.format("intField: %d\n", intField));
        result.append(String.format("longField: %d\n", longField));
        result.append(String.format("floatFiels: %f\n", floatField));
        result.append(String.format("doubleFiels: %e\n", doubleField));

        return result.toString();
    }
}
