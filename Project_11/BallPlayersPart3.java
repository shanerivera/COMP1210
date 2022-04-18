import java.io.FileNotFoundException;
/** 
 * Main method of Ball Players and Team with try and catch.
 * @author Shane Rivera - COMP1210 - 005
 * @version 4/17/2022
 */
 
public class BallPlayersPart3 {

   /**
    * Main method.
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) {
      
      if (args.length == 0) {
         System.out.println("File name expected as command line argument."
                           + "\nProgram ending.");
      }
      else {
         
         String fileName = args[0];
         BallTeam team = new BallTeam();
         try {
            team.readBallPlayerFile(fileName);
            System.out.print(team.generateReport());
            System.out.println(team.generateReportByNumber());
            System.out.println(team.generateReportByName());
            System.out.println(team.generateReportByEarnings());
            System.out.println(team.generateExcludedRecordsReport());
         }
         catch (FileNotFoundException e) {
            System.out.println("*** Attempted to read file: "
                              + e + fileName);
         }
         
         
         
      }
      
   }


}