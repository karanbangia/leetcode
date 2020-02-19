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
    public int height(TreeNode root)
    {
        if(root==null)return 0;
        return (1+Math.max(height(root.left),height(root.right)));
    }
    double sum=0;
    int count=0;
    public void levelOrder(TreeNode root,int i)
    {
        if(root==null)return;
        if(i==0)
        {
            count++;
            sum+=root.val;
        }
        levelOrder(root.left,i-1);
        levelOrder(root.right,i-1);
    }
    public List<Double> averageOfLevels(TreeNode root) {
        int h=height(root);
        List<Double> ans=new ArrayList<>();
        for(int i=0;i<h;i++)
        {
            sum=0;
            count=0;
            levelOrder(root,i);
            ans.add(sum/count);
        }
        return ans;
    }
}