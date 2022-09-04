import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** 
* Tests PersonalCloud.
*
* Activity 8
* @author Blake Moore
* @version 3/18/2020
* 
*/ 
public class PersonalCloudTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


  /** 
  * Tests.
  *
  * @param 
  * @return
  */
   @Test public void getCostFactorTest() {
      PersonalCloud d = new PersonalCloud("Name", 10, 20, 30);
      Assert.assertEquals(3, d.getCostFactor(), 0.000001);
   }
   
  /** 
  * Tests.
  *
  * @param 
  * @return
  */
   @Test public void monthlyCostTest() {
      PersonalCloud d = new PersonalCloud("Name", 10, 30, 20);
      Assert.assertEquals(40, d.monthlyCost(), 0.000001);
      d.toString();
   }
}
