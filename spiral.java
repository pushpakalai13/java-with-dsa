import java.util.Scanner;

class spiral {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("Enter 3x3 matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        int top = 0, bottom = 2;
        int left = 0, right = 2;

        System.out.println("Spiral Order:");

        while (top <= bottom && left <= right) {

            // Left -> Right
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Top -> Bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Right -> Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Bottom -> Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }

        s.close();
    }
}