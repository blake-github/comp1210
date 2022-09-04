import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/** 
* Takes a listname and array of ellipsoid objects
* and outputs them all.
*
* Activity 4
* @author Blake Moore
* @version 2/19/2020
* 
*/ 
public class EllipsoidList
{
//Instance Variables

  /**
  *@param listName is the title of the objects.
  */
   private String listName = "";

   /**
   *@param ellipsoidList array of ellipsoid objects.
   */
   private ArrayList<Ellipsoid> ellipsoidList = new ArrayList<Ellipsoid>();

//Constructor

   /**.
   * Sets variables equals to inputs.
   *
   *@param listNameIn sets listName
   *@param ellipsoidListIn sets ellipsoidList
   * 
   */
   public EllipsoidList(String listNameIn, ArrayList<Ellipsoid> ellipsoidListIn)
   {
      listName = listNameIn;
      ellipsoidList = ellipsoidListIn;
   }

//Methods

  /**.
  * Outputs the listName
  *
  * @param 
  * @return listName is the listName variable
  */
   public String getName()
   {
      return listName;
   }

  /**.
  * Outputs the numbers of ellipsoid objects in the array.
  *
  * @param 
  * @return ellipsoidList.size() returns the size of ellipsoid list.
  */
   public int numberOfEllipsoids()
   {
      if (ellipsoidList.isEmpty())
      {
         return 0;
      }
      else
      {
         return ellipsoidList.size();
      }
   }

  /**.
  * Outputs the total volume of the objects.
  *
  * @param 
  * @return output is the total volume.
  */
   public double totalVolume()
   {
      if (ellipsoidList.isEmpty())
      {
         return 0;
      }
      else
      {
         double output = 0;
         int index = 0;
         while (index < ellipsoidList.size())
         {
            Ellipsoid object = ellipsoidList.get(index);
            output += object.volume();
            index++;
         }
         return output;
      }
   }

  /**.
  * Outputs the total surface area of the objects.
  *
  * @param 
  * @return output is the total surface area of the objects.
  */
   public double totalSurfaceArea()
   {
      if (ellipsoidList.isEmpty())
      {
         return 0;
      }
      else
      {
         double output = 0;
         int index = 0;
         while (index < ellipsoidList.size())
         {
            Ellipsoid object = ellipsoidList.get(index);
            output += object.surfaceArea();
            index++;
         }
         return output;
      }
   }
   
  /**.
  * Outputs the average volume of the objects
  *
  * @param 
  * @return average is the average volumes of all the objects.
  */
   public double averageVolume()
   {
      if (ellipsoidList.isEmpty())
      {
         return 0;
      }
      else
      {
         double average = 0;
         double output = 0;
         int index = 0;
         while (index < ellipsoidList.size())
         {
            Ellipsoid object = ellipsoidList.get(index);
            output += object.volume();
            average = output / ellipsoidList.size();
            index++;
         }
         return average;
      }
   }
   
  /**.
  * Outputs the average surface area of the objects.
  *
  * @param 
  * @return average is the average surface area of the objects.
  */
   public double averageSurfaceArea()
   {
      if (ellipsoidList.isEmpty())
      {
         return 0;
      }
      else
      {
         double average = 0;
         double output = 0;
         int index = 0;
         while (index < ellipsoidList.size())
         {
            Ellipsoid object = ellipsoidList.get(index);
            output += object.surfaceArea();
            average = output / ellipsoidList.size();
            index++;
         }
         return average;
      }
   }
   
  /**.
  * Outputs the ellipsoid objects.
  *
  * @param 
  * @return output is the output of the ellipsoid objects.
  */
   public String toString()
   {
      int index = 0;
      String output = listName + "\n";
      while (index < ellipsoidList.size())
      {
         Ellipsoid ellipsoid = ellipsoidList.get(index);
         output += "\n" + ellipsoid + "\n";
         index++;
      }
      return output;
   }
   
