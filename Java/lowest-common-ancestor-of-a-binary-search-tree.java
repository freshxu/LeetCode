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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode node1, TreeNode node2) {
        if (root == null || root == node1 || root == node2) {
            return root;
        }
        
        if ((root.val > node1.val && root.val < node2.val) || (root.val < node1.val && root.val > node2.val)) {
           return root;
        }
        if (root.val > node1.val && root.val > node2.val) {
            return lowestCommonAncestor(root.left,node1,node2);
        } else {
            return lowestCommonAncestor(root.right,node1,node2);
        }
    }
}
