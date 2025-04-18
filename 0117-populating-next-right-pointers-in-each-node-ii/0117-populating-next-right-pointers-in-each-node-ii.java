/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    Node prev, leftmost;

    public void pointNode(Node node) {
        if (node != null) {
            if (prev != null) {
                prev.next = node;
            } else {
                leftmost = node;
            }
            prev = node;
        }
    }

    public Node connect(Node root) {
        if (root == null) return null;

        leftmost = root;
        Node cur = leftmost;

        while (leftmost != null) {
            prev = null;
            cur = leftmost;
            leftmost = null;

            while (cur != null) {
                pointNode(cur.left);
                pointNode(cur.right);
                cur = cur.next;
            }
        }
        return root;
    }
}