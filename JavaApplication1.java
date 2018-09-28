import java.util.*;

    public class JavaApplication1 {
        // associate a Scanner with the keyboard
        // Explain the program to the user

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            
            
            System.out.println("--- Base 10 to Base 8 Conversion ---");
            System.out.println("====================================");

            System.out.println("This program convert an integer from base 10");
            System.out.println("into base 8.  We assume that the number entered is 4 digits or less.");
            System.out.println("As output, it will print both numbers. ");
            System.out.println("It will also recalculate the base 10 number from the base 8 number.");
            

        // Ask for original number
        System.out.print("Enter base 10 number (no more than 4 digits): ");
        int basel0Number = sc.nextInt();
/* Make sure number is 4 digits or less by using %10000.
           Any larger digits will be truncated. */

        int amt10Left = basel0Number % 10000;

        // 8's digits:  4096 512 64 8 1
        // 10's digits were 1000 100 10 1


        // First, get # of 4096's in the number (will be 2 or less)
        int pos5 = amt10Left / 4096;



        // subtract 4096's from original
        amt10Left = amt10Left - (4096 * pos5);


        // repeat actions to get each position

        //Get # of 512's in said number
        int pos4 = amt10Left / 512;
        amt10Left = amt10Left - (512 * pos4);

        // get # of 64's in the number
        int pos3 = amt10Left / 64;
        amt10Left = amt10Left - (64 * pos3);


        // get # of 8's in the number
        int pos2 = amt10Left / 8;
        amt10Left = amt10Left - (8 * pos2);

        // get 1's
        int pos1 = amt10Left / 1;

        // print the original number and the result
        System.out.println("Original number = " + basel0Number);

        //To double-check your work, convert in the other direction:
        int backToOriginal = (pos5 * 4096 + pos4 * 512 + pos3 * 64 + pos2 * 8 + pos1);

        System.out.printf("Number in base 8 = %d%d%d%d%d", pos5,pos4,pos3,pos2,pos1);

        System.out.println("\nBase 8 number converted to original = " + backToOriginal);


}
}