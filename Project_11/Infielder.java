 /** 
 * Class Infielder derives from BallPlayer.
 * @author Shane Rivera - COMP1210 - 005
 * @version 4/5/2022
 */
 
public class Infielder extends BallPlayer {

   // instance variable
   private double infielderFieldingAvg;
   
   /**
   * Constructor.
   * @param numberIn - Player's number
   * @param nameIn - Player's name
   * @param positionIn - Player's position
   * @param salaryIn - Player's base salary
   * @param bonusIn - Player's bonus adjustment factor
   * @param battingAvgIn - Player's batting average
   * @param infielderFieldingAvgIn - Infielder's fielding average
   */
   public Infielder(String numberIn, String nameIn, String positionIn,
                     double salaryIn, double bonusIn, double battingAvgIn,
                     double infielderFieldingAvgIn) {
      super(numberIn, nameIn, positionIn, salaryIn, bonusIn, battingAvgIn);
      infielderFieldingAvg = infielderFieldingAvgIn;
   }
   
   /**
   * Getter for infielder fielding avg.
   * @return infieldingFieldingAvg
   */
   public double getInfielderFieldingAvg() {
      return infielderFieldingAvg;
   }
   
   /**
   * Setter for infielder fielding avg.
   * @param avgIn - New average
   */
   public void setInfielderFieldingAvg(double avgIn) {
      infielderFieldingAvg = avgIn;
   }
   
   
   /**
   * Calculates totalEarnings.
   * @return total earnings
   */
   public double totalEarnings() {
      double toAdd = (salary * bonus * battingAvg * infielderFieldingAvg);
      return salary + toAdd;
   }
   
}