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
    List<Integer> ll;
    public List<Integer> postorderTraversal(TreeNode root) {
       ll=new ArrayList<>();
       fun(root);
       return ll;
    }
    private void fun(TreeNode root)
    {
        if(root==null)return;
        fun(root.left);
        fun(root.right);
        ll.add(root.val);
    }
}