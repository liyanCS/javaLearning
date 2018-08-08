package access.exercise;

/**
 * @author Li Yan
 * 展示protected方法具有包访问权限，但是它仍旧不是public
 * public > protected > 默认包访问权限 > private
 */
public class Exercise4_ForeignClass {
    public static void main(String[] args){
        // access.exercise.local.Exercise4_PackagedClass.greeting();
    }
}
