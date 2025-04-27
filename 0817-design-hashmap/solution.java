import java.util.LinkedList;

class MyHashMap {
    
    // Node class to store key-value pair
    class Node {
        int key, value;
        
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Node>[] buckets;
    private int size = 1000; // number of buckets

    public MyHashMap() {
        buckets = new LinkedList[size];
    }

    private int hash(int key) {
        return key % size;
    }
    
    public void put(int key, int value) {
        int index = hash(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        
        for (Node node : buckets[index]) {
            if (node.key == key) {
                node.value = value; // Update existing key
                return;
            }
        }
        
        buckets[index].add(new Node(key, value)); // Add new key-value
    }
    
    public int get(int key) {
        int index = hash(key);
        if (buckets[index] != null) {
            for (Node node : buckets[index]) {
                if (node.key == key) {
                    return node.value;
                }
            }
        }
        return -1; // Not found
    }
    
    public void remove(int key) {
        int index = hash(key);
        if (buckets[index] != null) {
            buckets[index].removeIf(node -> node.key == key);
        }
    }
}


/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
