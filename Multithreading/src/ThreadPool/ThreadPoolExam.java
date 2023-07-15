package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExam {
    public static void main(String[] args) {
        // tạo một thread pool với số lượng thread cố định
        int numThreads = 5;
        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);
        // Gửi nhiệm vụ đến thread pool
        for(int i =0;i<10;i++) {
            executorService.submit(new MyTask(i));
        }

        executorService.submit(()-> System.out.println("Another task executed by " + Thread.currentThread().getName()));
        // Dừng việc thực thi các luồng
        executorService.shutdown();
    }
}
