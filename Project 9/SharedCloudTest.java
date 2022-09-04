import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** 
* Tests SharedCloud.
*
* Activity 8
* @author Blake Moore
* @version 3/18/2020
* 
*/ 
public class SharedCloudTest {


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
   @Test public void getDataStoredTest() {
      SharedCloud d = new SharedCloud("Name", 10, 20, 30);
      Assert.assertEquals(20, d.getDataStored(), 0.000001);
   }
   
  /** 
  * Tests.
  *
  * @param 
  * @return
  */
   @Test public void setDataStoredTest() {
      SharedCloud d = new SharedCloud("Name", 10, 20, 30);
      d.setDataStored(50);
      Assert.assertEquals(50, d.getDataStored(), 0.000001);
   }
   
  /** 
  * Tests.
  *
  * @param 
  * @return
  */
   @Test public void getDataLimitTest() {
      SharedCloud d = new SharedCloud("Name", 10, 20, 30);
      Assert.assertEquals(30, d.getDataLimit(), 0.000001);
   }
   
  /** 
  * Tests.
  *
  * @param 
  * @return
  */
   @Test public void setDataLimitTest() {
      SharedCloud d = new SharedCloud("Name", 10, 20, 30);
      d.setDataLimit(50);
      Assert.assertEquals(50, d.getDataLimit(), 0.000001);
   }
   
  /** 
  * Tests.
  *
  * @param 
  * @return
  */
   @Test public void getCostFactorTest() {
      SharedCloud d = new SharedCloud("Name", 10, 20, 30);
      Assert.assertEquals(1, d.getCostFactor(), 0.000001);
   }
   
  /** 
  * Tests.
  *
  * @param 
  * @return
  */
   @Test public void dataOverageTest() {
      SharedCloud d = new SharedCloud("Name", 10, 20, 30);
      Assert.assertEquals(0, d.dataOverage(), 0.000001);
      SharedCloud b = new SharedCloud("Name", 10, 30, 20);
      Assert.assertEquals(10, b.dataOverage(), 0.000001);
   }
   
  /** 
  * Tests.
  *
  * @param 
  * @return
  */
   @Test public void monthlyCostTest() {
      SharedCloud d = new SharedCloud("Name", 10, 20, 30);
      Assert.assertEquals(10, d.monthlyCost(), 0.000001);
      d.toString();
   }
}
