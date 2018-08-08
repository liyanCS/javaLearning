package object.exercise;

/**
 * @author Li Yan
 */
public class Exercise1 {
    int noInitialInt;
    char noInitialChar;
    public Exercise1(){
        System.out.println("The value of noInitial is: " + noInitialInt);
        System.out.println("The value of noInitialChar is: " + noInitialChar);
    }
    public static void main(String[] args){
        new Exercise1();
    }

}
