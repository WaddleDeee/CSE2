////////////////////////////////////////////////////////
// Daniel Korab
// September 22nd, 2014 
// CSE002 HW 04
//
// This program will allow users to calculate the income tax of a person depending on their income bracket
//
// Add scanner
import java.util.Scanner;
    
// First define a class
public class IncomeTax{
   
    // Add the main function
    public static void main(String [] args){
        
        Scanner myScanner; // Declare as variable
        myScanner = new Scanner( System.in ); // Tells Scanner that you are creating an instance that will take input from STDIN  
        
        System.out.println("Enter an int giving the number of thousands- "); // Allows user to enter an integer for 1,000s of dollars of income 
        
        // Defines the variable for income and gives conditions for the integer entered
        if(myScanner.hasNextInt()){
        int nIncome = myScanner.nextInt();
         
            // Calculation of tax for $0-$20,000 of income
            if (nIncome > 0 && nIncome < 20){    
                
                double tax = 0.05; 
                double totalTax;
                
                totalTax = nIncome * 1000 * tax;
                System.out.println("The tax rate on $" +(nIncome)*(1000)+" is " +(tax)*(100)+"%, and the tax is $" +(int)(totalTax*100)/100+".0");
                
            }
            
            // Calculation of tax for $20,000-$40,000 of income
            else if (nIncome >= 20 && nIncome < 40){
                
                double tax = 0.07;
                double totalTax;
                
                totalTax = nIncome * 1000 * tax;
                System.out.println("The tax rate on $" +(nIncome)*(1000)+" is " +(int)(tax*100)+"%, and the tax is $" +(int)(totalTax*100)/100+".0");
                
            }
            
            // Calculation of tax for $40,000-$78,000 of income    
            else if (nIncome >= 40 && nIncome < 78){
                
                double tax = 0.12;
                double totalTax;
                
                totalTax = nIncome * 1000 * tax;
                System.out.println("The tax rate on $" +(nIncome)*(1000)+" is " +(int)(tax*100)+"%, and the tax is $" +(int)(totalTax*100)/100+".0");
                
            }
            
            // Calculation of tax for more than $78,000 of income
            else if (nIncome >= 78){
                
                double tax = 0.14;
                double totalTax;
                
                totalTax = nIncome * 1000 * tax;
                System.out.println("The tax rate on $" +(nIncome)*(1000)+" is " +(int)(tax*100)+"%, and the tax is $" +(int)(totalTax*100)/100+".0");
                
            }
            
            // Error message if negative integer is entered
            else if (nIncome < 0){
            
                System.out.println("You did not enter a positive integer.");
                return;
                
            }
            
        } 
        
        // Error message if no integer is entered
        else 
            
            System.out.println("You did not enter an integer.");
  
    } //end of main method
    
} //end of class

            