  /**.
  * Outputs all the extra information about the objetcs.
  *
  * @param 
  * @return output is all the information.
  */
   public String summaryInfo()
   {
      DecimalFormat format = new DecimalFormat("#,##0.0##");
      EllipsoidList object = new EllipsoidList(listName, ellipsoidList);
      String output = "----- Summary for " + listName + " -----";
      output += "\nNumber of Ellipsoid Objects: " + ellipsoidList.size();
      output += "\nTotal Volume: " + format.format(object.totalVolume()) 
                  + " cubic units";
      output += "\nTotal Surface Area: " 
                  + format.format(object.totalSurfaceArea()) + " square units";
      output += "\nAverage Volume: " 
                  + format.format(object.averageVolume()) + " cubic units";
      output += "\nAverage Surface Area: " 
                 + format.format(object.averageSurfaceArea()) + " square units";
      return output;
   }
   
  /**.
  * Outputs the array of ellipsoid objects.
  *
  * @param 
  * @return ellipsoidList is the array of ellipsoid objects
  */
   public ArrayList<Ellipsoid> getList()
   {
      return ellipsoidList;
   }
   
   /**.
  * Outputs ellipsoidList that was in file.
  *
  * @param name is a string used to find file
  * @return variable is the ellipsoidList read from file.
  * @throws FileNotFoundException error traps
  */
   public EllipsoidList readFile(String name) throws FileNotFoundException
   {
      Scanner scan = new Scanner(new File(name));
      String nameIn = scan.nextLine();
      ArrayList<Ellipsoid> array = new ArrayList<Ellipsoid>();
      while (scan.hasNext())
      {
         String title = scan.nextLine();
         String a = scan.nextLine();
         String b = scan.nextLine();
         String c = scan.nextLine();
         Double aIn = Double.parseDouble(a);
         Double bIn = Double.parseDouble(b);
         Double cIn = Double.parseDouble(c);
         Ellipsoid work = new Ellipsoid(title, aIn, bIn, cIn);
         array.add(work);
      }
      scan.close();
      EllipsoidList variable = new EllipsoidList(nameIn, array);
      return variable;
   }
   
  /**.
  * Outputs nothing but adds objects to ellipsoidList.
  *
  * @param label is the label
  * @param a is a value for calculations
  * @param b is a value for calculations
  * @param c is a value for calculations
  * @return 
  */
   public void addEllipsoid(String label, double a, double b, double c)
   {
      Ellipsoid object = new Ellipsoid(label, a, b, c);
      ellipsoidList.add(object);
   }
   
  /**.
  * Outputs the ellipsoid object that matches input 
  *
  * @param label is used to find matching object
  * @return is the objects that matches
  */
   public Ellipsoid findEllipsoid(String label)
   {
      label = label;
      if (label == "")
      {
         return null;
      }
      else
      {
         int place = -1;
         for (Ellipsoid e : ellipsoidList)
         {
            if (e.getLabel().trim().toLowerCase()
                .contains(label.trim().toLowerCase()))
            {
               place = ellipsoidList.indexOf(e);
               break;
            }
         }
         if (place == -1)
         {
            return null;
         }
         else
         {
            return ellipsoidList.get(place);
         }
      }
   }
   
  /**.
  * Outputs the deleted object and removes it from the list.
  *
  * @param label used to find the matching object to delete
  * @return find is the ellipsoid that was deleted
  */
   public Ellipsoid deleteEllipsoid(String label)
   {
      EllipsoidList variable = new EllipsoidList(listName, ellipsoidList);
      Ellipsoid find = variable.findEllipsoid(label);
      ellipsoidList.remove(find);
      if (find == null)
      {
         return null;
      }
      else
      {
         return find; 
      }
   }
   
  /**.
  * Outputs the editted object
  *
  * @param label used for matching
  * @param a is a value for calculations
  * @param b is a value for calculations
  * @param c is a value for calculations
  * @return replace is the new object.
  */
   public Ellipsoid editEllipsoid(String label, double a, double b, double c)
   {
      label = label.trim();
      if (label == "")
      {
         return null;
      }
      else
      {
         EllipsoidList variable = new EllipsoidList(listName, ellipsoidList);
         Ellipsoid find = variable.findEllipsoid(label);
         if (find == null)
         {
            return null;
         }
         else
         {
            int place = ellipsoidList.indexOf(find);
            //Ellipsoid object = new Ellipsoid(find.getLabel(), a, b, c);
            //Ellipsoid replace = ellipsoidList.set(place, object);
            Boolean replace = find.setA(a);
            replace = find.setB(b);
            replace = find.setC(c);
            return find;
         }
      }
   }

}
