package stack.arrayList;

public class MyQueueMain {

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        //Out put the front of the queue
        System.out.println("Front of the Queue: "+q.peek());

        //Check if the queue is empty
        System.out.println("is the queue empty? "+ q.isEmpty());

    }


}
