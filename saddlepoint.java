import java.util.Scanner;

public class saddlepoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3;
        int[][] a = new int[n][n];

        System.out.println("Enter 3x3 matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        boolean found = false;

        for (int i = 0; i < n; i++) {

            int minCol = 0;

            for (int j = 1; j < n; j++) {
                if (a[i][j] < a[i][minCol]) {
                    minCol = j;
                }
            }

            int saddle = a[i][minCol];
            boolean isSaddle = true;

            for (int k = 0; k < n; k++) {
                if (a[k][minCol] > saddle) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle) {
                System.out.println("Saddle Point = " + saddle);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Saddle Point");
        }

        sc.close();
    }
}

