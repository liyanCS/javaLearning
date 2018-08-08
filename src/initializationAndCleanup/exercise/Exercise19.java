package initializationAndCleanup.exercise;

/**
 * @author Li Yan
 * 方法的可变参数
 * 通过两种方法对调用可变参数的方法
 * 一种是String的列表
 * 一种是将数组对象做为参数
 */
public class Exercise19 {
    static void printStrings(String... strs){
        for(String str: strs){
            System.out.println(str);
        }
    }
    public static void main(String[] args){
        printStrings("These", "are", "some", "strings");
        printStrings(new String[]{
                "These", "are", "some", "strings"
        });
    }
}
