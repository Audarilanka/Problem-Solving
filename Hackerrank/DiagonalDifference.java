import java.util.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        int n;
        Scanner numbers = new Scanner(System.in);
        n = numbers.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = numbers.nextInt();
            }
        }
        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i)
                    x = x + a[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n - j - 1) {
                    y = y + a[i][j];
                }
            }
        }
        int dif = y - x;
        dif = Math.abs(dif);
        System.out.println(dif);
        // numbers.close();
    }
}
