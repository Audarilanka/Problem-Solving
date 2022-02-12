
import java.util.*;

public class VeryBigSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long sum = 0;
        while(t-- > 0){
            sum += in.nextInt();
        }
        System.out.println(sum);
        in.close();
    }
}
