package access.exercise.local;

/**
 * @author Li Yan
 * 若类是包访问权限的，则只能在包内才能使用该类，创建该类的实例（即使该类的构造函数是public的）
 */
public class E09_PackagedClass {
    public E09_PackagedClass(){
        System.out.println("Creating a packaged class");
    }
}
