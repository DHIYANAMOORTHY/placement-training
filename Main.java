import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Rows: ");
        int row = sc.nextInt();

        System.out.print("Columns: ");
        int col = sc.nextInt();

        int[][] a = new int[row][col];
        int[][] b = new int[row][col];
        int[][] c = new int[row][col];

        System.out.println("Enter Matrix A:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Matrix B:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Result Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}