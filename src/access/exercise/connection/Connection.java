package access.exercise.connection;

/**
 * @author Li Yan
 * 效仿示例Lunch.java的形式，创建一个名为ConnectionManager的类，该类管理一个元素为Connection对象的固定数组。
 * 客户端程序员不能直接创建Connection对象，而只能通过ConnectionManager中的某个static方法来获取它们。
 * 当ConnectionManager之中不再有对象时，它会返回null引用。在main()中检测这些类。
 */
public class Connection {
    private static int counter = 0;
    private int id = counter++;
    Connection(){}

    @Override
    public String toString(){
        return "Connection " + id;
    }

    public void doSomething(){}
}
