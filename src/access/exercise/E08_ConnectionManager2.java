package access.exercise;

import access.exercise.connection.connection2.Connection;
import access.exercise.connection.connection2.ConnectionManager;

/**
 * @author Li Yan
 * 效仿示例Lunch.java的形式，创建一个名为ConnectionManager的类，该类管理一个元素为Connection对象的固定数组。
 * 客户端程序员不能直接创建Connection对象，而只能通过ConnectionManager中的某个static方法来获取它们。
 * 当ConnectionManager之中不再有对象时，它会返回null引用。在main()中检测这些类。
 *
 *  这个版本可以在客户端使用完connection对象后，checkin.
 *  存在的问题：1 如果将一个connection checkin后，可以接着使用这个connection,存在问题
 *             2 可以多次checkin同一个connection
 */
public class E08_ConnectionManager2 {
    public static void main(String[] args) {
        Connection[] connections = new Connection[10];
        //测试：将连接池里面的Connection都使用完
        for(int i=0; i<connections.length; i++){
            connections[i]=ConnectionManager.getConnection();
        }
        //测试：因为ConnectionManager的连接池里面的连接都使用完了，故返回null
        System.out.println(ConnectionManager.getConnection());

        //测试：checkin connections，然后再使用这个checkin的connection,再checkin这个connection
        for(int i=0; i<5; i++){
            connections[i].checkIn();
            Connection connection = ConnectionManager.getConnection();
            System.out.println(connection);
            connection.doSomething();
            connection.checkIn();
        }

    }
}
