 /** 
 * Class ReliefPitcher derives from BallPlayer.
 * @author Shane Rivera - COMP1210 - 005
 * @version 4/5/2022
 */
 
public class ReliefPitcher extends Pitcher {

   // instance variable
   private int saves;
   
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
   * @param savesIn - Relief Pitcher's saves
   */
   public ReliefPitcher(String numberIn, String nameIn, String positionIn,
                     double salaryIn, double bonusIn, double battingAvgIn,
                     int winsIn, int lossesIn, double eraIn, int savesIn) {
      super(numberIn, nameIn, positionIn, salaryIn, bonusIn, battingAvgIn,
            winsIn, lossesIn, eraIn);
      saves = savesIn;
      
   }
   
   
   /**
   * Getter for saves.
   * @return saves
   */
   public int getSaves() {
      return saves;
   }
   
   /**
   * Setter for saves.
   * @param savesIn - New saves
   */
   public void setSaves(int savesIn) {
      saves = savesIn;
   }
   
   
   /**
   * Calculates totalEarnings.
   * @return total earnings
   */
   public double totalEarnings() {
      double toAdd = salary * bonus * (1 / (1 + era));
      toAdd *= (wins - losses + saves) / 30.0;
      return salary + toAdd;
   }
   
   /**
   * Override stats method for relief pitcher.
   * @return output - Describing relief pitcher stats
   */
   public String stats() {
      String output = wins + " wins, " + losses + " losses, ";
      output += saves + " saves, " + era + " ERA";
      return output;
   }
   
}