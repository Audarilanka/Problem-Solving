import java.util.*;

public class DrawingBooks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int frontdist = p / 2;
        int backdist = n % 2 == 0 ? (n - p + 1) / 2 : (n - p) / 2;
        System.out.println(Math.min(frontdist, backdist));
        in.close();
        
    }
}
