public class ThreadExample {
    private static final int[] arr = {1, 20, 50, 15, 30};

    public static void main(String[] args) {
        // Creating two threads
        Thread averageThread = new Thread(new AverageCalculator());
        Thread squareThread = new Thread(new SquarePrinter());

        // Starting the threads
        averageThread.start();
        squareThread.start();
    }

    // Thread to calculate average of first 10 numbers
    static class AverageCalculator implements Runnable {
        @Override
        public void run() {
            synchronized (arr) {
                int sum = 0;
                for (int i = 1; i <= 10; i++) {
                    sum += i;
                }
                double average = sum / 10.0;
                System.out.println("Average of first 10 numbers: " + average);
                arr.notify(); // Notify other thread after calculation
            }
        }
    }

    // Thread to print squares of numbers in the array
    static class SquarePrinter implements Runnable {
        @Override
        public void run() {
            synchronized (arr) {
                try {
                    arr.wait(); // Wait for average calculation
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Squares of numbers in the array:");
                for (int num : arr) {
                    System.out.println(num + " squared is " + (num * num));
                }
            }
        }
    }
}
