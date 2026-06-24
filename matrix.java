import java.util.Scanner;

class matrix{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println("Enter the matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        System.out.println("3x3 Matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        s.close();
    }
}
