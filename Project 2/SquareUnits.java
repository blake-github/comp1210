import java.util.Scanner;
/** 
* Asks for user input, outputs the operation, performs
* the operation, and outputs the result.
*
* Activity 2
* @author Blake Moore
* @version 1/22/20
* 
*/ 
public class SquareUnits
{
    /** 
    * Asks for user input, outputs the operation, 
    * performs the operation, and outputs the result.
    *
    *@param args Command line arguments not used.
    */
   public static void main(String[] args)
   {
   
      //Defines variables as int type
      Scanner userInput = new Scanner(System.in);
      int input;
      int acres;
      int sqYards;
      int sqFeet;
      int sqInch;
      
      // Asks user for input
      System.out.print("Enter the area in square inches: ");
      input = userInput.nextInt();
      
      //Completes calculations
      acres = input / 6272640;
      sqYards = (input % 6272640) / 1296;
      sqFeet =  (input % 1296) / 144;
      sqInch = (input % 144);
      
      //Outputs values unless limit is exceeded
      if (input < 1000000000)
      {
         System.out.println("Number of Units: ");
         System.out.println("\tAcres: " + acres);
         System.out.println("\tSquare Yards: " + sqYards);
         System.out.println("\tSquare Feet: " + sqFeet);
         System.out.println("\tSquare Inches: " + sqInch);
      }
      else
      {
         System.out.println("Limit of 1,000,000,000 square inches exceeded!");
      }
   }
}
