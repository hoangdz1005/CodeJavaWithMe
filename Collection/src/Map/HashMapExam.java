package Map;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

public class HashMapExam {
    public static void main(String[] args) {
        // Tạo một đối tượng HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Thêm các cặp key-value vào HashMap
        hashMap.put("Java", 1);
        hashMap.put("Python", 2);
        hashMap.put("C++", 3);

        // in tất cả các giá trị
        for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(" " + entry.getKey() + "=" + entry.getValue());
        }

        // Truy xuất giá trị từ key
        int value = hashMap.get("Java");
        System.out.println("Giá trị của key 'Java': " + value);

        // Kiểm tra sự tồn tại của key trong HashMap
        boolean containsKey = hashMap.containsKey("Python");
        System.out.println("HashMap có chứa key 'Python'? " + containsKey);

        // Xóa một key-value từ HashMap
        hashMap.remove("C++");

        // In ra số lượng phần tử trong HashMap
        int size = hashMap.size();
        System.out.println("Số lượng phần tử trong HashMap: " + size);

        // Kiểm tra xem HashMap có rỗng không
        boolean isEmpty = hashMap.isEmpty();
        System.out.println("HashMap rỗng? " + isEmpty);
    }
}
