package initializationAndCleanup.exercise;

/**
 * @author Li Yan
 */
public class Exercise3 {
    Exercise3(){
        System.out.println("This is the default constructor");
    }
    Exercise3(String str){
        System.out.println("This is the constructor which has one parameter: " + str);
    }
    public static void main(String[] args){
        new Exercise3();
        new Exercise3("overloaded");
    }
}
