////////////////////////////////////////////////////////
// Daniel Korab
// September 12th, 2014 
// CSE002 HW03 
//
// 
// Add scanner
import java.util.Scanner;
    
// First define a class
public class Root{
    
    // Add the main function
    public static void main(String [] args){
        
        Scanner myScanner; // Declare as variable
        myScanner = new Scanner(System.in); // Tells Scanner that you are creating an instance that will take input from STDIN
        
        System.out.print("Enter a double, and I print its cube root: "); // Allows user to enter the number they want a cube root of
        double x = myScanner.nextDouble(); // Takes input from user and uses it in calculations
        
        double guess1, guess2, guess3, guess4, guess5, answer, proof; // Declare the estimates of the cube root as variables
        
        guess1=x/3; // Determine the first guess
        guess2=(2*guess1*guess1*guess1+x)/(3*guess1*guess1); // Use the previous value to find a more accurate guess
        guess3=(2*guess2*guess2*guess2+x)/(3*guess2*guess2); // Use the previous value to find a more accurate guess
        guess4=(2*guess3*guess3*guess3+x)/(3*guess3*guess3); // Use the previous value to find a more accurate guess
        guess5=(2*guess4*guess4*guess4+x)/(3*guess4*guess4); // Use the previous value to find a more accurate guess
        answer=(2*guess5*guess5*guess5+x)/(3*guess5*guess5); // Use the previous value to find a more accurate guess
        proof=answer*answer*answer; // Calculate x once more using the answer that was found through prior calculations
        
        System.out.println("The cube root is "+ answer+": "+ answer+"*"+ answer+"*"+ answer+"="+ proof+"."); // Print out the results pf the calculation
        
    } // end of main method
} // end of class