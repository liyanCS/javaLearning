package access.exercise;

import static access.exercise.debug.Exercise3.debug;

/**
 * @author Li Yan
 * 创建两个包，debug与debugoff,它们都包含一个相同的类，该类有一个debug()方法。
 * 第一个版本显示发送给控制台的String参数，而第二个版本什么也不做。
 * 使用静态import语句将该类导入到一个测试程序中，并示范条件编译效果。
 *
 * 通过使用导入不同的包（一个是debug包，一个是debugoff包）里面的相同的类的相同签名的方法，
 * 来进行条件编译（即通过导入不同的包来选择不同的方法来进行编译），一个方法是debug模式，会输出内容到控制台，一个方法是release模式，不会输出任何内容到控制台。
 * 本质是虽然方法的签名相同，但行为不同。
 */
public class Exercise3_Debug {
    public static void main(String[] args){
        debug("DEBUG VERSION");
    }
}
