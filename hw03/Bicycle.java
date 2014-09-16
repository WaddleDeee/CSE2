////////////////////////////////////////////////////////
// Daniel Korab
// September 12th, 2014 
// CSE002 HW03 
//
// 
// Add scanner
import java.util.Scanner;
    
// First define a class
public class Bicycle{
    
    // Add the main function
    public static void main(String [] args){
        
        Scanner myScanner; // Declare as variable
        myScanner = new Scanner(System.in); // Tells Scanner that you are creating an instance that will take input from STDIN
        
        System.out.print("Enter the number of seconds: "); // Allows user to enter amount of seconds
        int nSeconds = myScanner.nextInt(); // Takes input from user and uses it in calculations
        
        System.out.print("Enter the number of counts: "); // Allows user to enter amount of counts
        int nCounts = myScanner.nextInt(); // Takes input from user and uses it in calculations
        
        double wheelDiameter=27.0, // Define the diameter of the wheel 
        PI=3.14159, // Define a value for the constant pi
        feetPerMile=5280, // Define a value for "mile"
        inchesPerFoot=12, // Define a value for "foot" 
        secondsPerMinute=60; // Define a value for "minute"
        
        double distance; // Defines distance as a variable
        distance=nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile; // Calculates the total distance 
        
        double minutes; // Defines minutes as a variable
        minutes=nSeconds/secondsPerMinute; // Converts seconds to minutes
        
        // Prints the results of the calculations as an output
        System.out.println("The distance was "+ (int)(distance*100)/100.0+ " miles and took "+(int)(minutes*10)/10.0+ " minutes.");
        
    } // end of main method
} // end of class