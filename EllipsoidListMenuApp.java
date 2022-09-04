import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
/**.
* Asks for input, and uses Ellipsoid and EllipsoidList
* to output correct items
*
* Activity 4
* @author Blake Moore
* @version 2/19/2020
* 
*/ 
public class EllipsoidListMenuApp
{
  /** 
  * Asks for input, and uses EllipsoidList 
  * and Ellipsoid class for output.
  *
  * @param args Command line arguments not used.
  * @throws FileNotFoundException throws error if no file.
  */
   public static void main(String[] args) throws FileNotFoundException
   {
      //Sets variables
      Scanner scan = new Scanner(System.in);
      String input;
      String thing = "*** no list name assigned ***";
      ArrayList<Ellipsoid> array = new ArrayList<Ellipsoid>();
      EllipsoidList ellipsoidList = new EllipsoidList(thing, array);
      //Prints options
      System.out.println("Ellipsoid List System Menu");
      System.out.println("R - Read File and Create Ellipsoid List");
      System.out.println("P - Print Ellipsoid List");
      System.out.println("S - Print Summary");
      System.out.println("A - Add Ellipsoid");
      System.out.println("D - Delete Ellipsoid");
      System.out.println("F - Find Ellipsoid");
      System.out.println("E - Edit Ellipsoid");
      System.out.println("Q - Quit");
      //Makes loop asking for input
      do
      {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         input = scan.nextLine();
         input = input.toUpperCase();
         //Outputs whatever needed based on input
         switch (input)
         {
            case "R":
               System.out.print("\tFile Name: ");
               String listName = scan.nextLine();
               ellipsoidList = ellipsoidList.readFile(listName);
               System.out.println("\tFile read in" 
                             + " and Ellipsoid List created\n");
               break;
            case "P":
               System.out.println(ellipsoidList);
               break;
            case "S":
               String summary = ellipsoidList.summaryInfo();
               System.out.println("\n" + summary + "\n");
               break;
            case "A":
               System.out.print("\tlabel: ");
               String label = scan.nextLine();
               System.out.print("\ta: ");
               String one = scan.nextLine();
               double oneIn = Double.parseDouble(one);
               System.out.print("\tb: ");
               String two = scan.nextLine();
               double twoIn = Double.parseDouble(two);
               System.out.print("\tc: ");
               String three = scan.nextLine();
               double threeIn = Double.parseDouble(three);
               ellipsoidList.addEllipsoid(label, oneIn, twoIn, threeIn);
               System.out.println("\t*** Ellipsoid added ***\n");
               break;
            case "D":
               System.out.print("\tlabel: ");
               label = scan.nextLine();
               Ellipsoid deleted = ellipsoidList.deleteEllipsoid(label);
               if (deleted == null)
               {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               else
               {
                  System.out.println("\t\"" + deleted.getLabel() 
                                    + "\" deleted\n");
               }
               break;
            case "F":
               System.out.print("\tlabel: ");
               label = scan.nextLine();
               Ellipsoid object = ellipsoidList.findEllipsoid(label);
               if (object == null)
               {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               else
               {
                  System.out.println(object + "\n");
               }
               break;
            case "E":
               System.out.print("\tlabel: ");
               String name = scan.nextLine();
               System.out.print("\ta: ");
               String a = scan.nextLine();
               double aIn = Double.parseDouble(a);
               System.out.print("\tb: ");
               String b = scan.nextLine();
               double bIn = Double.parseDouble(b);
               System.out.print("\tc: ");
               String c = scan.nextLine();
               double cIn = Double.parseDouble(c);
               Ellipsoid work = 
                        ellipsoidList.editEllipsoid(name, aIn, bIn, cIn);
               if (work == null)
               {
                  System.out.println("\t\"" + name + "\" not found\n");
               }
               else
               {
                  System.out.println("\t\"" 
                              + work.getLabel() + "\" successfully edited\n");
               }
               break;
            case "Q":
               break;
            //error trap
            default:
               System.out.println("\t*** invalid code ***\n");
         }
      } while (!input.equals("Q"));
   } 
}
