package main.java.hackerrank.datastructures.linkedlists;

import main.java.util.ListNode;

import java.util.HashSet;
import java.util.Set;

public class CycleDetection {
    public boolean hasCycleHashSet(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<>();

        while (head != null) {
            if (nodeSet.contains(head))  {
                return true;
            } else {
                nodeSet.add(head);
            }
            head = head.next;
        }

        return false;
    }

    public boolean hasCycleFloyd(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (slowPtr != null && fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if(slowPtr == fastPtr) {
                return true;
            }
        }

        return false;
    }
}
