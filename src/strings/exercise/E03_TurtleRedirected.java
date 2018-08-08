package strings.exercise;

import java.util.Formatter;

/**
 * @author Li Yan
 * 修改Turtle.java,使之结果输出到System.err中
 */
public class E03_TurtleRedirected {
    public static void main(String[] args) {
        Formatter formatter = new Formatter(System.err);
        //Formatter formatter = new Formatter(System.out);
        Turtle tommy = new Turtle("Tommy", formatter),
                terry = new Turtle("terry", formatter);

        tommy.move(0,0);
        terry.move(4,8);
        tommy.move(3,4);
        terry.move(2,5);
        tommy.move(3,3);
        terry.move(3,3);
    }
}

class Turtle{
    private String name;
    private Formatter formatter;

    public Turtle(String name, Formatter formatter){
        this.name = name;
        this.formatter = formatter;
    }

    public void move(int x, int y){
        formatter.format("%s The turtle is at (%d,%d)\n", name, x, y);
    }

}