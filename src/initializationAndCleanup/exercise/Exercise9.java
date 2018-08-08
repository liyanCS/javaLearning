package initializationAndCleanup.exercise;

/**
 * @author Li Yan
 */
public class Exercise9 {
    int value;
    String str;
    Exercise9(int i, String s){
        this(i);
        str = s;
    }
    Exercise9(int i){
        value = i;
    }

    public static void main(String[] args){
        Exercise9 exercise9 = new Exercise9(5, "the second constructor parameter");
        System.out.println("exercise9.value=" + exercise9.value);
        System.out.println("exercise9.str=" + exercise9.str);
    }

}
