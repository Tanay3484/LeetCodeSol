class Node{
    int key;
    int value;
    Node prev;
    Node next;

    public Node(int key,int value){
        this.key = key;
        this.value = value;
    }
}

class LRUCache {
    private int capacity;
    private Map<Integer,Node> cache;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.head = new Node(0,0);
        this.tail = new Node(0,0);

        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!cache.containsKey(key)){
            return -1;
        }

        Node node = cache.get(key);
        moveToHead(node);

        return node.value;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            node.value = value;
            moveToHead(node);
        }else{
            if(cache.size()>=capacity){
                removeTail();
            }

            Node newNode = new Node(key,value);
            cache.put(key,newNode);
            addToHead(newNode);
        }
    }

    private void moveToHead(Node node){
        removeNode(node);
        addToHead(node);
    }

    private void addToHead(Node node){
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    private void removeNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void removeTail(){
        Node tailPrev = tail.prev;
        removeNode(tailPrev);
        cache.remove(tailPrev.key);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */