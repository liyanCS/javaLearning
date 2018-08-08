package strings.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Li Yan
 * 修复InfiniteRecursion.java
 */
public class E02_RepairInfinite {
    @Override
    public String toString(){
        return "InfiniteRecursion address: " + super.toString() + "\n";
    }

    public static void main(String[] args) {
        List<E02_RepairInfinite> list = new ArrayList<E02_RepairInfinite>();
        for(int i=0; i<10; i++){
            list.add(new E02_RepairInfinite());
        }
        System.out.println(list);
    }
}
