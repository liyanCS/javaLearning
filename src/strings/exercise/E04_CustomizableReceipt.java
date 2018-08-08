package strings.exercise;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

/**
 * @author Li Yan
 * 修改Receipt.java,令所有的宽度都由一个常量来控制。目的是使宽度的改变更容易，只需要修改一处即可。
 */
public class E04_CustomizableReceipt {
    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1,14.29);
        receipt.printTotal();
    }
}

class Receipt{
    private double total = 0;
    private Formatter formatter = new Formatter(System.out, Locale.US);

    public static final int ITEM_WIDTH = 15;
    public static final int QTY_WIDTH = 5;
    public static final int PRICE_WIDTH = 10;

    public static final String TITLE_FRMT = "%-" + ITEM_WIDTH + "s %" + QTY_WIDTH + "s %" + PRICE_WIDTH + "s\n";
    public static final String ITEM_FRMT = "%-" + ITEM_WIDTH + "." + ITEM_WIDTH + "s %" + QTY_WIDTH + "d %" + PRICE_WIDTH + ".2f\n";
    public static final String TOTAL_FRMT = "%-" + ITEM_WIDTH + "s %" + QTY_WIDTH + "s %" + PRICE_WIDTH + ".2f\n";

    public void printTitle(){
        formatter.format(TITLE_FRMT, "Item", "Qty", "Price");
        formatter.format(TITLE_FRMT, "----", "----", "----");
    }

    public void print(String name, int qty, double price){
        formatter.format(ITEM_FRMT, name, qty, price);
        total += price;
    }

    public void printTotal(){
        formatter.format(TOTAL_FRMT, "Tax", "", total*0.06);
        formatter.format(TITLE_FRMT, "", "", "-----");
        formatter.format(TOTAL_FRMT, "Total", "", total*1.06);
    }
}
