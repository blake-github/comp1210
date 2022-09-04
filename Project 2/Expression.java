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
public class Expression
{
    /** 
    * Asks for user input, outputs the operation, 
    * performs the operation, and outputs the result.
    *
    *@param args Command line arguments not used.
    */
   public static void main(String[] args)
   {
      //Defines variables with a data type.
      Scanner userInput = new Scanner(System.in);
      double x;
      double y;
      double result;
      double errorTrap;
      
      //Print operation and asks for input.
      System.out.println("result = (10x + 32.6) (5y - 1.567) / xy");
      System.out.print("\tx = ");
      x = userInput.nextDouble();
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      
      //Multiplies x and y to make sure it's not zero.
      errorTrap = (x * y);
      
      //If statement so if the divisor is 0 it outputs 
      //undefined statement and the result if not.
      if (errorTrap == 0)
      {
         System.out.println("result is \"undefined\"");
      }
      else 
      {
         result = ((10 * x + 32.6) * (5 * y - 1.567)) / (x * y);
         System.out.println("result = " + result);
      }
   }
    
}
