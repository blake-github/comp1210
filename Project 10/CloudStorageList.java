import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/** 
* Uses UserInfo class to output user information.
*
* Project 10
* @author Blake Moore
* @version 4/6/2020
* 
*/ 
public class CloudStorageList
{

//Instance variables

  /**
  *@param cloudArray is an array of CloudStorage objects.
  */
   private CloudStorage[] cloudArray;

  /**
  *@param stringArray is an array of strings.
  */
   private String[] stringArray;

//Constructor

   /**.
   * Sets variables.
   *
   *@param
   * 
   */
   public CloudStorageList()
   {
      cloudArray = new CloudStorage[0];
      stringArray = new String[0];
   }
   
   //Methods
   
  /**.
  * Returns the cloudArray.
  *
  * @param 
  * @return cloudArray is the array cloud.
  */
   public CloudStorage[] getCloudStorageArray()
   {
      return cloudArray;
   }
   
  /**.
  * Outputs the listName.
  *
  * @param 
  * @return name is the name
  */
   public String[] getInvalidRecordsArray()
   {
      return stringArray;
   }
   
  /**.
  * Adds element to cloudArray.
  *
  * @param obj is the object to add.
  * @return
  */
   public void addCloudStorage(CloudStorage obj)
   {
      cloudArray = Arrays.copyOf(cloudArray, cloudArray.length + 1);
      cloudArray[cloudArray.length - 1] = obj;
   }
   
  /**.
  * Adds stuff to stringArray.
  *
  * @param obj is the object to add.
  * @return
  */
   public void addInvalidRecord(String obj)
   {
      stringArray = Arrays.copyOf(stringArray, stringArray.length + 1);
      stringArray[stringArray.length - 1] = obj;
   }
   
  /**.
  * Reads the file.
  *
  * @param name is the file name.
  * @throws FileNotFoundException for if file name is not found.
  */
   public void readFile(String name) throws FileNotFoundException
   {
      //CloudStorageList array = new CloudStorageList();
      Scanner scan = new Scanner(new File(name));
      int number = 0;
      String label = "";
      double num1In = 0;
      double num2In = 0;
      double num3In = 0;
      while (scan.hasNext())
      {
         // scan.useDelimiter(",");
         // scan.useDelimiter("\n");
         // String word = scan.next();
         // char type = word.charAt(0);
         // String label = scan.next();
         // String num1 = scan.next(word);
         // double num1In = Double.parseDouble(num1);
         String string = scan.nextLine();
         Scanner line = new Scanner(string); 
         
         switch (string.charAt(0))
         {
            case 'D':
               line.useDelimiter(",");
               String word = line.next();
               char type = word.charAt(0);
               label = line.next();
               String num1 = line.next();
               num1In = Double.parseDouble(num1);
               String num2 = line.next();
               num2In = Double.parseDouble(num2);
               DedicatedCloud d = new DedicatedCloud(label, num1In, num2In);
               this.addCloudStorage(d);
               break;
            case 'S':
               line.useDelimiter(",");
               word = line.next();
               type = word.charAt(0);
               label = line.next();
               num1 = line.next();
               num1In = Double.parseDouble(num1);
               num2 = line.next();
               num2In = Double.parseDouble(num2);
               String num3 = line.next();
               num3In = Double.parseDouble(num3);
               SharedCloud s = new SharedCloud(label, num1In, num2In, num3In);
               this.addCloudStorage(s);
               break;
            case 'C':
               line.useDelimiter(",");
               word = line.next();
               type = word.charAt(0);
               label = line.next();
               num1 = line.next();
               num1In = Double.parseDouble(num1);
               num2 = line.next();
               num2In = Double.parseDouble(num2);
               num3 = line.next();
               num3In = Double.parseDouble(num3);
               PublicCloud c = new PublicCloud(label, num1In, num2In, num3In);
               this.addCloudStorage(c);
               break;
            case 'P':
               line.useDelimiter(",");
               word = line.next();
               type = word.charAt(0);
               label = line.next();
               num1 = line.next();
               num1In = Double.parseDouble(num1);
               num2 = line.next();
               num2In = Double.parseDouble(num2);
               num3 = line.next();
               num3In = Double.parseDouble(num3);
               PersonalCloud p = new PersonalCloud(label, 
                              num1In, num2In, num3In);
               this.addCloudStorage(p);
               break;
            default:
               break;
         }
               
      }
   }
   
   
  /**.
  * Generates report.
  *
  * @param
  * @return output is the objects as strings.
  */
   public String generateReport()
   {
      //CloudStorage[] array = this.getCloudStorageArray();
      String output = "-------------------------------"
                     + "\nMonthly Cloud Storage Report"
                     + "\n-------------------------------\n";
      for (CloudStorage var : this.getCloudStorageArray())
      {
         output += var.toString() + "\n\n";
      }
      return output;
   }
   
  /**.
  * Generates report by name.
  *
  * @param
  * @return output is the objects as strings.
  */
   public String generateReportByName()
   {
      //CloudStorage[] array = this.getCloudStorageArray();
      Arrays.sort(getCloudStorageArray());
      String output = "-----------------------------------------"
                   + "\nMonthly Cloud Storage Report (by Name)"
                   + "\n-----------------------------------------\n";
      for (CloudStorage cs : this.getCloudStorageArray())
      {
         output += cs.toString() + "\n\n";
      }
      return output;
   }
   
  /**.
  * Generates report by monthly cost.
  *
  * @param
  * @return output is the objects as strings.
  */
   public String generateReportByMonthlyCost()
   {
      //CloudStorage[] array = this.getCloudStorageArray();
      Arrays.sort(getCloudStorageArray(), new MonthlyCostComparator());
      String output = "-------------------------------------------------"
                     + "\nMonthly Cloud Storage Report (by Monthly Cost)"
                     + "\n-------------------------------------------------\n";
      for (CloudStorage cs : cloudArray)
      {
         output += cs.toString() + "\n\n";
      }
      return output;
   }






}
