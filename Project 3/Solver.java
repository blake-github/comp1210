import java.util.Scanner;
import java.text.DecimalFormat;
/** 
* Asks for user input then displays the results.
*
* Activity 2
* @author Blake Moore
* @version 1/28/2020
* 
*/ 
public class Solver
{
  /** 
  * Asks for user input then displays the results.
  *
  * @param args Command line arguments not used.
  */
   public static void main(String[] args)
   {
      //Declares all variables and assigns types
      Scanner userInput = new Scanner(System.in);
      double x;
      double result;
      String resultFinal;
      int left;
      int right;
      int index;
      String resultForm;
      DecimalFormat change = new DecimalFormat("#,##0.0####");
      double expOne = 4;
      double expTwo = 3;
      double expThree = 2;
      
      //Asks for user input
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      
      //Calculates the result and changes it to a string
      result = Math.sqrt(Math.abs((11 * Math.pow(x, expOne)) 
                   + (9 * Math.pow(x, expTwo))  
                   + (7 * Math.pow(x, expThree)) 
                   + (5 * x) + 4)) / ((2 * x) + 4);
      resultFinal = Double.toString(result);
     
      //Calculates the amount of characters before and after the decimal
      index = resultFinal.indexOf(".");
      right = resultFinal.length() - (index + 1);
      left = resultFinal.length() - right - 1;
      
      //Outputs all information in correct format
      System.out.println("Result: " + resultFinal);
      System.out.println("# of characters to left of decimal point: " + left);
      System.out.println("# of characters to right of decimal point: " + right);
      resultForm = change.format(result);
      System.out.println("Formatted Result: " + resultForm);
   }
}
