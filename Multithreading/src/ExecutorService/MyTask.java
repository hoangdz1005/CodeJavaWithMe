package ExecutorService;

import java.util.Random;
import java.util.concurrent.Callable;

public class MyTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        return new Random().nextInt(100);
    }
}
