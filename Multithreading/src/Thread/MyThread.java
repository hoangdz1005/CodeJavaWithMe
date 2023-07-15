package Thread;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Hello Guys");
        System.out.println("This is my thread!");
    }
}
