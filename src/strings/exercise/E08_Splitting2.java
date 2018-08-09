package strings.exercise;

import java.util.Arrays;

/**
 * 将字符串Splitting.knights在the和you处分割
 * Splitting.knights = "Then, when you have found the shrubbery, you must cut down the mightiest tree in the forest... with... a herring!"
 * @author Li Yan
 */
public class E08_Splitting2 {
    public static final String KNIGHTS = "Then, when you have found the shrubbery, you must cut down the mightiest tree in the forest... with... a herring!";

    public static void split(String regex){
        System.out.println(Arrays.toString(KNIGHTS.split(regex)));
    }

    public static void main(String[] args) {
        split("the|you");
    }
}
