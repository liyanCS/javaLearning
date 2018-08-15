package interfaces.filters;

/**
 * @author Li Yan
 * 高通滤波器
 */
public class HighPassFilter extends Filter{
    double cutoff;

    public HighPassFilter(double cutoff){
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input){
        return input;
    }
}
