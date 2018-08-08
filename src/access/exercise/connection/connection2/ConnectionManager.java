package access.exercise.connection.connection2;

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
public class ConnectionManager {
    //连接池的大小为10
    private static Connection[] pool = new Connection[10];
    static {
        for(int i=0; i<pool.length; i++){
            pool[i] = new Connection();
        }
    }

     public static Connection getConnection(){
        //遍历该连接池，返回第一个可以使用的连接
        for(int i=0; i<pool.length; i++){
            if(pool[i] != null){
                Connection connection = pool[i];
                pool[i] = null;  //返回该 连接，并标记连接池中该连接正在使用
                return connection;
            }
        }
        return null;  //pooln连接池里面的Connection连接都使用完了
    }

    public static void checkIn(Connection connection){
        //遍历该 连接池，将该 连接赋值给连接池中一个为null的slot
        for(int i=0; i<pool.length; i++){
            if(pool[i]==null){
                pool[i]=connection;
                return;
            }
        }
    }
}
