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