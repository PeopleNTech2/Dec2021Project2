package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        System.out.println("The Current complete Date is:" + calendar.getTime());
        System.out.println("The Current Date is:" + calendar.get(Calendar.DATE));
        System.out.println("The Current minute is:" + calendar.get(Calendar.MINUTE));
        System.out.println("The Current second is:" + calendar.get(Calendar.SECOND));

        //day class & SimpleDateFormat
        // Instantiate a Date object
        Date date = new Date();

        java.util.Date dNow = new java.util.Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy/MM/dd");

        System.out.println("Current Date: " + ft.format(dNow));

        /*
        Pattern                             Example
        dd-MM-yy                            31-01-12
        dd-MM-yyyy	                        31-01-2012
        MM-dd-yyyy	                        01-31-2012
        yyyy-MM-dd	                        2012-01-31
        yyyy-MM-dd HH:mm:ss	                2012-01-31 23:59:59
        yyyy-MM-dd HH:mm:ss.SSS	            2012-01-31 23:59:59.999
        yyyy-MM-dd HH:mm:ss.SSSZ	        2012-01-31 23:59:59.999+0100
        EEEEE MMMMM yyyy HH:mm:ss.SSSZ	    Saturday November 2012 10:45:42.720+0100
        */

    }
}
