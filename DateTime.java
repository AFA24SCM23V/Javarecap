
import java.util.*;

public class DateTime {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Date time = new Date();
        System.out.printf("Current Time: %tT\n", time);

        // Another Method with all of them Hour
        // minutes and seconds seperated
        System.out.printf("Hours: %tH  Minutes: %tM Seconds: %tS\n", 
                          time,time, time);

        // Another Method to print the time
        // Followed by am/pm , time in milliseconds
        // nanoseconds and time-zone offset
        System.out.printf("%1$tH:%1$tM:%1$tS %1$tp %1$tL %1$tN %1$tz %n",
            time);
    }
}



/*
 * // Java program to demonstrate working of SimpleDateFormat
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// Driver Class
class Formatter3 {
    // main function
    public static void main(String args[])
        throws ParseException
    {
        // Formatting as per given pattern in the argument
        SimpleDateFormat ft
            = new SimpleDateFormat("dd-MM-yyyy");
      
        String str = ft.format(new Date());
        System.out.println("Formatted Date : " + str);

        // parsing a given String
        str = "02/18/1995";
        ft = new SimpleDateFormat("MM/dd/yyyy");
        Date date = ft.parse(str);

        // this will print the date as per parsed string
        System.out.println("Parsed Date : " + date);
    }
}

 */
