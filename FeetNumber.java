package FeetNumber;

//import java.util.Scanner;

/*
Mila Arkhiptcova
This program reads a number in feet, converts it to meters, and displays the result
08/27/2019
Bellevue University
FeetNumber.java
*/

public class FeetNumber {
	
	public static void main(String[] args) {
 		 
		 int randomInt = (int)( Math.random() * 10); //generate a random number between 0 and 10.
        
        switch (randomInt) {
           
           case 0: System.out.printf("The number %d is spelled zero ", randomInt);
           break;
           
           case 1: System.out.printf("The number %d is spelled one ", randomInt);
           
			case 2: System.out.printf("The number %d is spelled two ", randomInt);
			
			case 3: System.out.printf("The number %d is spelled three ", randomInt);
			
			case 4: System.out.printf("The number %d is spelled four ", randomInt);
			
			case 5: System.out.printf("The number %d is spelled five ", randomInt);
			
			case 6: System.out.printf("The number %d is spelled six ", randomInt);
			
			case 7: System.out.printf("The number %d is spelled seven ", randomInt);
			
			case 8: System.out.printf("The number %d is spelled eight ", randomInt);
			
			case 9: System.out.printf("The number %d is spelled nine ", randomInt);
			
			case 10: System.out.printf("The number %d is spelled ten ", randomInt);
		 }

}
}			
