package interfaces.filters;

/**
 * @author Li Yan
 * 波型
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;
    @Override
    public String toString(){
        return "Waveform " + id;
    }
}
