class Solution {
    public int sumRootToLeaf(TreeNode root) {
        String s="";
        ans=0;
        fun(root,s);
        return ans;
    }
    int ans;
    private void fun(TreeNode root,String s)
    {
        if(root==null)
        {
        
            return;
        }
        if(root.left==null && root.right==null)
        {
            s+=Integer.toString(root.val);
            ans+=Integer.parseInt(s,2);
          //  System.out.println(s);
            return;
        }
        else
        {
        s+=Integer.toString(root.val);
        fun(root.left,s);
        fun(root.right,s);
        }
       
        
    }
}