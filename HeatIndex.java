import java.util.*;
import java.lang.Math;

    public class HeatIndex {

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);            
       
            System.out.print("Enter the Fahrenheit temperature (between 80 deg F and 110 deg F): ");   
            int t = sc.nextInt();
            
            WindChill a = new WindChill();
            
            if(t >= 80 && t <= 110)
            {
                System.out.print("Enter the relative humidity (between 40% and 100%): ");
                int r = sc.nextInt();
                
                if(r >= 40 && r <= 100)
                {
                    double heatIndex = (-42.379 + (2.04901523 * t) + ((10.14333127 * r) - (0.22475541 * t * r) - (6.83783 * Math.pow(10, -3) * Math.pow(t, 2)) - 
                                       (5.481717 * Math.pow(10, -2) * Math.pow(r, 2)) + (1.22874 * Math.pow(10, -3) * 
                                       Math.pow(t, 2) * r) + (8.5282 * Math.pow(10, -4) * t * Math.pow(r, 2)) - (1.99 * Math.pow(10, -6) * Math.pow(t, 2) * Math.pow(r, 2))));
                    
                    
                    System.out.print("At " + t + " degrees Fahrenheit with " + r + " % humidity, the heat index will make it feel like " + Math.round(heatIndex) + " degrees");
                }
                else{System.out.print("Go back and read the directions!!!");}
            }
            else{System.out.print("Go back and read the directions!!!!");}
        }
    }