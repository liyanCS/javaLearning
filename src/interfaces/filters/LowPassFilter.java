package interfaces.filters;

/**
 * @author Li Yan
 * 低通滤波器
 */
public class LowPassFilter extends Filter {
    double cutoff;

    public LowPassFilter(double cutoff){
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input){
        return input;
    }
}
