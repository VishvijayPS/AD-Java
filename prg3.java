public class prg3 {
    static class Counter {
        private int count = 0;

        public synchronized void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    static class MyThread extends Thread {
        private Counter counter;

        public MyThread(Counter counter) {
            this.counter = counter;
        }

        public void run() {
            for (int i = 0; i < 10; i++) {
                counter.increment();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Counter Value: " + counter.getCount());
    }
}