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

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return path(root,targetSum,0);


    }
    private boolean path(TreeNode node,int target,int count){
        if (node == null) return false;
        count += node.val;

        if (node.left == null && node.right == null){
            return count == target;
        }
        return path(node.left,target,count) || 
        path(node.right,target,count);
            

    }

}