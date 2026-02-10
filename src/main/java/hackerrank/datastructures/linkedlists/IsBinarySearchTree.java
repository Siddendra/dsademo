package main.java.hackerrank.datastructures.linkedlists;

import main.java.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IsBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        List<Integer> inorderList = new ArrayList<>();
        helper(root, inorderList);

        int prev = inorderList.get(0);
        for (int i = 1; i < inorderList.size(); i++) {
            int cur = inorderList.get(i);
            if (cur <= prev) return false;
            prev = cur;
        }
        return true;
    }

    void helper(TreeNode node, List<Integer> inorderList) {
        if (node == null) return;
        helper(node.left, inorderList);
        inorderList.add(node.val);
        helper(node.right, inorderList);
    }
}
