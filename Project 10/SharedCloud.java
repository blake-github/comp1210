import java.text.DecimalFormat;
/** 
* Uses UserInfo class to output user information.
*
* Activity 9
* @author Blake Moore
* @version 3/30/2020
* 
*/ 
public class SharedCloud extends CloudStorage
{
//Instance Variables

  /**
  *@param dataStored is the amount of data stored.
  */
   protected double dataStored;

  /**
  *@param sdata limit is the limit to data stored.
  */
   protected double dataLimit;

  /**
  *@param COST_FACTOR is the factor.
  */
   public static final double COST_FACTOR = 1.0;

//Constructor

   /**.
   * Sets variables equals to inputs.
   *
   *@param nameIn is set to name.
   *@param baseStorageCostIn is set to baseStorageCost.
   *@param dataStoredIn is set to dataStored.
   *@param dataLimitIn is set to dataLimit.
   * 
   */
   public SharedCloud(String nameIn, double baseStorageCostIn,
                double dataStoredIn, double dataLimitIn)
   {
      super(nameIn, baseStorageCostIn);
      dataStored = dataStoredIn;
      dataLimit = dataLimitIn;
   }

//Methods

  /**.
  * Outputs the listName.
  *
  * @param 
  * @return dataStored is the number.
  */
   public double getDataStored()
   {
      return dataStored;
   }

  /**.
  * Outputs the listName.
  *
  * @param number is set to dataStored.
  * @return 
  */
   public void setDataStored(double number)
   {
      dataStored = number;
   }

  /**.
  * Outputs the listName.
  *
  * @param 
  * @return dataLimit is the number for the limit.
  */
   public double getDataLimit()
   {
      return dataLimit;
   }

  /**.
  * Outputs the listName.
  *
  * @param variable is set to dataLimit;
  * @return
  */
   public void setDataLimit(double variable)
   {
      dataLimit = variable;
   }

  /**.
  * Outputs the listName.
  *
  * @param 
  * @return COST_FACTOR is the factor.
  */
   public double getCostFactor()
   {
      return COST_FACTOR;
   }
   
  /**.
  * Outputs the listName.
  *
  * @param 
  * @return reult is the overage.
  */
   public double dataOverage()
   {
      double result = dataStored - dataLimit;
      if (result < 0)
      {
         return 0;
      }
      else
      {
         return result;
      }
   }
   
  /**.
  * Outputs the listName.
  *
  * @param 
  * @return returns the monthlyCost.
  */
   public double monthlyCost()
   {
      return (baseStorageCost + this.dataOverage() * SharedCloud.COST_FACTOR);
   }
   
  /**.
  * Outputs the listName.
  *
  * @param 
  * @return returns the info as a string.
  */
   public String toString()
   {
      DecimalFormat form = new DecimalFormat("#,###.00");
      DecimalFormat fix = new DecimalFormat("#,##0.000");
      return super.toString() + "\nData Stored: " + fix.format(dataStored) 
              + " GB\nData Limit: " + fix.format(dataLimit) + " GB\nOverage: "
              + fix.format(this.dataOverage())
              + " GB\nCost Factor: " + this.getCostFactor();
   }




}
