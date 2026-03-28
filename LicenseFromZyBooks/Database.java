import java.util.Scanner;
import java.util.ArrayList;

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
      for (i = 0; i < licenseList.size(); i++) {
         int totalFees = currFee.getFee() + currFee;
         i++;
      }
      return averageFee = totalFees / i;
   }

}