package strings.exercise;
import java.util.regex.Pattern;

/**
 * 请参考java.util.regex.Pattern的文档，编写一个正则表达式，检查一个句子
 * 是否以大写字母开头，以句号结尾。
 * @author Li Yan
 */
public class E07_SentenceChecker {
    public static boolean matches(String s){
        return s.matches("\\p{Upper}.*\\.");
    }

    public static void main(String[] args) {
        System.out.println(matches("This is correct."));
        System.out.println(matches("bad sentence 1."));
        System.out.println(matches("Bad sentence 2"));
        System.out.println(matches("This is also correct ..."));
    }
}
