package CollectionFramework.LRUCache;
import java.util.HashMap;
import java.util.Map;
public class LRUCacheScratch {
    
    // 1. Create the Node class for our Doubly Linked List
    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;
    private Map<Integer, Node> cache;
    // Dummy head and tail to make adding/removing easier (no null checks needed!)
    private Node head;
    private Node tail;

    public LRUCacheScratch(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        
        // Setup the dummy head and tail
        this.head = new Node(-1, -1);
        this.tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    // --- HELPER METHODS FOR THE LINKED LIST ---

    // Always add a node right after the dummy Head (making it the newest)
    private void addNode(Node node) {
        node.prev = head;
        node.next = head.next;

        head.next.prev = node;
        head.next = node;
    }

    // Snip a node out of the linked list
    private void removeNode(Node node) {
        Node previousNode = node.prev;
        Node nextNode = node.next;

        previousNode.next = nextNode;
        nextNode.prev = previousNode;
    }

    // Move a node to the front (remove it, then add it right after Head)
    private void moveToHead(Node node) {
        removeNode(node);
        addNode(node);
    }

    // Pop the oldest node (the one right before the dummy Tail)
    private Node popTail() {
        Node oldest = tail.prev;
        removeNode(oldest);
        return oldest;
    }

    // --- THE MAIN OPERATIONS ---

    // Fetch an item from the cache
    public int get(int key) {
        Node node = cache.get(key);
        if (node == null) {
            return -1; // Not found
        }
        // We just accessed it, so move it to the front of the line!
        moveToHead(node);
        return node.value;
    }

    // Add a new item to the cache
    public void put(int key, int value) {
        Node node = cache.get(key);

        if (node != null) {
            // It already exists! Update the value and move it to the front.
            node.value = value;
            moveToHead(node);
        } else {
            // It's brand new. Create it.
            Node newNode = new Node(key, value);
            cache.put(key, newNode);
            addNode(newNode);

            // Uh oh, are we over capacity?
            if (cache.size() > capacity) {
                // Remove the oldest from the linked list...
                Node tail = popTail();
                // ...and completely delete it from the HashMap!
                cache.remove(tail.key);
            }
        }
    }
    public static void main(String[] args) {
        // 1. Build a shoe rack with a capacity of 3
        LRUCacheScratch cache = new LRUCacheScratch(3);

        System.out.println("--- Filling the Cache ---");

        cache.put(1, 100); // Add Shoe #1 (Sneakers)
        System.out.println("Added Shoe #1");

        cache.put(2, 200); // Add Shoe #2 (Boots)
        System.out.println("Added Shoe #2");

        cache.put(3, 300); // Add Shoe #3 (Sandals)
        System.out.println("Added Shoe #3");

        // Current Order (Newest to Oldest): [3] -> [2] -> [1]

        System.out.println("\n--- Testing the 'Get' (Moves item to the front) ---");

        // We wear Shoe #1 again!
        // Our 'get' method should instantly move it to the HEAD of the linked list.
        System.out.println("Fetching Shoe #1: " + cache.get(1)); // Output: 100

        // New Order: [1] -> [3] -> [2]
        // (Notice Shoe #2 is now at the TAIL, making it the oldest!)

        System.out.println("\n--- Triggering an Eviction ---");

        // We buy Shoe #4 (Loafers). The rack is full!
        // Because Shoe #2 is currently sitting at the TAIL, it gets snipped and thrown out.
        cache.put(4, 400);
        System.out.println("Added Shoe #4. Shoe #2 should be kicked out!");

        // New Order: [4] -> [1] -> [3]

        System.out.println("\n--- Verifying the Eviction ---");

        // Let's try to fetch Shoe #2. Our code returns -1 if it's not found.
        System.out.println("Fetching Shoe #2: " + cache.get(2)); // Output: -1 (It's gone!)

        // Let's check the others to prove they survived
        System.out.println("Fetching Shoe #1: " + cache.get(1)); // Output: 100 (Still here)
        System.out.println("Fetching Shoe #3: " + cache.get(3)); // Output: 300 (Still here)
        System.out.println("Fetching Shoe #4: " + cache.get(4)); // Output: 400 (Still here)
    }
}