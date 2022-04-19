import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Arrays;
import java.text.DecimalFormat;

/** 
 * Provides methods for reading in the data file
 * and generating reports.
 * @author Shane Rivera - COMP1210 - 005
 * @version 4/13/2022
 */
 
 
public class BallTeam {
     
   // instance fields
   private String teamName;
   private BallPlayer[] roster = new BallPlayer[24];
   private int playerCount;
   private String[] excludedRecords = new String[30];
   private int excludedCount;
   /** Max players constant. **/
   public static final int MAX_PLAYERS = 24;
   /** Max excluded players constant. **/
   public static final int MAX_EXCLUDED = 30;
     
  /**
  * Constructor.
  */
   public BallTeam() {
      teamName = null;
      playerCount = 0;
      excludedCount = 0;
    
   }
   
   
   /**
   * Getter for team name.
   * @return teamName
   */
   public String getTeamName() {
      return teamName;
   }
   
   /**
   * Setter for team name.
   * @param teamNameIn - new
   */
   public void setTeamName(String teamNameIn) {
      teamName = teamNameIn;
   }
   
   /**
   * Getter for roster.
   * @return roster
   */
   public BallPlayer[] getRoster() {
      return roster;
   }
   
   /**
   * Setter for roster.
   * @param rosterIn - new
   */
   public void setRoster(BallPlayer[] rosterIn) {
      roster = rosterIn;
   }
   
   /**
   * Getter for player count.
   * @return playerCount
   */
   public int getPlayerCount() {
      return playerCount;
   }
   
   /**
   * Setter for player count.
   * @param countIn - new
   */
   public void setPlayerCount(int countIn) {
      playerCount = countIn;
   }
   
   /**
   * Getter for excluded records.
   * @return excludedRecords
   */
   public String[] getExcludedRecords() {
      return excludedRecords;
   }  
   
   /**
   * Setter for excludedRecords.
   * @param excludedRecordsIn - new
   */
   public void setExcludedRecords(String[] excludedRecordsIn) {
      excludedRecords = excludedRecordsIn;
   }
   
   /**
   * Getter for excludedCount.
   * @return excludedCount
   */
   public int getExcludedCount() {
      return excludedCount;
   }
   
   /**
   * Setter for excludedCount.
   * @param excludedCountIn - new
   */
   public void setExcludedCount(int excludedCountIn) {
      excludedCount = excludedCountIn;
   }
   
