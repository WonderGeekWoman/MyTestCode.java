import java.util.Scanner;
import java.util.ArrayList;

public class Videos {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<Video> videoList = new ArrayList<Video>();
      Video currVideo;
      String currTopic;
		char currDiscount;
      int i;
      
      while (!scnr.hasNext("stop")) {
         currTopic = scnr.next();
         String discountString = scnr.next();
         currDiscount = discountString.charAt(0);
         
         currVideo = new Video();
         currVideo.setDetails(currTopic, currDiscount);
         videoList.add(currVideo);         
      }
      scnr.close();

      for (i = 0; i < videoList.size(); ++i) {
         currVideo = videoList.get(i);
         currVideo.print();
      }
   }
}