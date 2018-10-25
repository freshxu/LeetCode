/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
   public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null)
            return res;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {

            List<Integer> eachLayer = new LinkedList<>();
            int layerSize = queue.size();
            for (int i = 0; i < layerSize; ++i) {
                Node temp = queue.poll();
                eachLayer.add(temp.val);
                for (Node node : temp.children)
                    queue.offer(node);
            }
            res.add(eachLayer);
        }
        return res;
    }
}
