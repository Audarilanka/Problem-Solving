import java.util.*;

public class CatsandAMouse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        in.close();

        for (int a0 = 0; a0 < q; a0++) {

            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            int catADist = Math.abs(x - z);
            int catBDist = Math.abs(y - z);
            if (catADist == catBDist) {
                System.out.println("Mouse C");
            } else if (catADist < catBDist) {
                System.out.println("Cat A");
            } else {
                System.out.println("Cat B");
            }
        }
    }
}