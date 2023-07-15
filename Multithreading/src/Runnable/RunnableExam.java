package Runnable;

public class RunnableExam {
    public static void main(String[] args) {
        System.out.println("Thread main before");
        // Tạo thread 1
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from a new thread 1!");
            }
        });
        thread1.start();

        // Tạo thread 2
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from a new thread 2!");
            }
        });
        thread2.start();
        System.out.println("Thread main after");
    }
}
