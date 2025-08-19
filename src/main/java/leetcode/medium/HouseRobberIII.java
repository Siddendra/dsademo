package main.java.leetcode.medium;


  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class HouseRobberIII {
    int rob(TreeNode root) {
     int[] optins = travel(root);

     return Math.max(optins[0], optins[1]);

    }

    int[] travel(TreeNode root) {
        if(root == null) return new int[2];

        int[] left_node_choice = travel(root.left);
        int[] right_node_choice = travel(root.right);
        int[] options = new int[2];

        options[0] = root.val + left_node_choice[1] + right_node_choice[1];

        options[1] = Math.max(left_node_choice[0], left_node_choice[1]) +
                     Math.max(right_node_choice[0], right_node_choice[1]);

        return options;
    }
}
