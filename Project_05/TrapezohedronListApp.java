import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/** 
 * Program with main method that uses information and methods
 * from Trapezohedron.java and TrapezohedronList.java.
 * @author Shane Rivera - COMP1210 - 005
 * @version 2/17/2022
 */
 
public class TrapezohedronListApp {

   /**
   * Reads in the name of the data file entered bu the user
   * Reads list name and Trapezohedron data from the file
   * Creates Trapezohedron objects and stores them in an ArrayList
   * Creates TrapezohedronList object with its values
   * Prints the TrapezohedronList and summary information.
   * @param args Command line arguments (not used).
   * @throws FileNotFoundException - if file is not found / does not exist
   */
   public static void main(String[] args) throws FileNotFoundException {
   
      ArrayList<Trapezohedron> tList = new ArrayList<Trapezohedron>();
   
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      
      System.out.println("");
      
      Scanner scanFile = new Scanner(new File(fileName));
      String tzhListName = scanFile.nextLine(); // "tzh" = Trapezoedron
   
      while (scanFile.hasNext()) {
      
         String label = scanFile.nextLine();
         String color = scanFile.nextLine();
         double edge = Double.parseDouble(scanFile.nextLine());
      
         Trapezohedron t = new Trapezohedron(label, color, edge);
         tList.add(t);
      }
      scanFile.close();
      
      TrapezohedronList myTzhList = new TrapezohedronList(tzhListName, tList);
      
      System.out.println(myTzhList);
      
      System.out.println(myTzhList.summaryInfo());
   }
}