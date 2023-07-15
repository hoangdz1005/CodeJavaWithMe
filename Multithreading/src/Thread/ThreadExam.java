package Thread;

public class ThreadExam {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        myThread1.start();
        MyThread myThread2 = new MyThread();
        myThread2.start();
    }
}
