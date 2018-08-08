package access.exercise;

/**
 * @author Li Yan
 * 创建一个带有protected数据的类。运用在第一个类中处理protected数据 的方法在相同的文件中创建第二个类
 */
public class Exercise6 {
    public static void main(String[] args){
        WithProtected withProtected = new WithProtected();
        withProtected.i = 47;
        System.out.println("withProtected.i = " + withProtected.i);
    }
}

class WithProtected{
    protected int i;
}