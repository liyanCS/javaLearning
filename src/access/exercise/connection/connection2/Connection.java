package access.exercise.connection.connection2;

/**
 * @author Li Yan
 * 效仿示例Lunch.java的形式，创建一个名为ConnectionManager的类，该类管理一个元素为Connection对象的固定数组。
 * 客户端程序员不能直接创建Connection对象，而只能通过ConnectionManager中的某个static方法来获取它们。
 * 当ConnectionManager之中不再有对象时，它会返回null引用。在main()中检测这些类。
 *
 * 这个版本可以在客户端使用完connection对象后，checkin.
 * 存在的问题：1 如果将一个connection checkin后，可以接着使用这个connection,存在问题
 *               2 可以多次checkin同一个connection
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

    public void checkIn(){
        ConnectionManager.checkIn(this);
    }
}
