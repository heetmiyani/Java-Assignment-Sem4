public class ThreadExample implements Runnable {

    public void run() {

        // Code to be executed in the thread

        System.out.println("Thread is running...");

        try {

            Thread.sleep(1000);

        } catch (InterruptedException e) {

            System.out.println("Thread interrupted");

            // Restore interrupted state
            Thread.currentThread().interrupt();
            return;
        }

        System.out.println("Thread completed");
    }

    public static void main(String[] args) {

        // Create a new thread

        Thread thread = new Thread(new ThreadExample());

        // Set the thread's priority to the highest value

        thread.setPriority(Thread.MAX_PRIORITY);

        // Start the thread

        thread.start();

        // Wait for the thread to complete its execution

        try {

            thread.join();

        } catch (InterruptedException e) {

            System.out.println("Main thread interrupted");

            // Restore interrupted state
            Thread.currentThread().interrupt();
        }
    }
}
