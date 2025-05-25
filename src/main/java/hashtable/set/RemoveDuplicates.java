package main.java.hashtable.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

    public static List<Integer> removeDuplicates(List<Integer> myList) {
        Set<Integer> uniqueSet = new HashSet<>(myList);
        return new ArrayList<>(uniqueSet);
    }

    public static void main(String args[]) {
        List<Integer> myList = List.of(1,2,3,4,1,2,3,4,5,6,7,8);
        List<Integer> uniqueList = removeDuplicates(myList);
        System.out.println(uniqueList);
    }
}
