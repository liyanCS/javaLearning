package object.exercise;

/**
 * @author Li Yan
 */
public class Exercise6 {
    int storage(String s){
        return s.length()*2;
    }
    public static void main(String[] args){
        Exercise6 exercise6 = new Exercise6();
        System.out.println("the char length of it's exercise6 is " + exercise6.storage("it's exercise6"));
    }
}
