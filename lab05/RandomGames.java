////////////////////////////////////////////////////////
// Daniel Korab
// September 26th, 2014 
// CSE002 Lab 5
//
// This program will alow users to play various card games such as roulette or craps
//
// Add scanner
import java.util.Scanner;
    
// First define a class
public class RandomGames{
   
    // Add the main function
    public static void main(String [] args){
        
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        System.out.println("Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");
        
        String game = myScanner.next();
        
        if(game.length()==1){
            
            if(game.equals("R") || game.equals("r") || game.equals("C") || game.equals("c") || game.equals("P") || game.equals("p")){
                
             
                
                if(game.equals("R") || game.equals("r")){
                    
                    int number = (int)(Math.random()*38);
                    
                    System.out.println("Roulette: "+ number+".");
                    
                    if(number == 37)
                    
                    System.out.println("Roulette: 00.");
                    
                }
                    
                if(game.equals("C") || game.equals("c")){
                
                    System.out.println("Craps option is yet to be implemented.");
                    
                }
                    
                if(game.equals("P") || game.equals("p")){
                
                    System.out.println("Picking a card not implemented yet.");
            
                }
                
            }
            else 
            
                System.out.println("'" +game+"' is not one of of 'R', 'r', 'C', 'c', 'P', or 'p'.");
            
            
        }
        else 
        
            System.out.println("A single character expected.");
    }
}