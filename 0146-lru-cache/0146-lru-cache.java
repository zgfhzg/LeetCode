class LRUCache {
    Map<Integer, Node> cache;
    int size;
    Node head;
    Node tail;

    class Node {
        int key;
        int val;
        Node pre;
        Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
            this.pre = null;
            this.next = null;
        }
    }

    public LRUCache(int capacity) {
        this.cache = new HashMap();
        this.size = capacity;
        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        head.next = tail;
        tail.pre = head;
    }

    public void update(Node node) {
        if (node.pre != null) {
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }
        node.pre = tail.pre;
        node.next = tail;

        tail.pre.next = node;
        tail.pre = node;
    }

    public int delete() {
        Node node = head.next;
        head.next = node.next;
        node.next.pre = head;

        return node.key;
    }
    
    public int get(int key) {
        if (cache.containsKey(key)) {
            update(cache.get(key));
            return cache.get(key).val;
        } else return -1;
    }
    
    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            cache.get(key).val = value;
            update(cache.get(key));
        } else {
            if (cache.size() == size) {
                cache.remove(delete());
            }
            Node node = new Node(key, value);
            cache.put(key, node);
            update(node);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */