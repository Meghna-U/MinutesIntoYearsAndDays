 
package minutesintoyearsanddays;

import java.util.Scanner;


public class MinutesIntoYearsAndDays {

    
    public static void main(String[] args) {
        int min,yrs,days;
        float x;
        System.out.println("Input the number of minutes:");
        Scanner s=new Scanner(System.in);
        min=s.nextInt();
        yrs=min/525600;
        x=(float)min/525600;
        days=(int) ((x-yrs)*365);
        System.out.println(min+" minutes is approximately "+yrs+" years and "+days+" days");
    }
    
}
