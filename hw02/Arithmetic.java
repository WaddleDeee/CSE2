////////////////////////////////////////////////////////
// Daniel Korab
// September 5th, 2014 
// CSE002 hw02
//
// 
// First define a class
public class Arithmetic{
        
    // Add the main function
    public static void main(String [] args){
        int nSocks=3; // Numbers of pairs of socks
        double sockCost$=2.58; // Cost per pair of socks ($ is included for variable name)  
        int nGlasses=6; // Number of drinking glasses
        double glassCost$=2.29; // Cost per glass
        int nEnvelopes=1; // Number of boxes of envelopes
        double envelopeCost$=3.25; // Cost per box of envelopes
        double taxPercent=0.06; // PA sales tax applied after purchase
        
        double totalSockCost$; // Total cost of socks
        double totalGlassCost$; // Total cost of glasses
        double totalEnvelopeCost$; // Total cost of envelopes
        
        double totalSockTax$; // Total tax for the socks
        double totalGlassTax$; // Total tax for the glasses
        double totalEnvelopeTax$; // Total tax for the envelopes
        
        double totalPurchaseCost$; // Total cost of all the items
        double totalPurchaseTax$; // Tax of the purchase
        
        
        totalSockCost$=nSocks*sockCost$; // Calculates the total cost of socks
        totalGlassCost$=nGlasses*glassCost$; // Calculates the total cost of glasses
        totalEnvelopeCost$=nEnvelopes*envelopeCost$; // Calculates the total cost of enevelopes
        
        totalSockTax$=totalSockCost$*taxPercent; // Calculates the total tax of socks
        totalGlassTax$=totalGlassCost$*taxPercent; // Calculates the total tax of glasses
        totalEnvelopeTax$=totalEnvelopeCost$*taxPercent; // Calculates the total tax of envelopes
        
        totalPurchaseCost$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$; // Calculates the final cost of the purchases
        totalPurchaseTax$=totalPurchaseCost$*taxPercent; // Calculates the final sales tax
        
        // Print the outputs below
        // ((int)(tax * 100) / 100.0 is used to round to 2 decimal places for tax) 
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(""+ (nSocks)+" pairs of socks were bought, for $"+ (sockCost$)+" each.");
        System.out.println(""+ (nGlasses)+" glasses was bought, for $"+ (glassCost$)+" each.");
        System.out.println(""+ (nEnvelopes)+" box of envelopes was bought, for $"+ (envelopeCost$)+" each.");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("The socks costed a total of $"+ (totalSockCost$)+" and had a tax of $"+ (int)(totalSockTax$*100)/100.0+".");
        System.out.println("The drinking glasses costed a total of $"+ (totalGlassCost$)+" and had a tax of $"+ (int)(totalGlassTax$*100)/100.0+".");
        System.out.println("The boxes of envelopes costed a total of $"+ (totalEnvelopeCost$)+" and had a tax of $"+ (int)(totalEnvelopeTax$*100)/100.0+".");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("The total cost of the purchases before tax was $"+ (totalPurchaseCost$)+" and the total sales tax was $"+ (int)(totalPurchaseTax$*100)/100.0+".");
        System.out.println("The total cost of the purchases after tax is $"+ (totalPurchaseCost$ + (int)(totalPurchaseTax$*100)/100.0)+".");
        System.out.println("-----------------------------------------------------------------------");
       
    } // End of function
} // End of class