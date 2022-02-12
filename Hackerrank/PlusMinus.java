import java.util.*;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner array = new Scanner(System.in);
        int n = array.nextInt();
        int positive = 0;
        int zero = 0;
        int negative = 0;
        
        for (int i = 0; i < n; i++) {
            int a = array.nextInt();
            if (a > 0) {
                positive++;
            } else if (a == 0) {
                zero++;
            } else {
                negative++;
            }
        }
        System.out.println(positive / (double) n);
        System.out.println(negative / (double) n);
        System.out.println(zero / (double) n);
        array.close();
    }

}


