import java.util.concurrent.atomic.AtomicInteger;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger count = new AtomicInteger();
        Thread thread = new Thread(() -> {
            for (int i =0; i<5; i++){
                count.getAndIncrement();
            }
        });

        Thread thread1 = new Thread(() -> {
            for (int i =0; i<5; i++){
                count.getAndIncrement();
            }
        });
        thread.start();
        thread1.start();
        thread.join();
        thread1.join();
        //Let's print count
        System.out.println("Count "+count);

    }
}