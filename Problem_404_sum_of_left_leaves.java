/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int sum;
    public int sumOfLeftLeaves(TreeNode root) {
        sum=0;
        fun(root,null);
        return sum;
    }
    private void fun(TreeNode root,TreeNode parent)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null && root.right==null)
        {
            if(parent!=null && parent.left==root)
            {
                sum+=root.val;
            }
        }
        fun(root.left,root);
        fun(root.right,root);
    }
}