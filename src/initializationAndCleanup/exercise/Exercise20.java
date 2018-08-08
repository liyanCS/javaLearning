package initializationAndCleanup.exercise;

/**
 * @author Li Yan
 * 在main方法中使用可变参数列表来接收运行时命令行的参数
 */
public class Exercise20 {
    public static void main(String... args){
        for(String arg: args){
            System.out.println(arg);
        }
    }
}
