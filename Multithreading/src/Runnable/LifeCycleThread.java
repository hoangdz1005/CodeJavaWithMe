package Runnable;

public class LifeCycleThread {
    public static void main(String[] args) throws Exception{
        Thread stopTestThread = new Thread(()-> {
            System.out.println("Hello from " + Thread.currentThread().getName());
            for(int i = 0; i <3;i++) {
                System.out.println("I'm running " + (i + 1));
                // Dừng thread trong vòng 1s
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Now I'm going to stop");
        }, "StopTestThread");

        stopTestThread.start();
        // đợi stopTestThread hoàn thành mới thực hiện công việc tiếp theo
        stopTestThread.join();

        // thread main mặc định
        System.out.println();
        System.out.println("Hello from " + Thread.currentThread().getName());
        System.out.println("Trying to invoke " + stopTestThread.getName());
        // Thử gọi lại thread lần 2 => lỗi
        stopTestThread.start();
    }
}
