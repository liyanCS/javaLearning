package initializationAndCleanup.exercise;

/**
 * @author Li Yan
 */
public class Exercise15 {
    String s;
    {
        s = "'Instance initialization'";
    }
    public Exercise15(){
        System.out.println("Default construct; s = " + s);
    }
    public Exercise15(int i){
        System.out.println("Int construct; s = " + s);

    }
    public static void main(String[] args){
        new Exercise15();
        new Exercise15(1);
    }
}
