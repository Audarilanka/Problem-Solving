import java.util.*;
public class CircularArrayRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt(), q = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = in.nextInt();
        for(int i = 0; i < q; i++) System.out.println(a[(n+((in.nextInt()-k)%n)) % n]);
        in.close();
    }
}
