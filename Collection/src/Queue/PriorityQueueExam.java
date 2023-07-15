package Queue;

import java.util.PriorityQueue;

public class PriorityQueueExam {
    public static void main(String[] args) {
        PriorityQueue<String> queueStrings = new PriorityQueue<String>();
        // thêm phần tử
        queueStrings.add("Java");
        queueStrings.offer("C++");
        queueStrings.offer("Python");
        queueStrings.offer("PHP");

        // in ra các phần tử
        System.out.println(queueStrings);

        // Lấy và xoá phần tử đầu tiên hàng đợi
        String element1 = queueStrings.poll();
        System.out.println(element1);
        System.out.println(queueStrings);

        // Lấy phần tử đầu tiên (không xoá)
        String element2 = queueStrings.peek();
        System.out.println(element2);
        System.out.println(queueStrings);

        // Kiêm tra có rỗng hay không
        boolean checkEmpty = queueStrings.isEmpty();
        System.out.println(checkEmpty);

        // Lấy số lượng phần tử
        int numberOfQueue = queueStrings.size();
        System.out.println(numberOfQueue);

    }
}
