/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    int max = 0;

    public int maxSumBST(TreeNode root) {
        findMax(root);
        return max;
    }

    public Node findMax(TreeNode root) {
        if (root == null) {
            return new Node(null, null, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, true);
        }

        Node left = findMax(root.left);
        Node right = findMax(root.right);

        boolean valid = left.valid && right.valid && root.val > left.max && root.val < right.min;

        int sum = root.val;
        if (valid) {
            sum += left.sum + right.sum;
            max = Math.max(max, sum);
        }

        return new Node(left, right, sum, Math.max(root.val, right.max), Math.min(root.val, left.min), valid);
    }

    static class Node {
        Node left;
        Node right;
        int sum;
        int max;
        int min;
        boolean valid;

        public Node(Node left, Node right, int sum, int max, int min, boolean valid) {
            this.left = left;
            this.right = right;
            this.sum = sum;
            this.max = max;
            this.min = min;
            this.valid = valid;
        }
    }
}

// class Solution {
// int max = 0;
// public int maxSumBST(TreeNode root) {
// findMax(root);
// return max;
// }

// public Node findMax(TreeNode root){
// if(root == null){
// return null;
// }
// Node leftTree = findMax(root.left);
// Node rightTree = findMax(root.right);

// Node current = new Node(root);

// if(leftTree != null){
// current.sum += leftTree.sum;
// current.max = Math.max(root.val, leftTree.max);
// current.min = Math.min(root.val, leftTree.min);
// current.valid = leftTree.valid && leftTree.max < root.val;
// }

// if(rightTree != null){
// current.sum += rightTree.sum;
// current.max = Math.max(root.val, rightTree.max);
// current.min = Math.min(root.val, rightTree.min);
// current.valid = current.valid && rightTree.valid && rightTree.min < root.val;
// }

// if(current.valid){
// max = Math.max(max, current.sum);
// }
// return current;
// }

// static class Node{
// TreeNode node;
// int sum, max, min;
// boolean valid;

// public Node(TreeNode node){
// this.node = node;
// sum = max = min = node.val;
// valid = true;
// }
// }
// }
