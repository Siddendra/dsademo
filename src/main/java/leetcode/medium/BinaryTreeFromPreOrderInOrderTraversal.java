package main.java.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class BinaryTreeFromPreOrderInOrderTraversal {

    TreeNode buildTree(int[] preOrder, int[] inOrder) {
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        for (int i=0; i< inOrder.length; i++) {
            integerIntegerMap.put(inOrder[i], i);
        }

        return splitTree(preOrder, integerIntegerMap, 0, 0, inOrder.length-1);
    }

    TreeNode splitTree(int[] preOrder, Map<Integer, Integer> integerIntegerMap,
                       int rootIndex, int left, int right) {
        TreeNode root = new TreeNode(preOrder[rootIndex]);

        //Create left and right subtree
        int mid = integerIntegerMap.get(preOrder[rootIndex]);
        if(mid > left) {
            root.left = splitTree(preOrder, integerIntegerMap, rootIndex+1, left, mid-1);
        }
        if(mid < right) {
            root.right = splitTree(preOrder, integerIntegerMap, rootIndex+mid-left+1, mid+1, right);

        }

        return root;
    }
}
