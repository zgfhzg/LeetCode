/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Node[] graph = new Node[101];

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        } else if (node.neighbors == null) {
            return new Node(1);
        }
        return clone(node);
    }

    private Node clone(Node node) {
        int val = node.val;

        if (graph[val] == null) {
            graph[val] = new Node(val);

            for (int i = 0; i < node.neighbors.size(); i++) {
                Node tmp = clone(node.neighbors.get(i));
                graph[val].neighbors.add(tmp);
            }
        }
        return graph[val];
    }
}