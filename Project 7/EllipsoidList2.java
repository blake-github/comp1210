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
public class EllipsoidList2
{
//Instance Variables

  /**
  *@param listName is the title of the objects.
  */
   private String listName = "";

   /**
   *@param ellipsoidList array of ellipsoid objects.
   */
   private Ellipsoid[] ellipsoidList;
   
   /**
   *@param ellipsoidList array of ellipsoid objects.
   */
   private int length = 0;

//Constructor

   /**.
   * Sets variables equals to inputs.
   *
   *@param listNameIn sets listName
   *@param ellipsoidListIn sets ellipsoidList
   *@param lengthIn is the length of the array
   * 
   */
   public EllipsoidList2(String listNameIn, 
            Ellipsoid[] ellipsoidListIn, int lengthIn)
   {
      listName = listNameIn;
      ellipsoidList = ellipsoidListIn;
      length = lengthIn;
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
      return length;
   }

  /**.
  * Outputs the total volume of the objects.
  *
  * @param 
  * @return output is the total volume.
  */
   public double totalVolume()
   {
      if (length == 0)
      {
         return 0;
      }
      else
      {
         double output = 0;
         int index = 0;
         while (index < length)
         {
            Ellipsoid object = ellipsoidList[index];
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
      if (length == 0)
      {
         return 0;
      }
      else
      {
         double output = 0;
         int index = 0;
         while (index < length)
         {
            Ellipsoid object = ellipsoidList[index];
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
      if (length == 0)
      {
         return 0;
      }
      else
      {
         double average = 0;
         double output = 0;
         int index = 0;
         while (index < length)
         {
            Ellipsoid object = ellipsoidList[index];
            output += object.volume();
            average = output / length;
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
      if (length == 0)
      {
         return 0;
      }
      else
      {
         double average = 0;
         double output = 0;
         int index = 0;
         while (index < length)
         {
            Ellipsoid object = ellipsoidList[index];
            output += object.surfaceArea();
            average = output / length;
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
      while (index < length)
      {
         Ellipsoid ellipsoid = ellipsoidList[index];
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
      DecimalFormat format = 
                      new DecimalFormat("#,##0.0##");
      EllipsoidList2 object = 
               new EllipsoidList2(listName, ellipsoidList, length);
      String output = "----- Summary for " + listName + " -----";
      output += "\nNumber of Ellipsoid Objects: " + length;
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
   public Ellipsoid[] getList()
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
   public EllipsoidList2 readFile(String name) throws FileNotFoundException
   {
      Scanner scan = new Scanner(new File(name));
      String nameIn = scan.nextLine();
      int number = 0; 
      Ellipsoid[] array = new Ellipsoid[100];
      
      while (scan.hasNext())
      {
         String title = scan.nextLine();
         String a = scan.nextLine();
         String b = scan.nextLine();
         String c = scan.nextLine();
         Double aIn = Double.parseDouble(a);
         Double bIn = Double.parseDouble(b);
         Double cIn = Double.parseDouble(c);
         Ellipsoid e = new Ellipsoid(title, aIn, bIn, cIn);
         array[number] = e;
         number++;
      }
      scan.close();
      EllipsoidList2 variable = new EllipsoidList2(nameIn, array, number);
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
      ellipsoidList[length] = object;
      length++;
   }
   
  /**.
  * Outputs the ellipsoid object that matches input 
  *
  * @param nameIn is used to find matching object
  * @return is the objects that matches
  */
   public Ellipsoid findEllipsoid(String nameIn)
   {
      String name = nameIn;
      if (name == "")
      {
         return null;
      }
      else
      {
         int place = -1;
         for (int i = 0; i < length; i++)
         {
            if (ellipsoidList[i].getLabel().trim().toLowerCase()
                .contains(name.trim().toLowerCase()))
            {
               place = i;
               break;
            }
         }
         if (place == -1)
         {
            return null;
         }
         else
         {
            return ellipsoidList[place];
         }
      }
   }
   
  /**.
  * Outputs the deleted object and removes it from the list.
  *
  * @param nameIn used to find the matching object to delete
  * @return find is the ellipsoid that was deleted
  */
   public Ellipsoid deleteEllipsoid(String nameIn)
   {
      EllipsoidList2 variable = 
                  new EllipsoidList2(listName, ellipsoidList, length);
      String name = nameIn.trim().toLowerCase();
      Ellipsoid find = variable.findEllipsoid(name);
      for (int i = 0; i < length; i++)
      {
         if (find == ellipsoidList[i])
         {
            for (int j = i; j < length - 1; j++) 
            {
               ellipsoidList[j] = ellipsoidList[j + 1];
            }
            ellipsoidList[length - 1] = null;
            length--;
            break;
         }
      }
      return find;
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
         EllipsoidList2 variable = 
                     new EllipsoidList2(listName, ellipsoidList, length);
         Ellipsoid find = variable.findEllipsoid(label);
         if (find == null)
         {
            return null;
         }
         else
         {
            //Ellipsoid object = new Ellipsoid(find.getLabel(), a, b, c);
            //Ellipsoid replace = ellipsoidList.set(place, object);
            Boolean replace = find.setA(a);
            replace = find.setB(b);
            replace = find.setC(c);
            return find;
         }
      }
   }

  /**.
  * Outputs the ellipsoid with the smallest volume.
  *
  * @param
  * @return output is the ellipsoid with smallest Volume.
  */
   public Ellipsoid findEllipsoidWithSmallestVolume()
   {
      Ellipsoid output = null;
      for (int i = 0; i < length; i++)
      {
         Ellipsoid volume = ellipsoidList[i];
         Ellipsoid compare = ellipsoidList[i + 1];
         if (volume.volume() < compare.volume())
         {
            output = volume;
            break;
         }
      }
      return output;
   }
   
  /**.
  * Outputs the ellipsoid with the largest volume.
  *
  * @param
  * @return output is the ellipsoid with largest Volume.
  */
   public Ellipsoid findEllipsoidWithLargestVolume()
   {
      Ellipsoid output = null;
      for (int i = 1; i < length; i++)
      {
         Ellipsoid volume = ellipsoidList[i];
         Ellipsoid compare = ellipsoidList[i - 1];
         if (volume.volume() < compare.volume())
         {
            output = null;
         }
         else
         {
            output = volume;
         }
      }
      return output;
   }
   
  /**.
  * Outputs the ellipsoid with the smallest surface area.
  *
  * @param
  * @return output is the ellipsoid with smallest surface area.
  */
   public Ellipsoid findEllipsoidWithSmallestSurfaceArea()
   {
      Ellipsoid output = null;
      for (int i = 0; i < length; i++)
      {
         Ellipsoid volume = ellipsoidList[i];
         Ellipsoid compare = ellipsoidList[i + 1];
         if (volume.surfaceArea() < compare.surfaceArea())
         {
            output = volume;
            break;
         }
      }
      return output;
   }
   
  /**.
  * Outputs the ellipsoid with the largest surface area.
  *
  * @param
  * @return output is the ellipsoid with largest surface area.
  */
   public Ellipsoid findEllipsoidWithLargestSurfaceArea()
   {
      Ellipsoid output = null;
      for (int i = 1; i < length; i++)
      {
         Ellipsoid volume = ellipsoidList[i];
         Ellipsoid compare = ellipsoidList[i - 1];
         if (volume.surfaceArea() < compare.surfaceArea())
         {
            output = null;
         }
         else
         {
            output = volume;
         }
      }
      return output;
   }
}
