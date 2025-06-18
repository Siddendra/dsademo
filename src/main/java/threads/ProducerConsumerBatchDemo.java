package main.java.threads;


import java.util.*;

/**
 * Implement a Producer-Consumer system in Java where:
 *
 * The Producer generates random integers and adds them to a shared buffer.
 *
 * The Consumer reads messages in batches of 3.
 *
 * The buffer has limited capacity and must handle underflow and overflow gracefully.
 */
class SharedBuffer {

    private final Queue<Integer> buffer = new LinkedList();
    private final int capacity;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int item) throws InterruptedException {
        while(buffer.size() == capacity) {
            wait();
        }
        buffer.add(item);
        System.out.println("Produced: "+ item);
        notifyAll();
    }

    public synchronized List<Integer> consumeBatch(int batchSize) throws InterruptedException {

        while(buffer.size() < batchSize) {
            wait();
        }

        List<Integer> batch = new ArrayList<>();
        for(int i=0; i< batchSize; i++) {
            batch.add(buffer.remove());
        }

        System.out.println("Consumed Batch : "+ batch);
        notifyAll();
        return batch;
    }

}

class Producer extends Thread {

    private final SharedBuffer buffer;
    private final Random random = new Random();


    Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            while (true) {
                int item = random.nextInt(100);
                buffer.produce(item);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer extends Thread {

    private final SharedBuffer buffer;
    private final int batchSize;

    Consumer(SharedBuffer buffer, int batchSize) {
        this.buffer = buffer;
        this.batchSize = batchSize;
    }

    public void run() {
        try {
            while (true) {
                buffer.consumeBatch(batchSize);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ProducerConsumerBatchDemo {
    public static void main(String args[]) {

        SharedBuffer buffer = new SharedBuffer(10);
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer, 3);

        producer.start();
        consumer.start();
    }


}
