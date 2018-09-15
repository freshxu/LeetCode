/**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public List<String> binaryTreePaths(TreeNode root) {
            ArrayList<String> result = new ArrayList<String>();
            if (root == null)
                return result;
            String path = "";
            paths(root, result, path);
            return result;
        }

        public void paths(TreeNode root, ArrayList<String> result, String path) {
            if (root == null)
                return;
            if (root.left == null && root.right == null) {
                if (path.equals(""))
                    path += root.val;
                else
                    path += "->" + root.val;
                result.add(path);
                return;
            }
            if (path.equals(""))
                path += root.val;
            else
                path += "->" + root.val;
            Paths(root.left, result, path);
            Paths(root.right, result, path);

        }
    }