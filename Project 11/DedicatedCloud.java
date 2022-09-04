import java.text.DecimalFormat;
/** 
* Uses UserInfo class to output user information.
*
* Activity 9
* @author Blake Moore
* @version 3/30/2020
* 
*/ 
public class DedicatedCloud extends CloudStorage
{
//Instance Variables

  /**
  *@param serverCost is the cost.
  */
   private double serverCost;

//Constructor

   /**.
   * Sets variables equals to inputs.
   *
   *@param nameIn is set to name.
   *@param baseStorageCostIn is set to baseStorageCost.
   *@param serverCostIn is set to serverCost.
   * 
   */
   public DedicatedCloud(String nameIn, double baseStorageCostIn,
                      double serverCostIn)
   {
      super(nameIn, baseStorageCostIn);
      serverCost = serverCostIn;
   }

//Methods

  /**.
  * Outputs the listName.
  *
  * @param 
  * @return serverCost is the cost.
  */
   public double getServerCost()
   {
      return serverCost;
   }

  /**.
  * Outputs the listName.
  *
  * @param number set to serverCost.
  * @return
  */
   public void setServerCost(double number)
   {
      serverCost = number;
   }

  /**.
  * Outputs the listName.
  *
  * @param
  * @return is the monthlyCost
  */
   public double monthlyCost()
   {
      return baseStorageCost + serverCost;
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
      return super.toString() + "\nServer Cost: $" 
               + form.format(this.getServerCost());
   }



}
