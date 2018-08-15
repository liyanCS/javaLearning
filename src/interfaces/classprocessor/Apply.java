package interfaces.classprocessor;

import java.util.Arrays;

/**
 * @author Li Yan
 * 根据所传递的参数对象的不同而具有不同的行为的方法
 * 策略设计模式
 * 演示将不同类型的策略用于同一个对象(String)上去
 * 不同的Processor对象为不同的策略
 */

class Processor{
    public String name(){
        return getClass().getSimpleName();
    }
    Object process(Object input){
        return input;
    }
}

class UpcaseProcessor extends Processor{
    @Override
    String process(Object input){
        return ((String)input).toUpperCase();
    }
}

class DowncasePorcessor extends Processor{
    @Override
    String process(Object input){
        return ((String)input).toLowerCase();
    }
}

class SplitterProcessor extends Processor{
    @Override
    String process(Object input){
        return Arrays.toString(((String) input).split(" "));
    }
}

public class Apply {
    //Apply的process方法与Processor耦合过紧
    public static void process(Processor processor, Object object){
        System.out.println("Using processor " + processor.name());
        System.out.println(processor.process(object));
    }

    public static String string = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new UpcaseProcessor(), string);
        process(new DowncasePorcessor(), string);
        process(new SplitterProcessor(), string);


    }
}
