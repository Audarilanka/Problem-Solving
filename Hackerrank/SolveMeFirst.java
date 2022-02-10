import java.util.Scanner;
public class SolveMeFirst 
{

public static int problem(int a,int b) 
{
  return (a+b);  
}
      
 public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        
        int b = x.nextInt();
        
        int sum;
        sum = a+b;
        
        System.out.println(sum);
   }
}
