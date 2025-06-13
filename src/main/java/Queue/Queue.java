package main.java.Queue;

public class Queue {

    private Node first;
    private Node last;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length =1;
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = first;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void printAll() {
        if(length == 0) {
            System.out.println("First Node is: null");
            System.out.println("Last Node is: null");
        } else {
            System.out.println("First Node is: "+ first.value);
            System.out.println("Last Node is: "+ last.value);
        }
        System.out.println("Length is: "+ length);
        System.out.println("Queue is: \n");
        if(length == 0) {
            System.out.println("Empty");
        } else {
            printList();
        }
    }

    public void makeEmpty(){
        first = null;
        last = null;
        length = 0;
    }

    public void enQueue(int value) {
        Node newNode  = new Node(value);
        if(length == 0) {
            first = newNode;
            last = newNode;
        } else if(length > 0){
            last.next= newNode;
            last = newNode;
        }
        length++;
    }

    public Node deQueue() {
        if(length == 0 ) return null;
        Node temp = first;
        if(length == 1) {
            first = null;
            last =null;
        } else if(length >1) {
        first = first.next;
        temp.next = null;
        }
        length--;
        return temp;

    }
}
