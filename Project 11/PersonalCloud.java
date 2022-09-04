/** 
* Uses UserInfo class to output user information.
*
* Activity 9
* @author Blake Moore
* @version 3/30/2020
* 
*/ 
public class PersonalCloud extends SharedCloud
{
  /**
  *@param serverCost is the cost.
  */
   public static final double COST_FACTOR = 3.0;

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
   public PersonalCloud(String nameIn, double baseStorageCostIn, 
                      double dataLimitIn, double dataStoredIn)
   {
      super(nameIn, baseStorageCostIn, dataLimitIn, dataStoredIn);
   }

//Methods

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
  * @return returns the monthlyCost.
  */
   public double monthlyCost()
   {
      return (baseStorageCost + this.dataOverage() * PersonalCloud.COST_FACTOR);
   }




}
