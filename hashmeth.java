import java.util.*;

public hashmeth{
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // Adding elements
        map.put(101, "Alice");
        map.put(102, "Bob");
        map.put(103, "Charlie");

        System.out.println("HashMap: " + map);

        // Get value
        System.out.println("Student 101: " + map.get(101));

        // Update value
        map.put(102, "David");
        System.out.println("After Update: " + map);

        // Remove
        map.remove(103);
        System.out.println("After Remove: " + map);

        // Check key
        System.out.println("Contains Key 101: " + map.containsKey(101));

        // Check value
        System.out.println("Contains Value Bob: " + map.containsValue("Bob"));

        // Size
        System.out.println("Size: " + map.size());

        // Keys
        System.out.println("Keys: " + map.keySet());

        // Values
        System.out.println("Values: " + map.values());

        // Iterate
        System.out.println("\nUsing entrySet()");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
