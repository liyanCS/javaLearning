package interfaces.filters;

/**
 * @author Li Yan
 * 带通滤波
 */
public class BandPassFilter extends Filter{
    double lowCutoff, highCutoff;

    public BandPassFilter(double lowCutoff, double highCutoff){
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }

    @Override
    public Waveform process(Waveform input){
        return input;
    }
}
