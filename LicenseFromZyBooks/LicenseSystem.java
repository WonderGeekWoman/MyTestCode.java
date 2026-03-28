import java.util.Scanner;
import java.util.ArrayList;

public class LicenseSystem {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Database database = new Database();

      database.inputLicenses(scnr);
      System.out.println("Average license fee: " + database.findAverageLicenseFee());
   }
}