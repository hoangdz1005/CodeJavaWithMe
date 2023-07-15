package Queue;


import java.util.ArrayDeque;

public class ArrayDequeExam {
    public static void main(String[] args) {
        // Tạo một đối tượng ArrayDeque
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        // Thêm các phần tử vào ArrayDeque
        arrayDeque.addFirst("Java");
        arrayDeque.addLast("Python");
        arrayDeque.addLast("C++");

        // In ra các phần tử trong ArrayDeque
        System.out.println("Các phần tử trong ArrayDeque:");
        for (String element : arrayDeque) {
            System.out.println(element);
        }

        // Lấy và xóa phần tử đầu tiên và cuối cùng của ArrayDeque
        String firstElement = arrayDeque.pollFirst();
        String lastElement = arrayDeque.pollLast();
        System.out.println("Phần tử đầu tiên: " + firstElement);
        System.out.println("Phần tử cuối cùng: " + lastElement);

        // In ra các phần tử sau khi lấy ra
        System.out.println("Các phần tử sau khi lấy ra:");
        for (String element : arrayDeque) {
            System.out.println(element);
        }
    }
}
