package strings.exercise;

import java.util.Formatter;
import java.util.Locale;
import java.math.*;

/**
 * @author Li Yan
 * 针对前面表格中的各种基本转化类型，请利用所有可能的格式修饰符，写出一个尽可能复杂的格式化表达式
 *
 * boolean: %b 除了boolean型（输出true或false）,其他类型只要不是null,都是true
 *
 * %d:整数（十进制）
 * %c:字符型
 * %b:Boolean型
 * %s:String
 * %f:浮点型
 * %e:浮点型（科学计数）
 * %x:整数（十六进制）
 * %h:散列码（十六进制）
 *
 * char型的变量，可以使用：%c, %b, %s, %h
 * int型的变量，可以使用： %d, %c, %b, %s, %x, %h
 * BigInteger型的变量，可以使用：  %d, %b, %s, %x, %h
 * double型的变量，可以使用：%b, %s, %f, %e, %h
 * 对象型的变量，可以使用：%b, %s, %h
 * boolean型的变量，可以使用：%b, %s, %h
 */
public class E05_ComplexConversion {
    public static void main(String[] args) {
        Formatter formatter = new Formatter(System.out, Locale.US);

        char u = 'a';
        System.out.println("u = 'a'");
        //formatter.format("d: %d\n", u);  //整数型（十进制）
        formatter.format("c: %c\n", u);  //Unicode字符
        formatter.format("b: %b\n", u);  //Boolean值
        formatter.format("s: %s\n", u);  //String
        //formatter.format("f: %f\n", u); //浮点数（十进制）
        //formatter.format("e: %e\n", u); //浮点数（科学计数）
        //formatter.format("x: %x\n", u); //整数（十六进制）
        formatter.format("h: %h\n", u); //散列码（十六进制）
        System.out.println();

        int v = 121;
        System.out.println("v = 121");
        formatter.format("d: %d\n", v);  //整数型（十进制）
        formatter.format("c: %c\n", v);  //Unicode字符
        formatter.format("b: %b\n", v);  //Boolean值
        formatter.format("s: %s\n", v);  //String
        //formatter.format("f: %f\n", v); //浮点数（十进制）
        //formatter.format("e: %e\n", v); //浮点数（科学计数）
        formatter.format("x: %x\n", v); //整数（十六进制）
        formatter.format("h: %h\n", v); //散列码（十六进制)
        System.out.println();

        BigInteger w = new BigInteger("50000000000000");
        System.out.println("w = new BigInteger(\"50000000000000\")");
        formatter.format("d: %d\n", w);  //整数型（十进制）
        //formatter.format("c: %c\n", w);  //Unicode字符
        formatter.format("b: %b\n", w);  //Boolean值
        formatter.format("s: %s\n", w);  //String
        //formatter.format("f: %f\n", w); //浮点数（十进制）
        //formatter.format("e: %e\n", w); //浮点数（科学计数）
        formatter.format("x: %x\n", w); //整数（十六进制）
        formatter.format("h: %h\n", w); //散列码（十六进制)
        System.out.println();

        double x = 179.543;
        System.out.println("x = 179.543");
        //formatter.format("d: %d\n", x);  //整数型（十进制）
        //formatter.format("c: %c\n", x);  //Unicode字符
        formatter.format("b: %b\n", x);  //Boolean值
        formatter.format("s: %s\n", x);  //String
        formatter.format("f: %f\n", x); //浮点数（十进制）
        formatter.format("e: %e\n", x); //浮点数（科学计数）
        //formatter.format("x: %x\n", x); //整数（十六进制）
        formatter.format("h: %h\n", x); //散列码（十六进制)
        System.out.println();

        E05_ComplexConversion e05_complexConversion = new E05_ComplexConversion();
        System.out.println("e05_complexConversion = new E05_ComplexConversion()");
        //formatter.format("d: %d\n", e05_complexConversion);  //整数型（十进制）
        //formatter.format("c: %c\n", e05_complexConversion);  //Unicode字符
        formatter.format("b: %b\n", e05_complexConversion);  //Boolean值
        formatter.format("s: %s\n", e05_complexConversion);  //String
        //formatter.format("f: %f\n", e05_complexConversion); //浮点数（十进制）
        //formatter.format("e: %e\n", e05_complexConversion); //浮点数（科学计数）
        //formatter.format("x: %x\n", e05_complexConversion); //整数（十六进制）
        formatter.format("h: %h\n", e05_complexConversion); //散列码（十六进制)
        System.out.println();

        boolean z = false;
        System.out.println("z = false");
        //formatter.format("d: %d\n", z);  //整数型（十进制）
        //formatter.format("c: %c\n", z);  //Unicode字符
        formatter.format("b: %b\n", z);  //Boolean值
        formatter.format("s: %s\n", z);  //String
        //formatter.format("f: %f\n", z); //浮点数（十进制）
        //formatter.format("e: %e\n", z); //浮点数（科学计数）
        //formatter.format("x: %x\n", z); //整数（十六进制）
        formatter.format("h: %h\n", z); //散列码（十六进制)
    }
}
