/**
 * Author: Lydia Pitts
 *
 * "Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest 
 * path from the root node down to the farthest leaf node.
 *
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
 * }" -leet code
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if((root.left == null) & (root.right == null)){
            return 1;
        }
        
            int leftVal = 1 + maxDepth(root.left);
            int rightVal = 1 + maxDepth(root.right);
            if(leftVal >= rightVal){
                return leftVal;
            } else {
                return rightVal;
        }
    }
}
/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions 
 * for Maximum Depth of Binary Tree.
 * 
 * Memory Usage: 39.1 MB, less than 94.62% of Java online submissions 
 * for Maximum Depth of Binary Tree.
*/
