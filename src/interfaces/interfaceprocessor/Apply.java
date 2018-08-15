package interfaces.interfaceprocessor;

/**
 * @author Li Yan
 */
public class Apply {
    public static void process(Processor processor, Object object){
        System.out.println("Using processor: " + processor.name());
        System.out.println(processor.process(object));
    }
}
