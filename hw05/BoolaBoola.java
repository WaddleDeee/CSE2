////////////////////////////////////////////////////////
// Daniel Korab
// September 26th, 2014 
// CSE002 HW05
//
// This program will allow users to play various card games such as roulette or craps
//
// Add scanner
import java.util.Scanner;
    
// First define a class
public class BoolaBoola{
   
    // Add the main function
    public static void main(String [] args){
        
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        int value1, value2, value3, value4, value5;  
        
        // Let's the program randomize what the statement will look like
        value1 = (int)(Math.random()*2);
        value2 = (int)(Math.random()*2);
        value3 = (int)(Math.random()*2);
        value4 = (int)(Math.random()*2);
        value5 = (int)(Math.random()*2);
        
        // Defines the trues or falses of the statement for a certain random number
        boolean one = value1 < 1;
        boolean two = value2 < 1;
        boolean three = value3 < 1;
        
        //If RNG results in && and &&
        if(value4 == 0 && value5 == 0){
            
            System.out.println("Does "+ one+" && "+ two+" && "+ three+" have the value true(t/T) or false(f/F)?");
            
            //Calculates the answer and compares it to the user's
            String answer = myScanner.next();
            boolean actual = one && two && three; 
            boolean check = answer.equalsIgnoreCase("T");
            boolean output = check == actual;
                
                //Ensures true or false are the only answers allowed
                if(answer.equals("T") || answer.equals("t") || answer.equals("F") || answer.equals("f")){
                    if(output){
                        
                        System.out.println("Correct");
                    }
                    else
                        System.out.println("Incorrect");
                }
                else 
                    System.out.println("Incorrect");  
                    
        }
        
        //If RNG results in && and ||
        if(value4 == 0 && value5 == 1){
            
            System.out.println("Does "+ one+" && "+ two+" || "+ three+" have the value true(t/T) or false(f/F)?");
            
            //Calculates the answer and compares it to the user's
            String answer = myScanner.next();
            boolean actual = one && two || three; 
            boolean check = answer.equalsIgnoreCase("T");
            boolean output = check == actual;
                
                //Ensures true or false are the only answers allowed
                if(answer.equals("T") || answer.equals("t") || answer.equals("F") || answer.equals("f")){
                    if(output){
                        
                        System.out.println("Correct");
                    }
                    else
                        System.out.println("Incorrect");
                }
                else 
                    System.out.println("Incorrect");  
                    
        }
        
        //If RNG results in || and &&
        if(value4 == 1 && value5 == 0){
            
            System.out.println("Does "+ one+" || "+ two+" && "+ three+" have the value true(t/T) or false(f/F)?");
            
            //Calculates the answer and compares it to the user's
            String answer = myScanner.next();
            boolean actual = one || two && three; 
            boolean check = answer.equalsIgnoreCase("T");
            boolean output = check == actual;
                
                //Ensures true or false are the only answers allowed
                if(answer.equals("T") || answer.equals("t") || answer.equals("F") || answer.equals("f")){
                    if(output){
                        
                        System.out.println("Correct");
                    }
                    else
                        System.out.println("Incorrect");
                }
                else 
                    System.out.println("Incorrect");  
                    
        }
        
        //If RNG results in || and ||
        if(value4 == 1 && value5 == 1){
            
            System.out.println("Does "+ one+" || "+ two+" || "+ three+" have the value true(t/T) or false(f/F)?");
            
            //Calculates the answer and compares it to the user's
            String answer = myScanner.next();
            boolean actual = one || two || three; 
            boolean check = answer.equalsIgnoreCase("T");
            boolean output = check == actual;
                
                //Ensures true or false are the only answers allowed
                if(answer.equals("T") || answer.equals("t") || answer.equals("F") || answer.equals("f")){
                    if(output){
                        
                        System.out.println("Correct");
                    }
                    else
                        System.out.println("Incorrect");
                }
                else 
                    System.out.println("Incorrect");  
                    
        }
    
    } // end of main method
    
} // end of class