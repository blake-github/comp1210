import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** 
* Tests DedicatedCloud.
*
* Activity 8
* @author Blake Moore
* @version 3/18/2020
* 
*/ 
public class DedicatedCloudTest {


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
   @Test public void getServerCostTest() {
      DedicatedCloud d = new DedicatedCloud("Name", 10, 10);
      Assert.assertEquals(10, d.getServerCost(), 0.000001);
   }
   
  /** 
  * Tests.
  *
  * @param 
  * @return
  */
   @Test public void setServerCostTest() {
      DedicatedCloud d = new DedicatedCloud("Name", 10, 10);
      d.setServerCost(100);
      Assert.assertEquals(100, d.getServerCost(), 0.000001);
   }
   
  /** 
  * Tests.
  *
  * @param 
  * @return
  */
   @Test public void monthlyCostTest() {
      DedicatedCloud d = new DedicatedCloud("Name", 10, 10);
      Assert.assertEquals(20, d.monthlyCost(), 0.000001);
      d.toString();
   }
   
  /** 
  * Tests.
  *
  * @param 
  * @return
  */
   @Test public void getNameTest() {
      DedicatedCloud d = new DedicatedCloud("Name", 10, 10);
      Assert.assertEquals("Name", d.getName());
   }
   
  /** 
  * Tests.
  *
  * @param 
  * @return
  */
   @Test public void setNameTest() {
      DedicatedCloud d = new DedicatedCloud("Name", 10, 10);
      d.setName("what");
      Assert.assertEquals("what", d.getName());
   }
   
  /** 
  * Tests.
  *
  * @param 
  * @return
  */
   @Test public void setBaseStorageCostTest() {
      DedicatedCloud d = new DedicatedCloud("Name", 10, 10);
      d.setBaseStorageCost(60);
      Assert.assertEquals(60, d.getBaseStorageCost(), 0.0000001);
   }
   
  /** 
  * Tests.
  *
  * @param 
  * @return
  */
   @Test public void getCountTest() {
      DedicatedCloud d = new DedicatedCloud("Name", 10, 10);
      Assert.assertEquals(7, d.getCount());
   }
   
  /** 
  * Tests.
  *
  * @param 
  * @return
  */
   @Test public void resetCountTest() {
      DedicatedCloud d = new DedicatedCloud("Name", 10, 10);
      d.resetCount();
      Assert.assertEquals(0, d.getCount());
   }
   
}
