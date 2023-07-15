package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExam {
    public static void main(String[] args) {
        // Tạo một thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        // Gửi một tác vụ Callable nhận đối tượng Future1
        Future<Integer> future1 = executorService.submit(new MyTask());
        try {
            Integer result1 = future1.get();
            System.out.println("result 1: " + result1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Trường hợp task chưa được hoàn thành
        Future<Integer> future2 = executorService.submit(new MyTask());
        if(!future2.isDone()) {
            System.out.println("Task is running");
        }
        boolean cancelled = future2.cancel(true);
        if(cancelled) {
            System.out.println("Task cancelled");
        }
        // do future2 bị huỷ khi chưa hoàn thành nên khi gọi .get() bị lỗi
        if(future1.isDone()) {
            try {
                Integer result2 = future2.get();
                System.out.println("result 2: " + result2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();
    }
}
