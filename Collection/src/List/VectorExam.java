package List;

import java.util.Vector;

public class VectorExam {
    public static void main(String[] args) {
        // Tạo một đối tượng Vector
        Vector<String> vector = new Vector<>();

        // Thêm các phần tử vào Vector
        vector.add("Java");
        vector.add("Python");
        vector.add("C++");

        // In ra các phần tử trong Vector
        System.out.println("Các phần tử trong Vector:");
        for (String element : vector) {
            System.out.println(element);
        }

        // Thêm phần tử vào Vector
        vector.add("C#");

        // Xóa một phần tử từ Vector
        vector.remove("Python");

        // In ra số lượng phần tử trong Vector
        System.out.println("Số lượng phần tử trong Vector: " + vector.size());

        // Kiểm tra xem Vector có chứa một phần tử cụ thể không
        System.out.println("Vector chứa phần tử \"Java\"? " + vector.contains("Java"));

        // Lấy phần tử từ Vector theo chỉ mục
        String element = vector.get(2);
        System.out.println("Phần tử ở vị trí thứ 2: " + element);
    }
}
