package access.exercise;

import static access.exercise.debugoff.Exercise3.debug;

/**
 * @author Li Yan
 * 创建两个包，debug与debugoff,它们都包含一个相同的类，该类有一个debug()方法。
 * 第一个版本显示发送给控制台的String参数，而第二个版本什么也不做。
 * 使用静态import语句将该类导入到一个测试程序中，并示范条件编译效果。
 */
public class Exercise3_Release {
    public static void main(String[] args){
        debug("DEBUG VERSION");
    }
}
