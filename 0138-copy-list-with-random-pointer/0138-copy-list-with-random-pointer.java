/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    private Map<Node, Node> map = new HashMap();

    public Node copyRandomList(Node head) {
        if (head == null) return null;
        if (map.containsKey(head)) return map.get(head);

        Node node = new Node(head.val);
        map.put(head, node);
        node.random = copyRandomList(head.random);
        node.next = copyRandomList(head.next);

        return node;
    }
}