package object.exercise;

/**
 * @author Li Yan
 */
public class Exercise7 {
    static void increment(){
        StaticTest.i++;
    }
    public static void main(String[] args){
        Exercise7.increment();
        System.out.println("StaticTest.i=" + StaticTest.i);
        increment();
        System.out.println("StaticTest.i=" + StaticTest.i);
    }
}

class StaticTest{
    static int i = 47;
}
