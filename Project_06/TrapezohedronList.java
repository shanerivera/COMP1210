import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
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
      System.out.println("");
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
      System.out.println("");
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
   
   // new added code for project 6 below:
   
   /**
    * Getter for array list of trapezohedron objects.
    * @return tObjs
    */
   public ArrayList<Trapezohedron> getList() {
      return tObjs;
   }
   /**
    * Reads file and creates trapezohedron objects and puts them in a list.
    * @param fileNameIn - The file name to open
    * @throws FileNotFoundException - if file is not found / does not exist
    * @return tL - The TrapezohedronList read in from the file
    */
   public TrapezohedronList readFile(String fileNameIn) 
                           throws FileNotFoundException {
                           
      Scanner scanFile = new Scanner(new File(fileNameIn));
      String fileListName = scanFile.nextLine();
      ArrayList<Trapezohedron> tList = new ArrayList<Trapezohedron>();
      
      while (scanFile.hasNext()) {
      
         String label = scanFile.nextLine();
         String color = scanFile.nextLine();
         double edge = Double.parseDouble(scanFile.nextLine());
      
         Trapezohedron t = new Trapezohedron(label, color, edge);
         tList.add(t);
      }
      
      TrapezohedronList tL = new TrapezohedronList(fileListName, tList);
      
      return tL;
   }
   /**
    * Adds a new trapezohedron to the list.
    * @param labelIn - Label of new trapezohedron
    * @param colorIn - Color of new trapezohedron
    * @param edgIn - Edge of new trapezohedron
    */
   public void addTrapezohedron(String labelIn, String colorIn, double edgIn) {
     
      Trapezohedron t = new Trapezohedron(labelIn, colorIn, edgIn);
      tObjs.add(t);
   }
    /**
    * Finds trapezohedron indicated by the label.
    * @param labelIn - Label of a trapezohedron
    * @return t - If label exists method returns the trapezohedron
    */
   public Trapezohedron findTrapezohedron(String labelIn) {
      for (Trapezohedron t : tObjs) {
         if (t.getLabel().equalsIgnoreCase(labelIn)) { 
            return t;
         }
      }
      return null;
   }
   /**
   * Deletes trapezohedron indicated by label.
   * @param delLabel - The label of the trapezohedron to be deleted
   * @return true - If there label exists and the trapezohedron is deleted
   */
   public Trapezohedron deleteTrapezohedron(String delLabel) {
      int index = -1;
      for (Trapezohedron t : tObjs) {
         if (t.getLabel().equalsIgnoreCase(delLabel)) { 
            index = tObjs.indexOf(t);
         }
         if (index >= 0) {
            tObjs.remove(index);
            return t;
         }
      }
      return null;
   }

   /**
   * Edits trapzohedron only by color and edge.
   * @param labelIn - Edits indicated trapezohedron by label
   * @param colorIn - If label is found the color is changed to this value
   * @param edgeIn - If label is found the edge is changed to this value
   * @return t - If label is found the edited trapezohedron is returned
   */
   public boolean editTrapezohedron(String labelIn,
                                    String colorIn, double edgeIn) {
      boolean result = false;
      for (Trapezohedron t : tObjs) {
         if (t.getLabel().equalsIgnoreCase(labelIn)) {
            t.setColor(colorIn);
            t.setShortEdge(edgeIn);
            result = true;
         }
      }
      return result;
   }
}
