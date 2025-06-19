package main.java.doublelinkedlist;

public class DoublyLinkedList {

    Node head;
    Node tail;
    int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length =1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }

    }

    public void printAll() {
        if(length == 0)  {
            System.out.println("Head is : null");
            System.out.println("Tail is : null");
        } else  {
            System.out.println("Head is : " + head);
            System.out.println("Tail is : null" + tail);
        }
        System.out.println("Lenght: " + length);
        System.out.println("\n Doubly Linked List: ");
        if(length == 0) {
             System.out.println("empty");
        }
        printList();
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if(length == 0) return null;
        Node temp = tail;
        if(length == 1) {
            tail = null;
            head = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else  {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if(length == 0)  return null;
        Node temp = head;
        if(length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index) {
        if(index < 0 || index >= length) return null;
        Node temp = head;
        if(index < length/2) {
            for (int i=0; i< index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for(int i = length-1; i> index; i --) {
                temp = temp.prev;
            }
        }
        return temp;
    }


    public boolean set(int index, int value) {
        Node temp = get(index);
        if(temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if(index < 0 || index >= length ) return false;
        if(index == 0) {
            prepend(value);
            return true;
        }
        if(index == length) {
            append(value);
            return  true;
        }
        Node newNode = new Node(value);
        Node before = get(index -1);
        Node after = before.next;
        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if(index < 0 || index >= length) return null;
        if(index == 0) {
            removeFirst();
        }
        if (index == length-1) {
            removeLast();
        }
        Node temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;

        length--;
        return temp;
    }

    //Swap First and Last Elements
    public void swapFirstLast() {
        if(length < 2 ) return;
        int temp = head.value;
        head.value = tail.value;
        tail.value = temp;
    }

    //Reverse the List
    public void reverse() {
        if(length == 0) return;
        Node current = head;
        Node temp = null;

        while(current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        temp = head;
        tail = temp;

    }

    //Palindrome Checker
    public boolean palindromeCheck() {
        if(length <= 1) return true;
        Node forwardNode = head;
        Node backwardNode = tail;
        for (int i=0; i< length/2; i++) {
            if(forwardNode.value != backwardNode.value) return false;
                forwardNode = forwardNode.next;
                backwardNode = backwardNode.prev;
        }
        return  true;
    }

    //Swap Node Pair
    public void swapNodePair() {
        Node dummyNode = new Node(0);
        dummyNode.next = head;
        Node previousNode = dummyNode;
        while(head != null && head.next != null) {
            Node firstNode = head;
            Node secondNode = head.next;
            previousNode.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
            secondNode.prev = previousNode;
            firstNode.prev = secondNode;
            if(firstNode.next != null) {
                firstNode.next.prev =firstNode;
            }
            head = firstNode.next;
            previousNode = head;
        }
        head = dummyNode.next;
        if(head != null) head.prev = null;
    }


}
