import java.util.Scanner;
import java.util.ArrayList;

/** The program first reads integer licenseCount from input, representing the number of pairs of inputs to
 * be read. Each pair has a string and an integer, representing the license's state and fee, respectively.
 * One License object is created for each pair and added to ArrayList licenseList. Write the
 * findAverageLicenseFee() method in the Database class to return the average fee of all the License
 * objects as an integer. 
 * 
 * Ex: If the input is:
 * 4
 * OR 147 ND 120 TN 180 CA 245
 * then the output is:
 * Average license fee: 173
 * 
 * @author ZyBooks assignment
 * */

public class Database {
   private ArrayList<License> licenseList = new ArrayList<License>();

   public void inputLicenses(Scanner scnr) {
      License currLicense;
      String currState;
      int currFee;
      int licenseCount;
      int i;

      licenseCount = scnr.nextInt();
      for (i = 0; i < licenseCount; ++i) {
         currState = scnr.next();
         currFee = scnr.nextInt();
         currLicense = new License();
         currLicense.setStateAndFee(currState, currFee);
         licenseList.add(currLicense);
      }
   }

   public int findAverageLicenseFee() {
        int i;
        int averageFee = 0;
        int totalFees = 0;
        int nextFee = 0;

      for (i = 0; i < licenseList.size(); i++) {
         totalFees = nextFee.getFee() + nextFee;
         i++;
      }
      return averageFee = totalFees / i;
   }

}