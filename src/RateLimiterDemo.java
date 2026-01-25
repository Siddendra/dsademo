import java.util.LinkedList;
import java.util.Queue;

/**
 * Rate Limiter – Problem Statement
 * Design and implement a Rate Limiter in Java that restricts the number of requests a user can make in a given time window.
 *
 * 60 seconds, 10 requests to be made, 11 th request should be rejected.
 *
 * and then once the window cools down it then allow to make another request
 *
 * last 60 seconds
 *
 */
class RateLimiter {

    private long windowTime = 60000;
    private int requestsSize = 10;

    private Queue<String> queue;

    RateLimiter(Queue queue) {
       this.queue = queue;
       windowTime = System.currentTimeMillis() +windowTime;
    }

    public boolean addTask(String request) {

       //long widowmills = System.currentTimeMillis() + windowTime;
        if(System.currentTimeMillis() <= windowTime  && queue.size() <= requestsSize) {
            queue.add(request);
            System.out.println("Task added to Queue: "+ request );
            // adding the Request
        } else {
            System.out.println("Rejected " + request);
            return false;
        }
        return true;
    }

    public void doTask() {
        String task = queue.poll();
        System.out.print(task);
    }


}

public class RateLimiterDemo {

    public static void main(String args[]) throws InterruptedException {
        Queue<String> queue = new LinkedList<>();
        RateLimiter rateLimiter = new RateLimiter(queue);
        rateLimiter.addTask("Task1");
        rateLimiter.doTask();
        rateLimiter.addTask("Task2");
        rateLimiter.addTask("Task3");
        rateLimiter.addTask("Task4");
        rateLimiter.addTask("Task5");
        rateLimiter.addTask("Task6");
        rateLimiter.addTask("Task7");
        rateLimiter.addTask("Task8");
        rateLimiter.addTask("Task9");
        rateLimiter.addTask("Task10");
        rateLimiter.addTask("Task11");
        Thread.sleep(60000);
        rateLimiter.addTask("Task12");
    }


}
