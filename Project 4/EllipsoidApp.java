import java.util.Scanner;
/** 
* Asks for input, and uses Ellipsoid class for output.
*
* Activity 4
* @author Blake Moore
* @version 2/4/2020
* 
*/ 
public class EllipsoidApp
{
  /** 
  * Asks for input, and uses Ellipsoid class for output.
  *
  * @param args Command line arguments not used.
  */
   public static void main(String[] args)
   {
      //Sets vaiables with data types
      String label;
      double a, b, c;
      
      //Asks for inputs of label and a
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter label and axes a, b, c for an ellipsoid.");
      System.out.print("\tlabel: ");
      label = scan.nextLine();
      System.out.print("\ta: ");
      a = scan.nextDouble();
      
      //Error traps for a value
      if (a <= 0)
      {
         System.out.println("Error: axis value must be positive.");
      }
      else
      {
         //Asks for b value
         System.out.print("\tb: ");
         b = scan.nextDouble();
         
         //Error traps b value
         if (b <= 0)
         {
            System.out.println("Error: axis value must be positive.");
         }
         else
         {
            //Asks for c value
            System.out.print("\tc: ");
            c = scan.nextDouble();
            
            //Error traps for c value
            if (c <= 0)
            {
               System.out.println("Error: axis value must be positive.");
            }
            else
            {
               //Outputs the output
               Ellipsoid ellipsoid = new Ellipsoid(label, a, b, c);
               System.out.println("\n" + ellipsoid);
            }
         }
      }
   }
}