   /**
   * Reads file name and creates players and puts them into
   * roster and excludedCount arrays as needed.
   * @param fileIn - File name
   * @throws FileNotFoundException - throws exception
   */
   public void readBallPlayerFile(String fileIn) throws FileNotFoundException {
   
      Scanner fileScan = new Scanner(new File(fileIn.trim()));
      
      setTeamName(fileScan.nextLine().trim());
      String newLine;
      
      while (fileScan.hasNext()) {
         
         
         newLine = fileScan.nextLine();
         Scanner line = new Scanner(newLine);
         line.useDelimiter(",");
         
         char position = line.next().charAt(0);
         BallPlayer player;
            
         try {
         
            switch (position) {
            
               case 'O': // Outfielder
                  player = new Outfielder(line.next(), line.next(),
                                 line.next(), Double.parseDouble(line.next()),
                                 Double.parseDouble(line.next()),
                                Double.parseDouble(line.next()),
                                Double.parseDouble(line.next()));
                  break;
            
               case 'I': // Infielder 
                  player = new Infielder(line.next(), line.next(),
                                 line.next(), Double.parseDouble(line.next()),
                                 Double.parseDouble(line.next()),
                                 Double.parseDouble(line.next()),
                                 Double.parseDouble(line.next()));
                  break;
               case 'P': // Pitcher
                  player = new Pitcher(line.next(), line.next(),
                                 line.next(), Double.parseDouble(line.next()),
                                 Double.parseDouble(line.next()),
                                 Double.parseDouble(line.next()),
                                 Integer.parseInt(line.next()),
                                 Integer.parseInt(line.next()),
                                 Double.parseDouble(line.next()));
                  break;
               case 'R': // ReliefPitcher
                  player = new ReliefPitcher(line.next(), line.next(),
                                 line.next(), Double.parseDouble(line.next()),
                                 Double.parseDouble(line.next()),
                                 Double.parseDouble(line.next()),
                                 Integer.parseInt(line.next()),
                                 Integer.parseInt(line.next()),
                                 Double.parseDouble(line.next()),
                                 Integer.parseInt(line.next()));
                  break;
            
               default:
                  String p = Character.toString(position);
                  throw new InvalidCategoryException(p);
            
            }
         
         
            if (playerCount < MAX_PLAYERS) {
               roster[playerCount] = player;
               playerCount++;
            }
            else if (excludedCount < MAX_EXCLUDED) {
               excludedRecords[excludedCount] = newLine;
               excludedCount++;
            }
         
         }
         
         catch (InvalidCategoryException e) {
            String obj = e + " in: " + newLine;
            if (excludedCount < MAX_EXCLUDED) {
               excludedRecords[excludedCount] = obj;
               excludedCount++;
            }
         }
         catch (NumberFormatException e) {
            String obj = e + " in: " + newLine;
            if (excludedCount < MAX_EXCLUDED) {
               excludedRecords[excludedCount] = obj;
               excludedCount++;
            }
         }
         catch (NoSuchElementException e) {
            String obj = e + " in: " + newLine;
            if (excludedCount < MAX_EXCLUDED) {
               excludedRecords[excludedCount] = obj;
               excludedCount++;
            }
         }
      }
   }
   
   
   /**
   * Generates report of players.
   * @return report
   */
   public String generateReport() {
      String report = ""
         + "---------------------------------------\n"
         + "Team Report for " + teamName + "\n"
         + "---------------------------------------\n\n";
      for (BallPlayer player : roster) {
         if (player != null) {
            report += player + "\n\n";
         }
      }
      return report;
   }
   
   /**
   * Generates report in number order.
   * @return report
   */
   public String generateReportByNumber() {
      BallPlayer[] bp = Arrays.copyOf(roster, playerCount);
      Arrays.sort(bp);
      
      String report = ""
         + "---------------------------------------\n"
         + "Team Report for " + teamName + " (by Number)\n"
         + "---------------------------------------\n";
      
      for (BallPlayer player : bp) {
         if (player != null) {
            report += ""
                 + player.getNumber() + " " + player.getName()
                 + " " + player.getPosition() + " " + player.stats() + "\n";
         }
      }
      return report;
   }
   
   /**
   * Generates report in name alphabetical order.
   * @return report
   */
   public String generateReportByName() {
      BallPlayer[] bp = Arrays.copyOf(roster, playerCount);
      Arrays.sort(bp, new NameComparator());
      
      String report = ""
         + "---------------------------------------\n"
         + "Team Report for " + teamName + " (by Name)\n"
         + "---------------------------------------\n";
      
      for (BallPlayer player : bp) {
         if (player != null) {
            report += player.getNumber() + " " + player.getName()
                 + " " + player.getPosition() + " " + player.stats() + "\n";
         }
      }
      return report;
   }
   
   /**
   * Generates report in total earnings order.
   * @return report
   */
   public String generateReportByEarnings() {
      BallPlayer[] bp = Arrays.copyOf(roster, playerCount);
      Arrays.sort(bp, new EarningsComparator());
      DecimalFormat df = new DecimalFormat("$###,###.00");
      
      String report = ""
         + "---------------------------------------\n"
         + "Team Report for " + teamName + " (by Earnings)\n"
         + "---------------------------------------\n";
      
      for (BallPlayer player : bp) {
         if (player != null) {
            report += df.format(player.totalEarnings()) + " "
                 + player.getNumber() + " " + player.getName()
                 + " " + player.getPosition() + " " + player.stats() + "\n";
         }
      }
      return report;
   }
   
   /**
   * Generates excluded records report.
   * @return report
   */
   public String generateExcludedRecordsReport() {
      String report = ""
         + "---------------------------------------\n"
         + "Excluded Records Report\n"
         + "---------------------------------------\n";
      for (String excluded : excludedRecords) {
         if (excluded != null) {
            report += excluded + "\n";
         }
      }
      return report;
   }
   
     
     
}