 /** 
 * Class Outfielder derives from BallPlayer.
 * @author Shane Rivera - COMP1210 - 005
 * @version 4/5/2022
 */
 
public class Outfielder extends BallPlayer {

   // instance variable
   private double outfielderFieldingAvg;
   
   /**
   * Constructor.
   * @param numberIn - Player's number
   * @param nameIn - Player's name
   * @param positionIn - Player's position
   * @param salaryIn - Player's base salary
   * @param bonusIn - Player's bonus adjustment factor
   * @param battingAvgIn - Player's batting average
   * @param outfielderFieldingAvgIn - Outfielder's fielding average
   */
   public Outfielder(String numberIn, String nameIn, String positionIn,
                     double salaryIn, double bonusIn, double battingAvgIn,
                     double outfielderFieldingAvgIn) {
      super(numberIn, nameIn, positionIn, salaryIn, bonusIn, battingAvgIn);
      outfielderFieldingAvg = outfielderFieldingAvgIn;
   }
   
   /**
   * Getter for outfielder fielding avg.
   * @return outfieldingFieldingAvg
   */
   public double getOutfielderFieldingAvg() {
      return outfielderFieldingAvg;
   }
   
   /**
   * Setter for outfielder fielding avg.
   * @param avgIn - New average
   */
   public void setOutfielderFieldingAvg(double avgIn) {
      outfielderFieldingAvg = avgIn;
   }
   
   
   /**
   * Calculates totalEarnings.
   * @return total earnings
   */
   public double totalEarnings() {
      double toAdd = (salary * bonus * battingAvg * outfielderFieldingAvg);
      return salary + toAdd;
   }
   

}