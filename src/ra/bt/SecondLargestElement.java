package ra.bt;

import java.util.TreeMap;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 10, 7, 15};

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (int num : arr) {
            treeMap.put(num, 0);
        }

        int largest = treeMap.lastKey();

        treeMap.remove(largest);

        int secondLargest = treeMap.lastKey();

        System.out.println("Phần tử lớn thứ hai trong mảng là: " + secondLargest);
    }
}