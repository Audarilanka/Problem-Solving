import java.io.*;
import java.util.*;

public class CompareTriplets {

    public static void main(String[] args) {
        
   
        Scanner in = new Scanner(System.in);
        int[] alice = new int[3];
        int[] bob = new int[3];
        int a=0, b=0;
        for(int i=0;i<3;i++)
            alice[i]=in.nextInt();  
        for(int i=0;i<3;i++)
            bob[i]=in.nextInt();
        for(int i=0;i<3;i++)
            if(alice[i]>bob[i])
                a++;
            else if(alice[i]<bob[i])
                b++;
        System.out.println(a+" "+b);
       
    }
}
