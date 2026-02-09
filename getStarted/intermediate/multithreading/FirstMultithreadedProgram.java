package intermediate.multithreading;

public class FirstMultithreadedProgram {
    public static void main(String[] args) throws InterruptedException {

        Thread firstThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("We are in thread : "+ Thread.currentThread().getName());
                System.out.println("Current Priority : "+ Thread.currentThread().getPriority());

                throw new RuntimeException("Intentional Exception");
            }
        });

        firstThread.setName("New Worker's Thread");
        firstThread.setPriority(Thread.MAX_PRIORITY);

        // To catch any unchecked exception during a thread run
        firstThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("A critical error occured in "+ t.getName()
                + ", and the error is "+ e.getMessage());
            }
        });

        System.out.println("We are in thread : "+ Thread.currentThread().getName()
                + " BEFORE START");

        firstThread.start(); // Start the thread you crated

        System.out.println("We are in thread: "+ Thread.currentThread().getName()
                + " AFTER START");

        // To put current thread on 10 sec sleep
        Thread.sleep(10000);
    }
}
