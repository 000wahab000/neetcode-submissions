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
    List<Integer> l1 = new ArrayList<>();
    int counter = 0;
    public List<Integer> rightSideView(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);
        righty(root);
        return l1;
    }

    public TreeNode righty(TreeNode node){
    if (node == null) return null;
    TreeNode t1 = q.poll();
//sorta gets all the right sides 
    while(t1.right != null){
        l1.add(t1.val);
        counter++;
        return t1.right;
    }
    righty(node.left);
// we then travesal to the right left on the left side keeping prility to right
// since the question is right only
    while (counter != 0 ){
        if(node.left == null){
        righty(node.right);
        }
        else if (node.right == null){
            righty(node.left);
        }
        else {righty(node.right);}
    }
// after at right level we start traveslaing and adding
    while (node.left != null || node.right != null){
        if(node.left == null){
        l1.add(node.right.val);
        righty(node.left);
        }
        else if (node.right == null){
            l1.add(node.left.val);
            righty(node.left);
        }
        else {righty(node.right);
        l1.add(node.val);
        }
    }

    }
}
