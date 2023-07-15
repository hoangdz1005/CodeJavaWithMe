package List;

import java.util.LinkedList;

public class LinkedListExam {
    public static void main(String[] args) {
        // Tạo một đối tượng LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Thêm các phần tử vào LinkedList
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C++");

        // In ra các phần tử trong LinkedList
        System.out.println("Các phần tử trong LinkedList:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        // Thêm phần tử vào vị trí đầu tiên của LinkedList
        linkedList.addFirst("C#");

        // Thêm phần tử vào vị trí cuối cùng của LinkedList
        linkedList.addLast("JavaScript");

        // Thêm phần tử vào vị trí bất kì
        linkedList.add(1,"PHP");
        System.out.println(linkedList.get(1));

        // In ra số lượng phần tử trong LinkedList
        System.out.println("Số lượng phần tử trong LinkedList: " + linkedList.size());

        // Kiểm tra xem LinkedList có chứa một phần tử cụ thể không
        System.out.println("LinkedList chứa phần tử \"Java\"? " + linkedList.contains("Java"));

        // Lấy phần tử từ LinkedList theo chỉ mục
        String element = linkedList.get(2);
        System.out.println("Phần tử ở vị trí thứ 2: " + element);

        // Xóa một phần tử từ LinkedList
        linkedList.remove("Python");

        // In ra các phần tử sau khi xóa
        System.out.println("Các phần tử sau khi xóa:");
        for (String e : linkedList) {
            System.out.println(e);
        }
    }
}
