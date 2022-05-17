import java.util.*;

public class AppendandDelete {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        in.close();

        int sl = s.length();
        int tl = t.length();
        int ll = sl > tl ? tl : sl;
        int m;
        for (m = 0; m < ll; m++) {
            if (s.charAt(m) != t.charAt(m))
                break;
        }

        int sleft = sl - m;
        int tleft = tl - m;

        int flag = 0;

        if (sleft + tleft > k)
            flag = 1;
        else {
            int sub = k - (sleft + tleft);
            if ((sub % 2 != 0) && !(sub > 2 * m))
                flag = 1;
        }

        if (flag == 0)
            System.out.println("Yes");
        else
            System.out.println("No");

    }

}