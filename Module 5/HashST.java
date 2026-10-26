import java.util.ArrayList;

public class HashST<Key, Value> {

    private Node[] lists = new HashST.Node[1024];

    private class Node {
        Key key;
        Value val;
        Node next;

        Node(Key k, Value v, Node n) {
            key = k;
            val = v;
            next = n;
        }
    }

    private int hash(Key key) {
        return Math.abs(key.hashCode() % lists.length);
    }

    public Value get(Key key) {
        for (Node x = lists[hash(key)]; x != null; x = x.next)
            if (key.equals(x.key)) return x.val;
        return null;
    }

    public void put(Key key, Value val) {
        int i = hash(key);

        for (Node x = lists[i]; x != null; x = x.next)
            if (key.equals(x.key)) {
                x.val = val;
                return;
            }

        lists[i] = new Node(key, val, lists[i]);
    }

    // 1 Check if a key exists
    public boolean contains(Key key) {
        for (Node x = lists[hash(key)]; x != null; x = x.next)
            if (key.equals(x.key)) return true;
        return false;
    }

    // 2 Count the pairs
    public int size() {
        int count = 0;
        for (Node first : lists)
            for (Node x = first; x != null; x = x.next)
                count++;
        return count;
    }

    // 3 Get all the keys
    public Iterable<Key> keys() {
        ArrayList<Key> result = new ArrayList<>();
        for (Node first : lists)
            for (Node x = first; x != null; x = x.next)
                result.add(x.key);
        return result;
    }

    public static void main(String[] args) {
        HashST<String, Integer> table = new HashST<>();

        table.put("Apple", 5);
        table.put("Banana", 3);

        System.out.println(table.contains("Apple"));
        System.out.println(table.size());
        System.out.println(table.keys());
    }
}
