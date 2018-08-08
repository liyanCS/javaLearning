package initializationAndCleanup.exercise;

/**
 * @author Li Yan
 * 三种初始化String数组的方法
 * 一种是分别对每个数组元素赋值初始化
 * 一种是使用new时，即分配空间时初始化
 * 一种是在定义String数组时即初始化，给它赋值，这种方法只能用在定义时使用，不能在方法里面使用或者作为参数使用，作为参数使用时可以使用第二种方法，即new一个String数组后面跟上赋值
 */
public class Exercise16 {
    public static void main(String[] args){
        String[] sa1 = new String[4];
        sa1[0] = "These";
        sa1[1] = "are";
        sa1[2] = "some";
        sa1[3] = "strings";
        for(int i = 0; i<sa1.length; i++ ){
            System.out.println(sa1[i]);
        }

        String[] sa2 = new String[]{"These", "are", "some", "strings"};
        for(int i=0; i<sa2.length; i++){
            System.out.println(sa2[i]);
        }

        String[] sa3 = {"These", "are", "some", "strings"};
        for(int i=0; i<sa3.length; i++){
            System.out.println(sa3[i]);
        }
    }
}
