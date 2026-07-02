import java.util.*;

public class unionfor{
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};

        HashSet<Integer> set = new HashSet<>();

        for (int i : a) {
            set.add(i);
        }

        for (int i : b) {
            set.add(i);
        }

        System.out.println("Union: " + set);
    }
}