////////////////////////////////////////////////////////
// Daniel Korab
// September 22nd, 2014 
// CSE002 HW 04
//
// This program will allow users to find out how many days are in a month
// 
// Add scanner
import java.util.Scanner;
    
// First define a class
public class Month{
   
    // Add the main function
    public static void main(String [] args){
        
        Scanner myScanner; // Declare as variable
        myScanner = new Scanner( System.in ); // Tells Scanner that you are creating an instance that will take input from STDIN
        
        System.out.println("Enter an int giving the number of the month (1-12)- "); // Allows user to enter number for the month
        
        // Defines  the variable for the number of the month, and gives conditions for the integer entered
        if(myScanner.hasNextInt()){
        int nMonth = myScanner.nextInt();
        
            // The input of any integer in yellow below corresponds to months with 31 days
            if (nMonth == 1 || nMonth == 3 || nMonth == 5 || nMonth == 7 || nMonth == 8 || nMonth == 10 || nMonth == 12){
                
                System.out.println("The month has 31 days.");
                
            }
            
            // The input of any integer in yellow below corresponds to months with 30 days    
            else if (nMonth == 4 || nMonth == 6 || nMonth == 9 || nMonth == 11){
                
                System.out.println("The month has 30 days.");
                
            }
            
            // Because of leap years, February receives its own condition and input for the year
            else if (nMonth == 2){
            
            // If the year is a leap year (Divisible by 4 but not 100, all while being divisble by 400) output is 29 days, if not, it is 28
            System.out.println("Enter an int giving the year- "); 
            int nYear = myScanner.nextInt(); 
            
                if ((nYear % 4 == 0 && nYear %100 !=0) || (nYear % 400 == 0)){
                
                System.out.println("The month has 29 days.");
                
                }
            
                else System.out.println("The month has 28 days.");
            
            }
            
            // Error message if an integer outside of the range of 1 to 12 is entered    
            else if (nMonth > 12 || nMonth < 1){
                
                System.out.println("You did not enter an integer between 1 and 12.");
            
            }
            
        } // end of scanner
        
    } // end of main method
    
} // end of class
                
                
                
                
   