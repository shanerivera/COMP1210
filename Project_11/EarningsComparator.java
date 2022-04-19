import java.util.Comparator;
/** 
 * Earnings Comparator for BallPlayer.
 * @author Shane Rivera - COMP1210 - 005
 * @version 4/13/2022
 */
 
public class EarningsComparator implements Comparator<BallPlayer> {
   
   /**
   * Compares the earnings of two ball players.
   * @param p1 - Player 1
   * @param p2 - Player 2
   * @return The total earnings that are greater.
   */
   
   public int compare(BallPlayer p1, BallPlayer p2) {
      double earnings1 = p1.totalEarnings();
      double earnings2 = p2.totalEarnings();
      
      if (earnings1 == earnings2) {
         return 0;
      }
      else if (earnings1 > earnings2) {
         return -1;
      }
      else {
         return 1;
      }
   }
 
}