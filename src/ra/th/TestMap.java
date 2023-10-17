package ra.th;

import java.util.*;
public class TestMap {public static void main(String[] args) {
    Map<String, Integer> hashMap = new HashMap<>();
    hashMap.put("Huy", 18);
    hashMap.put("Trang", 20);
    hashMap.put("Fi", 26);
    hashMap.put("Khoai", 29);
    System.out.println("Hiển thị các mục trong HashMap");
    System.out.println(hashMap + "\n");

    Map<String, Integer> treeMap = new TreeMap<>(hashMap);
    System.out.println("Hiển thị các mục theo thứ tự tăng dần của khóa");
    System.out.println(treeMap);

    Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
    linkedHashMap.put("Huy", 18);
    linkedHashMap.put("Trang", 20);
    linkedHashMap.put("Fi", 26);
    linkedHashMap.put("Khoai", 29);
    System.out.println("\nTuổi của Fi là " + linkedHashMap.get("Fi"));
}
}