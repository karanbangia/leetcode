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
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length-1;
        return arrayToBST(nums,0,n);
        
    }
    private TreeNode arrayToBST(int nums[],int strt,int end)
    {
        if(strt>end) return null;
        int mid=(strt+end)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=arrayToBST(nums,strt,mid-1);
        root.right=arrayToBST(nums,mid+1,end);
       return root;
        
        
    }
}