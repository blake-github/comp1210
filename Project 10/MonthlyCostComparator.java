/** 
* Uses UserInfo class to output user information.
*
* Project 10
* @author Blake Moore
* @version 4/6/2020
* 
*/ 
public class MonthlyCostComparator implements java.util.Comparator<CloudStorage>
{


//Constructor

   /**.
   * Doesn't really do anything.
   *
   *@param
   * 
   */
   public MonthlyCostComparator()
   {
   
   }

//Method

  /**.
  * Compares.
  *
  * @param c1 is compared against c2.
  * @param c2 is compared with c1.
  * @return returns how they compare.
  */
   public int compare(CloudStorage c1, CloudStorage c2)
   {
      if (c1.monthlyCost() < c2.monthlyCost())
      {
         return 1;
      }
      else if (c1.monthlyCost() == c2.monthlyCost())
      {
         return 0;
      }
      else
      {
         return -1;
      }
   }









}
