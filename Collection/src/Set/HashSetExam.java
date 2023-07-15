package Set;

import java.util.HashSet;

public class HashSetExam {
    public static void main(String[] args) {
        // Tạo một đối tượng HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Thêm các phần tử vào HashSet
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("C++");
        // Phần tử trùng lặp, bị bỏ qua
        hashSet.add("Java");
        // Thêm phần tử null
        hashSet.add(null);

        // In ra các phần tử trong HashSet
        System.out.println("Các phần tử trong HashSet:");
        for (String element : hashSet) {
            System.out.println(element);
        }

        // Kiểm tra xem HashSet có chứa một phần tử cụ thể không
        boolean contains = hashSet.contains("Python");
        System.out.println("HashSet chứa phần tử \"Python\"? " + contains);

        // Xóa một phần tử từ HashSet
        hashSet.remove("C++");

        // In ra số lượng phần tử trong HashSet
        System.out.println("Số lượng phần tử trong HashSet: " + hashSet.size());

        // Kiểm tra xem HashSet có rỗng không
        boolean isEmpty = hashSet.isEmpty();
        System.out.println("HashSet rỗng? " + isEmpty);
    }
    }

