import java.text.DecimalFormat;
/** 
* Uses UserInfo class to output user information.
*
* Project 10
* @author Blake Moore
* @version 4/6/2020
* 
*/ 
public abstract class CloudStorage implements Comparable<CloudStorage>
{

//Instance varibales

  /**
  *@param name is the name.
  */
   protected String name;

/**
  *@param baseStorageCost.
  */
   protected double baseStorageCost;

/**
  *@param count is the number of objects made.
  */
   protected static int count = 0;

//Constructor

   /**.
   * Sets variables equals to inputs.
   *
   *@param nameIn is set to name.
   *@param baseStorageCostIn is set to baseStorageCost.
   * 
   */
   public CloudStorage(String nameIn, double baseStorageCostIn)
   {
      name = nameIn;
      baseStorageCost = baseStorageCostIn;
      count++;
   }

//Methods

  /**.
  * Outputs the listName.
  *
  * @param 
  * @return name is the name
  */
   public String getName()
   {
      return name;
   }

  /**.
  * Outputs the listName.
  *
  * @param word is set to name.
  * @return
  */
   public void setName(String word)
   {
      name = word;
   }

  /**.
  * Outputs the listName.
  *
  * @param 
  * @return baseStorageCost is the cost.
  */
   public double getBaseStorageCost()
   {
      return baseStorageCost;
   }
   
  /**.
  * Outputs the listName.
  *
  * @param number is set to the cost
  * @return
  */
   public void setBaseStorageCost(double number)
   {
      baseStorageCost = number;
   }
   
  /**.
  * Outputs the listName.
  *
  * @param 
  * @return count is number of objects
  */
   public static int getCount()
   {
      return count;
   }
   
  /**.
  * Outputs the listName.
  *
  * @param 
  * @return 
  */
   public static void resetCount()
   {
      count = 0; 
   }
   
  /**.
  * Outputs the listName.
  *
  * @param 
  * @return returns the string of info
  */
   public String toString()
   {
      DecimalFormat form = new DecimalFormat("#,###.00");
      return name + " (" + this.getClass() + ") Monthly Cost: $"
                   + form.format(this.monthlyCost()) + "\nBase Storage Cost: $" 
                   + form.format(this.getBaseStorageCost());
   }
   
  /**.
  * Compares.
  *
  * @param obj is the object to compare.
  * @return output tells how they compare.
  */
   public int compareTo(CloudStorage obj)
   {
      return this.getName().toLowerCase().
                compareTo(obj.getName().toLowerCase());
   }
   
  /**.
  * Outputs the listName.
  *
  * @param 
  * @return returns something.
  */
   public abstract double monthlyCost();



}
