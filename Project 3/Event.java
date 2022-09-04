import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
/** 
* Asks for user for event code and outputs information in code.
*
* Activity 2
* @author Blake Moore
* @version 1/28/2020
* 
*/ 
public class Event
{
  /** 
  * Asks for user for event code and outputs information in code.
  *
  * @param args Command line arguments not used.
  */
   public static void main(String[] args)
   {
   
   //Sets up all variables
      Scanner userInput = new Scanner(System.in);
      Random superRandom = new Random();
      DecimalFormat change = new DecimalFormat("#,##0.00");
      int prize;
      String input;
      String trimIn;
      int length;
      String name;
      String dateF;
      String dateS;
      String dateT;
      String timeF;
      String timeS;
      String section;
      String row;
      String seat;
      String priceF;
      String priceS;
      String priceInitial;
      double priceCalc;
      double costF;
      String costS;
      String discount;
      double discountCalc;
      int decimal;
      
      //Asks for event code
      System.out.print("Enter your event code: ");
      input = userInput.nextLine();
      
      //Trims the code and gets it length
      trimIn = input.trim();
      length = trimIn.length();
      
      //Error traps if the code has less than 26 characters
      if (length < 26)
      {
         System.out.println("\nInvalid Event Code.");
         System.out.println("Event code must have at least 26 characters.");
      }
      
      //Calculates and outputs all information from the code
      else 
      {
      
         //Gets all information needed to output
         prize = superRandom.nextInt(10000);
         name = trimIn.substring(25);
         dateF = trimIn.substring(0, 2);
         dateS = trimIn.substring(2, 4);
         dateT = trimIn.substring(4, 8);
         timeF = trimIn.substring(8, 10);
         timeS = trimIn.substring(10, 12);
         priceF = trimIn.substring(12, 15);
         priceS = trimIn.substring(15, 17);
         discount = trimIn.substring(17, 19);
         section = trimIn.substring(19, 21);
         row = trimIn.substring(21, 23);
         seat = trimIn.substring(23, 25);
         priceInitial = (priceF + "." + priceS);
         priceCalc = Double.parseDouble(priceInitial);
         discountCalc = Double.parseDouble(discount);
         costF = (priceCalc - (priceCalc * (discountCalc / 100)));
         costS = change.format(costF);
         decimal = costS.indexOf("0");
         
         //Outputs all information
         System.out.print("\nEvent: " + name);
         System.out.print("   Date: " + dateF + "/" + dateS + "/" + dateT);
         System.out.println("   Time: " + timeF + ":" + timeS);
         System.out.print("Section: " + section);
         System.out.print("   Row: " + row);
         System.out.println("   Seat: " + seat);
         System.out.print("Price: $" + priceF + "." + priceS);
         System.out.print("   Discount: " + discount + "%");
         System.out.println("   Cost: $" + costS);
         System.out.println("Prize Number: " + prize);
      }
   }
}
