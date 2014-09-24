////////////////////////////////////////////////////////
// Daniel Korab
// September 19th, 2014 
// CSE002 Lab 4
//
// This program will alow users to calculate the cost of their Big Macs and whether or not they want fries as well
//
// Add scanner
import java.util.Scanner;
    
// First define a class
public class BigMacAgain{
   
    // Add the main function
    public static void main(String [] args){
        
        Scanner myScanner;
        myScanner = new Scanner( System.in );  
        
        System.out.println("Enter the number of Big Macs: ");
        
        if(myScanner.hasNextInt()){
            
            int nBigMacs = myScanner.nextInt(); // Variable for number of Big Macs
            if (nBigMacs > 0){
                
                int dollars, dimes, pennies; 
                double cost$;
                
                cost$ = nBigMacs*2.22;
                
                dollars=(int)cost$; // Converts cost to an int 
                dimes=(int)(cost$*10)%10; // Converts cost to an int and then divides to allow for dimes 
                pennies=(int)(cost$*100)%10; // Converts cost to an int and then divides to allow for pennies
                
                System.out.println("You ordered " +nBigMacs+"for a cost of " +nBigMacs"x2.22 = $"+ dollars+'.'+dimes+pennies);
                
                System.out.println("Do you want an order of fries?  (Y/y/N/n)?");
                
                if(myScanner.hasNext()){
                    
                    
                    
            
            
            
            
            
            
            
            
            else{
            System.out.println("You did not enter an int");
            return;
            
            }
                
	} //end of main method
} //end of class
