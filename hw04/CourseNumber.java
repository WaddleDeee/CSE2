////////////////////////////////////////////////////////
// Daniel Korab
// September 22nd, 2014 
// CSE002 HW 04
//
// This program will allow users to determine when a Lehigh course was offered by its course number
//
// Add scanner
import java.util.Scanner;
    
// First define a class
public class CourseNumber{
   
    // Add the main function
    public static void main(String [] args){
        
        Scanner myScanner; // Declare as variable
        myScanner = new Scanner( System.in ); // Tells Scanner that you are creating an instance that will take input from STDIN  
        
        System.out.println("Enter a six digit number giving the course semester- "); // Allows user to enter an integer for the course semester
        
        // Defines the variable for the semester number and gives conditions for the integer entered
        if(myScanner.hasNextInt()){
        int nSemester = myScanner.nextInt();
        
            // Determines if the given input is in the range of possible answers
            if (nSemester >= 186510 && nSemester <= 201440){
            
            int nYear = nSemester / 100; // Calculates year
            
            int nError; // In the event of a mismatching semester, this defines the incorrect term
            nError = nSemester - (nYear*100); // In the event of a mismatching semester, this allows the program to determine the number of the incorrect term
            
                // Checking if the semester is in the spring
                if (nSemester - 10 == nYear * 100){
             
                System.out.println("The course was offered in the spring semester of "+ nYear+".");
                
                }
                
                // Checking if the semester is in the summer (1)
                else if (nSemester - 20 == nYear * 100){
             
                System.out.println("The course was offered in the summer 1 semester of "+ nYear+".");
                
                }
                
                // Checking if the semester is in the summer (2)
                else if (nSemester - 30 == nYear * 100){
             
                System.out.println("The course was offered in the summer 2 semester of "+ nYear+".");
                
                }
                
                // Checking if the semester is in the fall
                else if (nSemester - 40 == nYear * 100){
             
                System.out.println("The course was offered in the fall semester of "+ nYear+".");
                
                }
                
                // If none of the above semesters are found, prints the incorrect term number with a message
                else
                
                System.out.println(""+ nError+" is not a legitimate semester.");
                
            }
            
            // Prints an error if the given number is outside of the range
            else 
            
                System.out.println("The number was outside the range [186510,201440]");
        
        }

    } // end of main method 

} // end of class
            
            
            
            
            
            
            