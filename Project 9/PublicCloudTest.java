import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** 
* Tests PublicCloud.
*
* Activity 8
* @author Blake Moore
* @version 3/18/2020
* 
*/ 
public class PublicCloudTest {


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
      PublicCloud d = new PublicCloud("Name", 10, 20, 30);
      Assert.assertEquals(2, d.getCostFactor(), 0.000001);
   }
   
  /** 
  * Tests.
  *
  * @param 
  * @return
  */
   @Test public void monthlyCostTest() {
      PublicCloud d = new PublicCloud("Name", 10, 30, 20);
      Assert.assertEquals(30, d.monthlyCost(), 0.000001);
      d.toString();
   }
}
