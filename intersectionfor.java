import java.util.*;

public class intersectionfor {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};

        HashSet<Integer> set = new HashSet<>();

        // Store first array
        for (int i : a) {
            set.add(i);
        }

        System.out.print("Intersection: ");

        // Check second array
        for (int i : b) {

            if (set.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
