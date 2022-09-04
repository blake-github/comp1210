import java.util.Scanner;
import java.io.FileNotFoundException;
/** 
* Uses UserInfo class to output user information.
*
* Project 10
* @author Blake Moore
* @version 4/6/2020
* 
*/ 
public class CloudStoragePart2 
{
  /** 
  * This does many things.
  *
  * @param args Command line arguments used for file name.
  * @throws FileNotFoundException throws error if no file.
  */
   public static void main(String[] args) throws FileNotFoundException
   {
   //Variables
      Scanner scan = new Scanner(System.in);
      //Error traps
      if (args.length == 0)
      {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
      //Prints everything
      else
      {
         String input = args[0];
         CloudStorageList list = new CloudStorageList();
         list.readFile(input);
         System.out.println(list.generateReport().trim());
         System.out.println("\n" + list.generateReportByName().trim());
         System.out.println("\n" + list.generateReportByMonthlyCost());
      }
   }









}
