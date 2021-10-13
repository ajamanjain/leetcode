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

class Solution 
{
    public TreeNode bst(int[] nums, int start, int last)
    {
        if(start>last)
        {
            return null;
        }
        else
        {
            int mid = start + (last - start)/2;
            TreeNode tree = new TreeNode(nums[mid]);
            tree.left = bst(nums, start, mid-1);
            tree.right = bst(nums, mid+1, last);
            
            return tree;
        }
        
    }
    
    public TreeNode sortedArrayToBST(int[] nums) 
    {
       return bst(nums, 0, nums.length-1);
    }
}
