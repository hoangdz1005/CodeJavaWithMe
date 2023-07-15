package CompletableFuture;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureExam {
    public static void main(String[] args) {
        String[] names = {"Messi", "Ronaldo", "Neymar", "Mbappe", "Bruno"};
        // supplyAsync hàm xử lí CompletableFuture có giá trị trả về
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()-> {
            System.out.println("Hello from " + Thread.currentThread().getName());
            System.out.println("I will give you name in 5s");
            for(int i =0;i<5;i++) {
                System.out.println(i+1);
                try {
                    Thread.sleep(1000);
                }catch(Exception e) {
                    System.out.println("Exception while sleeping in " + Thread.currentThread().getName());
                }

            }
            return randomString(names);
        });

        completableFuture.thenAcceptAsync(name -> {
            System.out.println("Hello from " + Thread.currentThread().getName());
            System.out.println("Now I 'm going to print you the name");
            System.out.println("Result: " + name);
        });
        try {
            Thread.sleep(10_000);
        }
        catch (InterruptedException e) {
            System.out.println("Exception while sleeping in " + Thread.currentThread().getName());
            e.printStackTrace();
        }
    }

    private static String randomString(String[] names) {
        return names[new Random().nextInt(names.length)];
    }
}
