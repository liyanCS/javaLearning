package access.exercise.local;


/**
 * @author Li Yan
 * 展示protected方法具有包访问权限，但是它仍旧不是public
 */
public class Exercise4_ConsumerInSamePackage {
    public static void main(String[] args){
        Exercise4_PackagedClass.greeting();
    }
}
