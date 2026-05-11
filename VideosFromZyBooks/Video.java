public class Video {
   private String topic;
   private char discount;
   private float six = 6;

	public void setDetails(String newTopic, char newDiscount) {
		topic = newTopic;
		discount = newDiscount;
	}

   public void print() {
      System.out.println("Video: " + topic + ", Discount: " + discount);
   }
}