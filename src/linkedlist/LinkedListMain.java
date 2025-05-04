package linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        int[] numbers  = {10, 11, 13, 16, 17, 21};
        int index = 0;
        LinkedList linkedList = null;
        for(int num: numbers) {
            if(index == 0) {
            linkedList = new LinkedList(10);
            } else {
            linkedList.append(num);
            }
            index++;
        }
        linkedList.printAll();

        System.out.println("Middle Node: "+ linkedList.findMiddleNode().value);
        linkedList.removeDuplicates();
        linkedList.reverseBetween(1,3);
       linkedList.printAll();

        }
    }
