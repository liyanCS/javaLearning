package initializationAndCleanup.exercise;

/**
 * @author Li Yan
 */
public class Exercise12 {
    public static void main(String[] args){
        new Tank().empty();
        new Tank();
        System.gc();
        System.runFinalization();
    }
}
class Tank{
    static int counter;
    int id = counter++;
    boolean full;
    Tank(){
        System.out.println("Tank " + id + " is created");
        full = true;
    }
    void empty(){
        full = false;
    }
    @Override
    protected void finalize(){
        if(full){
            System.out.println("Error: tank "+ id + " must be empty at cleanup");
        }
        else{
            System.out.println("Tank " + id + " cleanup ok");
        }
    }
    @Override
    public String toString(){
        return "Tank "+ id;
    }
}


