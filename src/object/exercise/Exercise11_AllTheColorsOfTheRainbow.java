package object.exercise;

/**
 * @author Li Yan
 */
public class Exercise11_AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue){
        anIntegerRepresentingColors = newHue;
    }
    public static void main(String[] args){
        Exercise11_AllTheColorsOfTheRainbow all = new Exercise11_AllTheColorsOfTheRainbow();
        System.out.println(all.anIntegerRepresentingColors);
        all.changeTheHueOfTheColor(27);
        System.out.println(all.anIntegerRepresentingColors);
    }
}
