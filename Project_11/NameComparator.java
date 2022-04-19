import java.util.Comparator;
/** 
 * Name Comparator for BallPlayers.
 * @author Shane Rivera - COMP1210 - 005
 * @version 4/13/2022
 */
 
public class NameComparator implements Comparator<BallPlayer> {
   
   /**
   * Compares the names of two ball players.
   * @param p1 - Player 1
   * @param p2 - Player 2
   * @return The name that is greater.
   */
   
   public int compare(BallPlayer p1, BallPlayer p2) {
      int space1 = p1.getName().indexOf(" ");
      int space2 = p2.getName().indexOf(" ");
      String name1 = (p1.getName().substring(space1 + 1)
                   + p1.getName().substring(0, space1)).toLowerCase();
      String name2 = (p2.getName().substring(space2 + 1)
                   + p2.getName().substring(0, space2)).toLowerCase();
                   
      return name1.compareTo(name2);
   }
 
}