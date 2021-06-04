 
package minutesintoyearsanddays;

import java.util.Scanner;


public class MinutesIntoYearsAndDays {
    public static void convert(int min) {
        int yrs,days;
        float x;
        yrs=min/525600;
        x=(float)min/525600;
        days=(int) ((x-yrs)*365);
        System.out.println(min+" minutes is approximately "+yrs+" years and "+days+" days");
    }

    
    public static void main(String[] args) {
        int min;
        System.out.println("Input the number of minutes:");
        Scanner s=new Scanner(System.in);
        min=s.nextInt();
        convert(min);
    }
    
}
