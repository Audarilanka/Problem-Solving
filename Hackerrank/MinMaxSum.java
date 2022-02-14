import java.util.*;

public class MinMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] n = new long[5];
        for (int i = 0; i < 5; i++) {
            n[i] = in.nextLong();
        }
        Arrays.sort(n);
        long x = 0;
        long y = 0;
        for (int i = 0; i < 4; i++) {
            x += n[i];
        }
        for (int i = 1; i < 5; i++) {
            y += n[i];
        }
        System.out.println(x + " " + y);
    }
}
