
class MyRunnableThreadClass implements Runnable{
    @Override
    public void run() {
        for (int i =0; i<5; i++){
            System.out.println(Thread.currentThread().getId() + "values" + i);
            // To Know which threads is running just call Thread.currentThread().getId()
            try {
                Thread.sleep(100); // To Sleep each threads in time interval
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class RunnableThreads {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnableThreadClass());
        Thread t2 = new Thread(new MyRunnableThreadClass());
        t1.start();
        t2.start();
    }
}

