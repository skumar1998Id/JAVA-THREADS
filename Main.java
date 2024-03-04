class ThreadClass extends Thread{
    public void run(){
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

public class Main {
    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass();
        // Here start() method will call the run method automatically.
        threadClass.start();

        ThreadClass threadClass1 = new ThreadClass(); // To check the thread is working or not, Because we had 2 threads
        threadClass1.start();
    }
}