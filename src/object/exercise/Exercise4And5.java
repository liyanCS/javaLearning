package object.exercise;

import javax.xml.crypto.Data;

/**
 * @author Li Yan
 */
public class Exercise4And5 {
    public static void main(String[] args){
        DataOnly dataOnly = new DataOnly();
        //dataOnly.i = 47;
       // dataOnly.d = 1.1;
        //dataOnly.b = false;
        System.out.println("dataOnly.i=" + dataOnly.i);
        System.out.println("dataOnly.d=" + dataOnly.d);
        System.out.println("dataOnly.b=" + dataOnly.b);
    }

}
class DataOnly{
    int i;
    double d;
    boolean b;
}
