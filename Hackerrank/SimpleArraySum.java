import java.util.*;


public class SimpleArraySum {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
            int num=in.nextInt();
        int sum=0;
        for(int i=0;i<num;i++)
            sum+=in.nextInt();
        System.out.println(sum);
	in.close();
 
    }
}
                    