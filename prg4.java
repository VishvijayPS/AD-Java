public class prg4 {
    static class Buffer {
        private int data;
        private boolean isEmpty = true;

        public synchronized void produce(int value) throws InterruptedException {
            while (!isEmpty) {
                wait();
            }
            data = value;
            isEmpty = false;
            System.out.println("Produced: " + value);
            notify();
        }

        public synchronized int consume() throws InterruptedException {
            while (isEmpty) {
                wait();
            }
            System.out.println("Consumed: " + data);
            isEmpty = true;
            notify();
            return data;
        }
    }

    static class Producer extends Thread {
        private Buffer buffer;

        public Producer(Buffer buffer) {
            this.buffer = buffer;
        }

        public void run() {
            for (int i = 1; i <= 5; i++) {
                try {
                    buffer.produce(i);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Consumer extends Thread {
        private Buffer buffer;

        public Consumer(Buffer buffer) {
            this.buffer = buffer;
        }

        public void run() {
            for (int i = 1; i <= 5; i++) {
                try {
                    buffer.consume();
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        producer.start();
        consumer.start();
    }
}