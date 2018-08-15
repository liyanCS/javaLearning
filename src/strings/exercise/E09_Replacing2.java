package strings.exercise;
import javax.jws.WebService;

/**
 * @author Li Yan
 * 参考java.util.regex.Pattern的文档，用下划线来替换Splitting.knights中所有的元音字母
 *
 * (?i)忽略大小写, case_insensitive
 */
public class E09_Replacing2 {
    public static final String KNIGHTS = "Then, when you have found the shrubbery, you must cut down the mightiest tree in the forest... with... a herring!";

    public static void main(String[] args) {
        String regex = "(?i)[aoeiu]";
        System.out.println(KNIGHTS.replaceAll(regex, "_"));
    }
}
