package ra.bt;

import java.util.HashMap;
public class DemSoLanXuatHien {
    public static void main(String[] args) {
        int[] mangPhanTu = {1, 2, 3, 2, 1, 3, 4, 5, 4, 6, 7, 8, 7, 9, 9, 10};

        HashMap<Integer, Integer> demSoLanXuatHien = new HashMap<>();

        for (int phanTu : mangPhanTu) {
            if (demSoLanXuatHien.containsKey(phanTu)) {
                int soLanXuatHien = demSoLanXuatHien.get(phanTu);
                demSoLanXuatHien.put(phanTu, soLanXuatHien + 1);
            } else {
                demSoLanXuatHien.put(phanTu, 1);
            }
        }

        for (int key : demSoLanXuatHien.keySet()) {
            int soLanXuatHien = demSoLanXuatHien.get(key);
            System.out.println("Phần tử " + key + " xuất hiện " + soLanXuatHien + " lần.");
        }
    }
}