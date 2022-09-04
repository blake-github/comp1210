import java.text.DecimalFormat;
/** 
* Uses UserInfo class to output user information.
*
* Activity 4
* @author Blake Moore
* @version 2/4/2020
* 
*/ 
public class Ellipsoid
{
   //Instance variables
  
   /**
   *@param label used as the label
   */
   private String label = "";
   /**
   *@param a, b, c used for calculations
   */
   private double a, b, c = 0;
  
   //Constructor
  
   /**.
   * Sets variables equals to inputs.
   *
   *@param labelIn sets label
   *@param aIn sets a
   *@param bIn sets b
   *@param cIn sets c
   * 
   */
   public Ellipsoid(String labelIn, double aIn, double bIn, double cIn)
   {
      setLabel(labelIn);
      setA(aIn);
      setB(bIn);
      setC(cIn);
   }
   
   //Methods
   
  /** 
  * Outputs all the user information as strings.
  *
  * @param 
  * @return label is the label value
  */
   public String getLabel()
   {
      return label;
   }
   
  /** 
  * Outputs all the user information as strings.
  *
  * @param labelIn trimmed and used to set label
  * @return isSet outputs a boolean 
  */
   public boolean setLabel(String labelIn)
   {
      if (labelIn == null)
      {
         boolean isSet = false;
         return isSet;
      }
      else
      {
         String labelTrim = labelIn.trim();
         boolean isSet = false;
         if (labelTrim.length() > 0)
         {
            isSet = true;
            label = labelIn.trim();
         }
         return isSet;
      }
   }
   
   
  /** 
  * Outputs all the user information as strings.
  *
  * @param 
  * @return a is the a value
  */
   public double getA()
   {
      return a;
   }
   
  /**. 
  * Sets a and error traps for it to be negative
  *
  * @param aIn is set to a if it is positive
  * @return variable outputs a boolean value 
  */
   public boolean setA(double aIn)
   {
      boolean variable = false;
      if (aIn > 0)
      {
         a = aIn;
         variable = true;
      }
      return variable;
   }
   
  /** 
  * Outputs all the user information as strings.
  *
  * @param 
  * @return b is the b value
  */
   public double getB()
   {
      return b;
   }
   
   
  /**.
  * Sets b and error traps for it to be negative
  *
  * @param bIn is set to b if it is positive
  * @return variableTwo outputs a boolean value 
  */
   public boolean setB(double bIn)
   {
      boolean variableTwo = false;
      if (bIn > 0)
      {
         b = bIn;
         variableTwo = true;
      }
      return variableTwo;
   }
   
  /** 
  * Outputs all the user information as strings.
  *
  * @param 
  * @return c is the c value
  */
   public double getC()
   {
      return c;
   }
   
  /**.
  * Sets c and error traps for it to be negative
  *
  * @param cIn is set to c if it is positive
  * @return variableThree outputs a boolean value 
  */
   public boolean setC(double cIn)
   {
      boolean variableThree = false;
      if (cIn > 0)
      {
         c = cIn;
         variableThree = true;
      }
      return variableThree;
   }
   
  /** 
  * Outputs all the user information as strings.
  *
  * @param 
  * @return volume is the volume using a, b, and c
  */
   public double volume()
   {
      double volume = (4 * Math.PI * a * b * c) / 3;
      return volume;
   }
   
  /** 
  * Outputs all the user information as strings.
  *
  * @param 
  * @return surfaceArea is the surface area calculated with a, b, and c
  */
   public double surfaceArea()
   {
      double surfaceArea = (4 * Math.PI) * (Math.pow(((Math.pow(a * b, 1.6) 
                    + Math.pow(a * c, 1.6) 
                    + Math.pow(b * c, 1.6)) / 3), 1 / 1.6));
      return surfaceArea;
   }
   
  /** 
  * Outputs all the user information as strings.
  *
  * @param 
  * @return output is the output formatted
  */
   public String toString()
   {
      DecimalFormat change = new DecimalFormat("#,##0.0###");
      double surfaceArea = (4 * Math.PI) * (Math.pow(((Math.pow(a * b, 1.6) 
                        + Math.pow(a * c, 1.6) 
                        + Math.pow(b * c, 1.6)) / 3), 1 / 1.6));
      String surfaceAreaOut = change.format(surfaceArea);
      double volume = (4 * Math.PI * a * b * c) / 3;
      String volumeOut = change.format(volume);
      String output = "Ellipsoid \"" + label + "\" with axes a = " 
               + a + ", b = " + b 
               + ", c = " + c + " units has: \n\t"
               + "volume = " + volumeOut + " cubic units"
               + "\n\tsurface area = " + surfaceAreaOut + " square units";
      return output;
   }  
}
