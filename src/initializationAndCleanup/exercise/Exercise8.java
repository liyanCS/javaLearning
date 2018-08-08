package initializationAndCleanup.exercise;

/**
 * @author Li Yan
 */
public class Exercise8 {
    void f1(){
        f2();
        this.f2();
        System.out.println("f1()");
    }
    void f2(){
        System.out.println("f2()");
    }
    public static void main(String[] args){
        new Exercise8().f1();
    }

}
