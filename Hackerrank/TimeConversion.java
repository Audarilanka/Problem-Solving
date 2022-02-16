
import java.util.*;
import java.text.*;
public class TimeConversion {

       public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine(); 
        DateFormat inFormat = new SimpleDateFormat( "hh:mm:ssaa");
        DateFormat outFormat = new SimpleDateFormat( "HH:mm:ss");

        Date date = null;
        try {
            date = inFormat.parse(a); 
        }catch (ParseException b ){
            b.printStackTrace();
        }
        if( date != null ){
            String myDate = outFormat.format(date);
            System.out.println(myDate);
            in.close();
        }
    }

}


