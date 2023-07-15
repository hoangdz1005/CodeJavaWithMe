package Map;

import java.util.TreeMap;

public class TreeMapExam {
    public static void main(String[] args) {
        // Tạo một đối tượng TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Thêm các cặp key-value vào TreeMap
        treeMap.put(3, "Java");
        treeMap.put(1, "Python");
        treeMap.put(2, "C++");

        // In ra các cặp key-value trong TreeMap
        System.out.println("Các cặp key-value trong TreeMap:");
        for (Integer key : treeMap.keySet()) {
            String value = treeMap.get(key);
            System.out.println(key + ": " + value);
        }

        // Lấy giá trị từ key
        String value = treeMap.get(3);
        System.out.println("Giá trị của key 3: " + value);

        // Xóa một key-value từ TreeMap
        treeMap.remove(2);

        // In ra số lượng phần tử trong TreeMap
        int size = treeMap.size();
        System.out.println("Số lượng phần tử trong TreeMap: " + size);

        // Kiểm tra xem TreeMap có rỗng không
        boolean isEmpty = treeMap.isEmpty();
        System.out.println("TreeMap rỗng? " + isEmpty);

        // Lấy key có giá trị nhỏ nhất
        Integer smallestKey = treeMap.firstKey();
        System.out.println("Key nhỏ nhất: " + smallestKey);
        System.out.println("Giá trị tương ứng của key nhỏ nhất: " + treeMap.get(smallestKey));

        // Lấy key có giá trị lớn nhất
        Integer largestKey = treeMap.lastKey();
        System.out.println("Key lớn nhất: " + largestKey);
        System.out.println("Giá trị tương ứng của key lớn nhất: " + treeMap.get(largestKey));
    }
}
