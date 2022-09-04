import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
   /** 
* Asks for input, and uses Ellipsoid class for output.
*
* Activity 4
* @author Blake Moore
* @version 2/4/2020
* 
*/ 
public class EllipsoidListApp
{
  /** 
  * Asks for input, and uses Ellipsoid class for output.
  *
  * @param args Command line arguments not used.
  * @throws FileNotFoundException throws error if no file.
  */
   public static void main(String[] args) throws FileNotFoundException
   {
      //Sets variables
      String input, line;
      double aIn, bIn, cIn;
      Scanner read = new Scanner(System.in);
      ArrayList<Ellipsoid> array = new ArrayList<Ellipsoid>();
      
      //Asks for input and sets it to be file name
      System.out.print("Enter file name: ");
      input = read.nextLine();
      String name = "";
      Scanner scan = new Scanner(new File(input));
      name = scan.nextLine();
      System.out.println("\n" + name);
      
      //Scans in the data from file and assigns it then 
      // creates ellipsoid objects and puts them in array
      while (scan.hasNext())
      {
         String title = scan.nextLine();
         String a = scan.nextLine();
         String b = scan.nextLine();
         String c = scan.nextLine();
         aIn = Double.parseDouble(a);
         bIn = Double.parseDouble(b);
         cIn = Double.parseDouble(c);
         Ellipsoid work = new Ellipsoid(title, aIn, bIn, cIn);
         System.out.println("\n" + work);
         array.add(work);
      }
      scan.close();
      
      //Creates EllipsoidList object and output summaryInfo
      EllipsoidList list = new EllipsoidList(name, array);
      System.out.println("\n\n" + list.summaryInfo());
   }
}
