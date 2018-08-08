package access.exercise;


import access.exercise.local.E09_PackagedClass;

/**
 * @author Li Yan
 * 若类是包访问权限的，则只能在包内才能使用该类，创建该类的实例（即使该类的构造函数是public的）
 */
public class E09_Foreign {
    public static void main(String[] args) {
        E09_PackagedClass e09_packagedClass = new E09_PackagedClass();
    }
}
