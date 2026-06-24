import java.util.Scanner;

class matrixadd{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b=new int[3][3];
        int[][] sum=new int[3][3];
        System.out.println("Enter the a matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = s.nextInt();
            }
        }
      System.out.println("Enter the b matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = a[i][j]+b[i][j];
            }
        }
        System.out.println("3x3 Matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        s.close();
    }
}
