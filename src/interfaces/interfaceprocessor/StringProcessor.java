package interfaces.interfaceprocessor;

import java.util.Arrays;

/**
 * @author Li Yan
 * 客户端程序员遵循Processor接口编写自己的类
 */
public abstract class StringProcessor implements Processor{

    @Override
    public String name(){
        return getClass().getSimpleName();
    }

    @Override
    public abstract  String process(Object input);

    public static void main(String[] args) {
        String s = "If she weighs the same as a duck, she's made of wood";
        Apply.process(new UpcaseStringProcessor(), s);
        Apply.process(new DowncaseStringProcessor(), s);
        Apply.process(new SplitterStringProcessor(), s);
    }

}


class UpcaseStringProcessor extends StringProcessor {
    @Override
    public String process(Object input) {
        return ((String)input).toUpperCase();
    }
}

class DowncaseStringProcessor extends StringProcessor {
    @Override
    public String process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class SplitterStringProcessor extends StringProcessor {
    @Override
    public String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}
