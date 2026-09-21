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
        int count = 0;
        return path(root,targetSum,count);


    }
    private boolean path(TreeNode root,int target,int count){
        count += root.val;
        if (count == target){
            return true;
        }
        return path(root.left,target,count);
        
    }

}