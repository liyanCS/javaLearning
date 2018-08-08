package initializationAndCleanup.exercise;

/**
 * @author Li Yan
 */
public class Exercise2 {
    String str1 = "Initialized at definition";
    String str2;
    public Exercise2(String str){
        str2 = str;
    }
    public static void main(String[] args){
        Exercise2 exercise2 = new Exercise2("Initialized at constructor");
        System.out.println("exercise2.str1=" + exercise2.str1);
        System.out.println("exercise2.str2=" + exercise2.str2);
    }
}
