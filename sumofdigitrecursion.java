public class sumofdigitrecursion {

    static int sum(int n) {

        // Base case
        if (n == 0) {
            return 0;
        }

        // Recursive case
        return n%10 + sum(n/10);
    }

    public static void main(String[] args) {

        int n = 1234;
        System.out.println(sum(n));

    }
}