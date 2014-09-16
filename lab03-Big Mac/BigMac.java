////////////////////////////////////////////////////////
// Daniel Korab
// September 12th, 2014 
// CSE002 Lab 3
//
// 
// Add scanner
import java.util.Scanner;
    
// First define a class
public class BigMac{
    
    // Add the main function
    public static void main(String [] args){
        
        Scanner myScanner; // Declare as variable
        myScanner = new Scanner(System.in); // Tells Scanner that you are creating an instance that will take input from STDIN
            
        System.out.print("Enter the number of Big Macs(an integer > 0): "); // System will not go to the beginning of the next line after displaying the prompt
        
        int nBigMacs = myScanner.nextInt(); // Variable for number of Big Macs
        
        System.out.print("Enter the cost per Big Mac as"+" a double (in the form xx.xx): "); // Allows user to enter amount of Big Macs purchased
        double bigMac$ = myScanner.nextDouble(); // Defines Big Mac cost a double
        System.out.print("Enter the percent tax as a whole number (xx): "); // Allows user to enter sales tax
        double taxRate = myScanner.nextDouble(); // Defines tax as a double
        taxRate/=100; // User enters percent, but I want proportion
        
        double cost$; // Defines total cost a double
        int dollars, // Defines dollars as an integer, since they are without decimals
            dimes, pennies; // Defines dimes and pennies as integers in order to add them and get cost to be a double 
        cost$ = nBigMacs*bigMac$*(1+taxRate); // Formula for calculating total cost
        dollars=(int)cost$; // Converts cost to an int 
        dimes=(int)(cost$*10)%10; // Converts cost to an int and then divides to allow for dimes 
        pennies=(int)(cost$*100)%10; // Converts cost to an int and then divides to allow for pennies
        System.out.println("The total cost of "+ nBigMacs+" BigMacs, at $"+ bigMac$+" per bigMac, with a"+" sales tax of"+ (int)(taxRate*100)+"%, is $"+ dollars+'.'+dimes+pennies); // Final message 
      
        }  //end of main method   
  } //end of class
