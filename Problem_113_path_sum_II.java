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
 
    List<List<Integer>> ansList;
    
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
       List<Integer> al=new ArrayList<>();
       ansList=new ArrayList<>();
       fun(root,sum,al);
       return ansList;
    }
 
    public void fun(TreeNode root,int sum,List<Integer> al)
    {
        if(root==null)return;
        al.add(root.val);
        if(root.left==null && root.right==null && sum-root.val==0)
        {
            ansList.add(al);
            return;
        }
            fun(root.left,sum-root.val,new ArrayList<>(al));
            fun(root.right,sum-root.val,new ArrayList<>(al));
        }
        
    
}