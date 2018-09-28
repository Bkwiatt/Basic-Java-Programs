import java.util.*;
import java.lang.Math;

    public class WindChill {

        public static void main(String args[]){
            System.out.println("Wind Chill Calculator Program");   
            System.out.println("-----------------------------");
            
            Scanner sc = new Scanner(System.in);
            
            //Obtaining user input for wind chill formula
            System.out.print("Enter the temperature in Fahrenheit" + 
            "(Must be between -58\u00b0F and 41\u00b0F): ");            
            int temp = sc.nextInt();
            
            
            System.out.print("Enter the wind speed miles per hour " + 
            "(must be at least 2): ");
            int windSpeed = sc.nextInt();
            
            
            //Calculating wind chill index
            double windChill = (35.74 + (0.6215 * temp)) - (35.75 * Math.pow(windSpeed,0.16)) 
            + (0.4275 * temp * Math.pow(windSpeed,0.16)); 
            
            System.out.print("The wind chill index is: " + windChill);
        }
        
        
        public void doMath()
        {
            int a = 1;
            int b = 2;
            
            System.out.println(a + b);
        }
        
        
    }