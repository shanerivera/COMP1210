import java.util.ArrayList;
import java.text.DecimalFormat;
/** 
 * Program stores the name of the list and an ArrayList
 * of Trapezohedron objects with methods to solve for various values.
 * @author Shane Rivera - COMP1210 - 005
 * @version 2/17/2022
 */
 
public class TrapezohedronList {

   // instance variables
   private String listName;
   private ArrayList<Trapezohedron> tObjs = new ArrayList<Trapezohedron>();

   // constructor
   /**
   * Trapezohedron List Constructor - takes in a String and ArrayList.
   * @param lNameIn - the list name 
   * @param tObjsIn - trapezohedron objects array
   */
   public TrapezohedronList(String lNameIn, ArrayList<Trapezohedron> tObjsIn) {
      listName = lNameIn; //lNameIn = listNameIn
      tObjs = tObjsIn;
   }

   // methods
   /**
   * Getter method for list name.
   * @return - listName
   */
   public String getName() {
      return listName;
   }
   /**
   * Calculates the number of trapezohedrons in the array list.
   * @return - numberOfObjs - number of objects
   */
   public int numberOfTrapezohedrons() {
      if (tObjs.size() == 0) {
         int numberOfObjs = 0;
         return numberOfObjs;
      }
      else {
         int numberOfObjs = tObjs.size();
         return numberOfObjs;
      }
   }
   /**
   * Calculates total surface area of all trapezohedrons in the array list.
   * @return total - total SA
   */
   public double totalSurfaceArea() {
      int index = 0;
      double total = 0.0;
      while (index < tObjs.size()) {
         Trapezohedron objs = tObjs.get(index);
         total += objs.surfaceArea();
         index++;
      }
      return total;
   }
   /**
   * Calculates total volume of all trapezohedrons in the array list.
   * @return total - total Volume
   */
   public double totalVolume() {
      int index = 0;
      double total = 0.0;
      while (index < tObjs.size()) {
         Trapezohedron objs = tObjs.get(index);
         total += objs.volume();
         index++;
      }
      return total;
   }
   /**
   * Calculates average surface area by dividing total SA by number
   * of trapezohedrons.
   * @return averageSA - average surface area
   */
   public double averageSurfaceArea() {
      double averageSA;
      if (totalVolume() == 0) {
         averageSA = 0;
      }
      else {
         averageSA = (totalSurfaceArea() / numberOfTrapezohedrons());
      }
      return averageSA;
   }
   /**
   * Calculates average volme by dividing total volume by number
   * of trapezohedrons.
   * @return averageV - average volume
   */
   public double averageVolume() {
      double averageV;
      if (totalVolume() == 0) {
         averageV = 0;
      }
      else {
         averageV = (totalVolume() / numberOfTrapezohedrons());
      }
      return averageV;
   }
   /**
   * toString method formlates output.
   * @return output - output for user to read
   */
   public String toString() {
      String output = listName + "\n";
      int index = 0;
      while (index < tObjs.size()) {
         Trapezohedron objs = tObjs.get(index);
         output += "\n";
         output += objs.toString();
         output += "\n";
         index++; 
      }
      return output;
   }
   /**
   * summary info output in form of a string that formulates previously
   * calculated result values to the user.
   * @return output - output for user to read
   */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for ";
      output += (listName + " -----");
      output += "\nNumber of Trapezohedrons: " + numberOfTrapezohedrons();
      output += "\nTotal Surface Area: " + df.format(totalSurfaceArea());
      output += " square units";
      output += "\nTotal Volume: " + df.format(totalVolume());
      output += " cubic units";
      output += "\nAverage Surface Area: " + df.format(averageSurfaceArea());
      output += " square units";
      output += "\nAverage Volume: " + df.format(averageVolume());
      output += " cubic units";
      return output;
   }
}