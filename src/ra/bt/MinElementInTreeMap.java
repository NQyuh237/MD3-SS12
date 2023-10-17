package ra.bt;

import java.util.TreeMap;
import java.util.Map;

public class MinElementInTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(5, "A");
        treeMap.put(2, "B");
        treeMap.put(8, "C");
        treeMap.put(1, "D");
        treeMap.put(9, "E");

        Map.Entry<Integer, String> minEntry = treeMap.firstEntry();

        System.out.println("Phần tử nhỏ nhất trong TreeMap có khóa " + minEntry.getKey() + " và giá trị " + minEntry.getValue());
    }
}