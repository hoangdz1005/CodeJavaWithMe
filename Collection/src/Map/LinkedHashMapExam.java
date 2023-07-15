package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExam {
    public static void main(String[] args) {
        // Tạo một đối tượng LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Thêm các cặp key-value vào LinkedHashMap
        linkedHashMap.put("Java", 1);
        linkedHashMap.put("Python", 2);
        linkedHashMap.put("C++", 3);

        // In ra các cặp key-value trong LinkedHashMap
        System.out.println("Các cặp key-value trong LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        // Lấy giá trị từ key
        int value = linkedHashMap.get("Java");
        System.out.println("Giá trị của key 'Java': " + value);

        // Xóa một key-value từ LinkedHashMap
        linkedHashMap.remove("C++");

        // In ra số lượng phần tử trong LinkedHashMap
        int size = linkedHashMap.size();
        System.out.println("Số lượng phần tử trong LinkedHashMap: " + size);

        // Kiểm tra xem LinkedHashMap có rỗng không
        boolean isEmpty = linkedHashMap.isEmpty();
        System.out.println("LinkedHashMap rỗng? " + isEmpty);
    }
}
