package Set;

import java.util.LinkedHashSet;

public class LinkedHashSetExam {
    public static void main(String[] args) {
        // Tạo một đối tượng LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Thêm các phần tử vào LinkedHashSet
        linkedHashSet.add("Java");
        linkedHashSet.add("Python");
        linkedHashSet.add("C++");

        // In ra các phần tử trong LinkedHashSet
        System.out.println("Các phần tử trong LinkedHashSet:");
        for (String element : linkedHashSet) {
            System.out.println(element);
        }

        // Kiểm tra xem LinkedHashSet có chứa một phần tử cụ thể không
        boolean contains = linkedHashSet.contains("Python");
        System.out.println("LinkedHashSet chứa phần tử \"Python\"? " + contains);

        // Xóa một phần tử từ LinkedHashSet
        linkedHashSet.remove("C++");

        // In ra số lượng phần tử trong LinkedHashSet
        System.out.println("Số lượng phần tử trong LinkedHashSet: " + linkedHashSet.size());

        // Kiểm tra xem LinkedHashSet có rỗng không
        boolean isEmpty = linkedHashSet.isEmpty();
        System.out.println("LinkedHashSet rỗng? " + isEmpty);
    }
    }

