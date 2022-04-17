import java.io.FileNotFoundException;
/** 
 * Main program that prints out all reports for BallPlayers.
 * @author Shane Rivera - COMP1210 - 005
 * @version 4/13/2022
 */
 
public class BallPlayersPart2 {
   
   /**
   * Checks to see i command line argument exists.
   * @param args Command line arguments 
   * @throws FileNotFoundException - throws exception
   */
   
   public static void main(String[] args) throws FileNotFoundException {
      
      
      if (args.length == 0) {
         System.out.println("File name expected as command line argument."
                           + "\nProgram ending.");
      }
      else {
         
         String fileName = args[0];
         BallTeam team = new BallTeam();
         team.readBallPlayerFile(fileName);
         
         System.out.print(team.generateReport());
         System.out.println(team.generateReportByNumber());
         System.out.println(team.generateReportByName());
         System.out.println(team.generateReportByEarnings());
         System.out.println(team.generateExcludedRecordsReport());
      }
      
      
      
   }
 
}