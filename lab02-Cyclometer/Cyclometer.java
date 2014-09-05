////////////////////////////////////////////////////////
// Daniel Korab
// September 3rd, 2014 
// CSE002 Lab 2
//
// 
// First define a class
public class Cyclometer{
    
    // Add the main function
    public static void main(String [] args){
        int secsTrip1=480; // 480 seconds for trip 1
        int secsTrip2=3220; // 3220 seconds for trip 2
        int countsTrip1=1561; // Counts for trip 1
        int countsTrip2=9037; // Counts for trip 2
        double wheelDiameter=27.0, // Define the diameter of the wheel 
        PI=3.14159, // Define a value for the constant pi
        feetPerMile=5280, // Define a value for "mile"
        inchesPerFoot=12, // Define a value for "foot" 
        secondsPerMinute=60; // Define a value for "minute" 
        double distanceTrip1, distanceTrip2,totalDistance; // Double allows for more range in numbers and decimals, but uses more memory
       
        // Print the time and counts it took for trip 1
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts."); 
        
        // Print the time and counts it took for trip 2
        System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");
        
        // Calculate the distance traveled in trip 1
        // Below gives distance in inches
        // (for each count, a rotation of the wheel travels
        // the diameter in inches times PI) 
        distanceTrip1=countsTrip1*wheelDiameter*PI; 
        
        // Converts to distance in miles 
        distanceTrip1/=inchesPerFoot*feetPerMile; 
        
        // Converts to distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; 
        
        // Calculates total distance
        totalDistance=distanceTrip1+distanceTrip2;
        
        // Print the distance in miles of trip 1
        System.out.println("Trip 1 was "+distanceTrip1+" miles"); 
        
        // Print the distance in miles of trip 2
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        
        // Print the total distance traveled in miles
        System.out.println("The total distance was "+totalDistance+" miles");
        
    } // end of main method
} // end of class