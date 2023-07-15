package ThreadPool;

public class MyTask implements Runnable {
    private int taskId;
    public MyTask(int taskId) {
        this.taskId = taskId;
    }
    @Override
    public void run() {
        System.out.println("Task " + (taskId+1) + " is being executed by " + Thread.currentThread().getName());
    }
}
