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
    private int height(TreeNode root)
        {
        if(root==null)return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    private void fun(TreeNode root,int h)
    {
        if(root==null)return;
        if(h==0)
        {
            sum+=root.val;
        }
        fun(root.left,h-1);
        fun(root.right,h-1);
    }
    int sum;
    public int deepestLeavesSum(TreeNode root) {
        int h=height(root);
        sum=0;
        fun(root,h-1);
        return sum;
    }
}