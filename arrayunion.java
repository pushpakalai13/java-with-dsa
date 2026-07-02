import java.util.*;

public class arrayunion{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] a = new int[n1];

        System.out.println("Enter first array elements:");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] b = new int[n2];

        System.out.println("Enter second array elements:");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n1; i++) {
            set.add(a[i]);
        }

        for (int i = 0; i < n2; i++) {
            set.add(b[i]);
        }

        System.out.println("Union = " + set);
    }
}