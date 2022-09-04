/** 
* Uses UserInfo class to output user information.
*
* Activity 9
* @author Blake Moore
* @version 3/30/2020
* 
*/ 
public class InvalidCategoryException extends Exception
{

//Constructor

/**.
   * Sets variables equals to inputs.
   *
   *@param categoryIn is used in super.
   * 
   */
   public InvalidCategoryException(String categoryIn)
   {
      super("For category: " + categoryIn);
   }








}
