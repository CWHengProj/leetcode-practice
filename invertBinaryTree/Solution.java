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
        //intuition : to invert the binary tree, need to know the size of the binary tree, as well as its depth
        //calculate depth by - 1, 2, 4, 8, 16 etc. if the sum is 1,2,4, the depth would be 3. i increment +1
        //assuming that TreeNode is a list of values, find the depth first
        int treeSize = TreeNode.size();
        int i =0;//2 power 0 =1
        double subtract = Math.pow(2,i);
        while (treeSize!=0){
            treeSize-=subtract;
            i++;
        }
        int treeDepth = i;
        
    }
}