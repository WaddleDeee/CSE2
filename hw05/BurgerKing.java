////////////////////////////////////////////////////////
// Daniel Korab
// September 30th, 2014 
// CSE002 HW 05
//
// This program will ask users what they would like to order from Burger King 
//
// Add scanner
import java.util.Scanner;
    
//First define a class
public class BurgerKing{
   
    // Add the main function
    public static void main(String [] args){
        
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        //Asks the user what they would like to oder
        System.out.println("Enter a letter to indicate a choice of");
        System.out.println("    Burger (B or b)");
        System.out.println("    Soda (S or s)");
        System.out.println("    Fries (F or f)");
        
        String food = myScanner.next();
        
        //Ensures that the answer given will be one character long only
        if(food.length()==1){
            switch (food){
                
                case "B":
                case "b":
                    
                    //If the user orders a burger, this case will be fulfilled and they will then get to state their choice of topping before their choice is printed out
                    System.out.println("Enter A or a for \"all the fixins\"");
                    System.out.println("    C or c for cheese");
                    System.out.println("    N or n for none of the above");
                    
                    String topping = myScanner.next();
                    
                        switch (topping){
                            
                            case "A":
                            case "a":
                                
                                System.out.println("You ordered a burger with \"all the fixins\".");
                                break;
                                
                            case "C":
                            case "c":
                                
                                System.out.println("You ordered a burger with cheese.");
                                break;
                                
                            case "N":
                            case "n":
                                
                                System.out.println("You ordered a burger with nothing on it.");
                                break;
                                
                        }
                        break;
                
                case "S":
                case "s":
                
                    //If the user orders a soda, this case will be fulfilled and they will then get to state their choice of soda before their choice is printed out
                    System.out.println("Do you want Pepsi (p or P),");
                    System.out.println("    Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)");
                    
                    String soda = myScanner.next();
                    
                    switch (soda){
                        
                        case "P":
                        case "p":
                            
                            System.out.println("You ordered a Pepsi.");
                            break;
                            
                        case "C":
                        case "c":
                            
                            System.out.println("You ordered a Coke.");
                            break;
                            
                        case "S":
                        case "s":
                            
                            System.out.println("You ordered a Sprite.");
                            break;
                            
                        case "M":
                        case "m":
                            
                            System.out.println("You ordered a Mountain Dew.");
                            break;
                            
                    }
                    break;
                    
                case "F":
                case "f":
                    
                    //If the user orders fries, this case will be fulfilled and they will then get to state their choice of size before their choice is printed out
                    System.out.println("Do you want a large or small order of fries (l,L,s, or S)");
                    
                    String fries = myScanner.next();
                    
                    switch (fries){
                        
                        case "L":
                        case "l":
                            
                            System.out.println("You ordered large fries.");
                            break;
                            
                        case "S":
                        case "s":
                            
                            System.out.println("You ordered small fries.");
                            break;
                            
                    }
                    break;
                
                //If the user gives an invalid answer, this case is fulfilled     
                default:
                
                    System.out.println("You did not enter any of B, b, S, s, F, or f");
                    break;
                
            }
        
        }
        //If the character length of the intial order exceeds 1, the program tells the user that a single character is needed
        else 
        
            System.out.println("A single character expected.");
            
    } // end of main method
    
} // end of class
        
    
    

            