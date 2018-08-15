package interfaces.interfaceprocessor;

import interfaces.filters.*;

/**
 * @author Li Yan
 */
public class FilterProcessor {
    public static void main(String[] args) {
        Waveform waveform = new Waveform();
        // public static void process(Processor processor, Object object)
        // 调用process方法 需要一个Processor接口，一个Object对象.但是现在只有Filter接口，故用Filter接口适配了一个Processor接口
        Apply.process(new FilterAdapter(new LowPassFilter(1.0)),waveform);

        Apply.process(new FilterAdapter(new HighPassFilter(2.0)),waveform);

        Apply.process(new FilterAdapter(new BandPassFilter(1.0, 2.0)),waveform);

    }
}
//利用Filter接口来实现Processor接口
//外观是Processor接口，其实里面干活的是Filter接口，但是调用者并不知道，以为自己调用的是Processor接口
class FilterAdapter implements Processor{
    Filter filter;

    public FilterAdapter(Filter filter){
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform)input);
    }
}
