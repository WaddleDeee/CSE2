////////////////////////////////////////////////////////
// Daniel Korab
// September 22nd, 2014 
// CSE002 HW 04
//
// This program will allow users to determine the time after inputting the amount of seconds that have passed
//
// Add scanner
import java.util.Scanner;
    
// First define a class
public class TimePadding{
   
    // Add the main function
    public static void main(String [] args){
        
        Scanner myScanner; // Declare as variable
        myScanner = new Scanner( System.in ); // Tells Scanner that you are creating an instance that will take input from STDIN  
        
        System.out.println("Enter the time in seconds: "); // Allows user to enter the amount of seconds that have passed in a day
        
        // Defines the variable for the total number of seconds and how to convert into hours and minutes
        if(myScanner.hasNextInt()){
        int nSeconds = myScanner.nextInt();
            
            // Calculates the amount of hours that have passed
            int nTimeHours;
            nTimeHours = nSeconds / 3600;
            
            // Calculates the amount of minutes that have passed (after counting hours)
            int nTimeMinutes;
            nTimeMinutes = (nSeconds % 3600) / 60;
            
            // Calculates the amount of seconds that have passed (after counting hours and minutes)
            int nTimeSeconds;
            nTimeSeconds = (nSeconds % 3600) % 60;
            
                // Prints hours place depending on how many have passed
                if (nTimeHours < 1){ 
            
                System.out.print("The time is 00:");
                
                }
                
                // Prints hours place depending on how many have passed
                else if (nTimeHours >= 1 && nTimeHours < 10){
                
                System.out.print("The time is 0" +nTimeHours+":");
                
                }
                
                // Prints hours place depending on how many have passed
                else if (nTimeHours >= 10){
                    
                System.out.print("The time is " +nTimeHours+":");
                    
                }
                
                // Prints minutes place depending on how many have passed
                if(nTimeMinutes < 1){
                    
                System.out.print("00:");
                
                }
                
                // Prints minutes place depending on how many have passed
                else if(nTimeMinutes >=1 && nTimeMinutes < 10){
                    
                System.out.print("0" +nTimeMinutes+":");
                
                }
                
                // Prints minutes place depending on how many have passed
                else if(nTimeMinutes >= 10 && nTimeMinutes < 60){
                    
                System.out.print("" +nTimeMinutes+":");
                
                }
                
                // Prints seconds place depending on how many have passed
                if (nTimeSeconds < 1){
                    
                System.out.println("00.");
                
                }
                
                // Prints seconds place depending on how many have passed
                else if (nTimeSeconds >= 1 && nTimeSeconds < 10){
                    
                System.out.println("0" +nTimeSeconds+".");
                
                }
                
                // Prints seconds place depending on how many have passed
                else if (nTimeSeconds >= 10 && nTimeSeconds < 60){
                    
                System.out.println("" +nTimeSeconds+".");
                
                }
    
        }
        
    } // end of main method 
    
} // end of class 




