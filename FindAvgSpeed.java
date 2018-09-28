import java.util.*;

    public class FindAvgSpeed {

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int milePost1, milePost2, totalMiles, hoursTraveled, minutesTraveled;
            float totalHours, averageSpeed, minutesToHours;
        
            System.out.println("This program will calculate the average speed for you");
            
            System.out.println("Please enter starting mile post number: ");
            milePost1 = sc.nextInt();
            
            
            System.out.println("Please enter Ending mile post number: ");
            milePost2 = sc.nextInt();            
            
            System.out.println("Please enter total hours traveled: ");
            hoursTraveled = sc.nextInt();
            
            
            System.out.println("Please enter total number of minutes traveled: ");
            minutesTraveled = sc.nextInt();
            
            
            totalMiles = milePost2 - milePost1;
            totalHours = ((hoursTraveled * 60) + minutesTraveled);
            minutesToHours = (totalHours / 60);
            averageSpeed = totalMiles / minutesToHours;
            System.out.println("You're Average Speed was: " + averageSpeed);
        }
    }