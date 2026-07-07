public class factrecursion {

    static int fact(int n) {

        // Base case
        if (n == 0 || n==1) {
            return n;
        }

        // Recursive case
        return n*fact(n-1);
    }

    public static void main(String[] args) {

        int n = 5;
        System.out.println(fact(n));

    }
}