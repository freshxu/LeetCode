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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Stack<List<Integer>> temp = new Stack<List<Integer>>();
        
        if (root == null) {
            return result;
        }
        
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> subList = new ArrayList();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                subList.add(node.val);
                
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            temp.push(subList);
        }
        while(!temp.isEmpty()) {
            result.add(temp.pop());
        }
        return result;
    }
}
