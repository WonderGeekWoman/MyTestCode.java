public class License {
   private String state;
   private int fee;

   public void setStateAndFee(String newState, int newFee) {
      state = newState;
      fee = newFee;
   }

	public int getFee() {
		return fee;
	}
}