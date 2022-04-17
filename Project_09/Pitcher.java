 /** 
 * Class Pitcher derives from BallPlayer.
 * @author Shane Rivera - COMP1210 - 005
 * @version 4/5/2022
 */
 
public class Pitcher extends BallPlayer {

   // instance variable
   protected int wins, losses;
   protected double era;
   
   /**
   * Constructor.
   * @param numberIn - Player's number
   * @param nameIn - Player's name
   * @param positionIn - Player's position
   * @param salaryIn - Player's base salary
   * @param bonusIn - Player's bonus adjustment factor
   * @param battingAvgIn - Player's batting average
   * @param winsIn - Pitcher's wins
   * @param lossesIn - Pitcher's losses
   * @param eraIn - Pitcher's era
   */
   public Pitcher(String numberIn, String nameIn, String positionIn,
                     double salaryIn, double bonusIn, double battingAvgIn,
                     int winsIn, int lossesIn, double eraIn) {
      super(numberIn, nameIn, positionIn, salaryIn, bonusIn, battingAvgIn);
      wins = winsIn;
      losses = lossesIn;
      era = eraIn;
   
   }
   
   /**
   * Getter for wins.
   * @return wins
   */
   public int getWins() {
      return wins;
   }
   
   /**
   * Setter for wins.
   * @param winsIn - New wins
   */
   public void setWins(int winsIn) {
      wins = winsIn;
   }
   
   /**
   * Getter for losses.
   * @return losses
   */
   public int getLosses() {
      return losses;
   }
   
   /**
   * Setter for losses.
   * @param lossesIn - New losses
   */
   public void setLosses(int lossesIn) {
      losses = lossesIn;
   }
   
   /**
   * Getter for era.
   * @return era
   */
   public double getEra() {
      return era;
   }
   
   /**
   * Setter for era.
   * @param eraIn - New era
   */
   public void setEra(double eraIn) {
      era = eraIn;
   }
   
   /**
   * Calculates totalEarnings.
   * @return total earnings
   */
   public double totalEarnings() {
      double toAdd = salary * bonus * (1 / (1 + era)) * (wins - losses) / 25.0;
      return salary + toAdd;
   }
   
   /**
   * Override stats method for pitcher.
   * @return output - Describing pitcher stats
   */
   public String stats() {
      String output = wins + " wins, " + losses + " losses, ";
      output += era + " ERA";
      return output;
   }
   
   
}