package initializationAndCleanup.exercise;

/**
 * @author Li Yan
 * 引用数组
 * 使用reference作为成员的数组
 * 在main函数中创建了一个Test对象的数组，但是没有对数组里面的每个Test进行初始化，数组的每个test成员是null
 */
public class Exercise17 {
    static Test[] testArray1 = new Test[5];
    public static void main(String[] args){
        Test[] testArray2 = new Test[5];
        Integer[] intArray = new Integer[5];
        System.out.println(intArray[0]);
        System.out.println(testArray2[0]);
    }
}
class Test{
    Test(String s){
        System.out.println("Test construct with string s: s = " + s);
    }
}

