////////////////////////////////////////////////////////
// Daniel Korab
// September 12th, 2014 
// CSE002 HW03 
//
// 
// Add scanner
import java.util.Scanner;
    
// First define a class
public class FourDigits{
    
    // Add the main function
    public static void main(String [] args){
        
        Scanner myScanner; // Declare as variable
        myScanner = new Scanner(System.in); // Tells Scanner that you are creating an instance that will take input from STDIN
        
        System.out.print("Enter a double and I display the four digits to the right of the decimal point: "); // Allows user to enter the number
        double number = myScanner.nextDouble(); // Takes input from user and uses it in calculations
        int integer; // Declares the decimal portion of the calculation as an int
        int integer2; // Declares the integer portion of the calculation as an int
        int answer; // Declares the final answer as an int
        
        String fourDigit = String.format("%4d", 1); // Used to keep all results in a 4 digit format, even 0s
        
        integer = (int)(number*10000); // Finding the decimal portion ex. 2.2223 = 22223
        integer2 = (int)(number)*10000; // Finding the integer portion ex. 2.2223 = 20000
        
        answer =  integer % integer2; // Remainder operation used to display remainder only ex. 22223 % 20000 = 2223
        
        System.out.print("The four digits are "); // Printing the worded portion of the statement 
        System.out.println(String.format("%04d", answer)); // Printing the answer in '0000' format 
        
    } // end of main method
} // end of main class
        