
import java.util.*;

public class SimpleArraySum {

    public static int sumArray( int[] arr ){ 
        int x = 0;
        for (int i = 0; i < arr.length; i++){
            x = x + arr[i];
        }
        return x;

    }
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];
       
        String numbers = null;
        String[] splitString = null;
        while ( in.hasNextLine() ){
          numbers = in.nextLine();
          splitString = numbers.split("\\s");

          if (splitString.length == size){
            break;
          } 

        }
        int i = 0;
        for (String s : splitString){
          array[i] = Integer.parseInt(s);
          i++;
        }
        System.out.println( sumArray(array) );
        in.close();

    }
}
