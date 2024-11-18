/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        //after watching solutions.
        // root is able to call left and right to obtain the left child and the right child.
        //TreeNode has setter getter functions as well
        //Goal of this function is to invert the tree:
        // where the children of each node is swapped. Recursion is used to reach the end of the node
        if (root == null){
            return root;
        }
        //perform recursion to the next layer
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        //perform the swap
        root.right = left;
        root.left = right;
        
        //return the root
        return root;
    }
}