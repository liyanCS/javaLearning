package initializationAndCleanup.exercise;

/**
 * @author Li Yan
 * 对引用数组进行赋值
 * 两种方法：
 * 一种是在定义时以及使用new分配空间时进行赋值
 * 一种是单独对引用数组的每个引用单独进行赋值
 */
public class Exercise18 {
    public static void main(String[] args){
        Test2[] test2Array = new Test2[] {new Test2("one"), new Test2("two"), new Test2("three")};


        Test2[] test2Array2 = new Test2[5];
        for(int i=0; i<test2Array2.length; i++){
            test2Array2[i] = new Test2(Integer.toString(i));
        }

    }
}
class Test2{
    Test2(String s){
        System.out.println("Test constructor with String s: s = " + s);
    }
}