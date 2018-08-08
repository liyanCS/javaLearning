package initializationAndCleanup.exercise;

/**
 * @author Li Yan
 */
public class Exercise10 {
    @Override
    protected void finalize(){
        System.out.println("finalize() called");
    }
    public static void main(String[] args){
        new Exercise10();
        System.gc();
        System.runFinalization();
    }
}
