package stack.arrayList;

public class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /*
        Queue Using Stacks: Enqueue ( ** Interview Question)
        Implement the Enqueue Method for a Queue using Two Stacks
     */
    public void enqueue(int value) {
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        stack1.push(value);
        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    /*
        Queue Using Stacks: Dequeue ( ** Interview Question)
        Implement the Dequeue Method for a Queue using Two Stacks
     */
    

    public int peek() {
        return stack1.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }
}
