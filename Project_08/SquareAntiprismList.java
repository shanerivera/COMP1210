import java.text.DecimalFormat;
/** 
 * Program stores the name of the list and an array of SquareAntiprism objects.
 * It also includes methods that return the name of the list, number of 
 * SquareAntiprism objects in the SquareAntiprismList, total surface area,
 * total volume, average surface area, and average volume for all 
 * SquareAntiprism objects in the SquareAntiprismList. 
 * @author Shane Rivera - COMP1210 - 005
 * @version 3/29/2022
 */
 
public class SquareAntiprismList {
   
   // instance variables
   private String name;
   private SquareAntiprism[] list;
   private int size = 0; // number of SquareAntiprism objects in array
   
   /**
   * Constructor.
   * @param nameIn - Name of array list
   * @param listIn - Array
   * @param sizeIn - Size of array
   */
   public SquareAntiprismList(String nameIn,
                              SquareAntiprism[] listIn,
                              int sizeIn) {
      name = nameIn;
      list = listIn;
      size = sizeIn;
   }
   
   // methods
   
   /**
   * Getter for name of list.
   * @return name
   */
   public String getName() {
      return name;
   }
   
   /**
   * Number of square antiprisms in array list.
   * @return size
   */
   public int numberOfSquareAntiprisms() {
      return size;
   }
   
   /**
   * Calculates total surface area.
   * @return total
   */
   public double totalSurfaceArea() {
      double total = 0;
      for (int i = 0; i < size; i++) {
         total += list[i].surfaceArea();
      }
      return total;
   }
   
   /**
   * Calculates total volume.
   * @return total
   */
   public double totalVolume() {
      double total = 0;
      for (int i = 0; i < size; i++) {
         total += list[i].volume();
      }
      return total;
   }
   
   /**
   * Calculates average surface area.
   * @return total
   */
   public double averageSurfaceArea() {
      double total = 0;
      if (size <= 0) {
         return total;
      }
      for (int i = 0; i < size; i++) {
         total += list[i].surfaceArea();
      }
      total /= size;
      return total;
   }
   
   /**
   * Calculates average volume.
   * @return total
   */
   public double averageVolume() {
      double total = 0;
      if (size <= 0) {
         return total;
      } 
      for (int i = 0; i < size; i++) {
         total += list[i].volume();
      }
      total /= size;
      return total;
   }
   
   /**
   * toString method.
   * @return out - Formatted values of previous methods
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = ""
         + "----- Summary for " + name + " -----\n"
         + "Number of SquareAntiprisms: " + size + "\n"
         + "Total Surface Area: " + df.format(totalSurfaceArea())
         + " square units\n"
         + "Total Volume: " + df.format(totalVolume()) + " cubic units\n"
         + "Average Surface Area: " + df.format(averageSurfaceArea())
         + " square units\n"
         + "Average Volume: " + df.format(averageVolume()) + " cubic units\n";
         
      return output;
   }
   
   /**
   * Getter for array list.
   * @return list
   */
   public SquareAntiprism[] getList() {
      return list;
   }
   
   /**
   * Adds a square antiprism object to array.
   * @param labelIn - New label
   * @param edgeIn - Edge value
   */
   public void addSquareAntiprism(String labelIn, double edgeIn) {
      SquareAntiprism addedSA = new SquareAntiprism(labelIn, edgeIn);
      
      list[size] = addedSA;
      size++;
   }
   
   /**
   * Finds square antiprism in array.
   * @param labelIn - Label of found square antiprism
   * @return s - The found square antiprism
   */
   public SquareAntiprism findSquareAntiprism(String labelIn) {
      for (int i = 0; i < size; i++) {
         if (list[i].getLabel().equalsIgnoreCase(labelIn)) {
            return list[i];
         }
      }
      return null;
   }
   
   /**
   * Deletes square antiprism in array.
   * @param labelIn - Label of to-be deleted square antiprism
   * @return deletedSA - The square antiprism that was deleted
   */
   public SquareAntiprism deleteSquareAntiprism(String labelIn) {
   
      for (int i = 0; i < size; i++) {
         if (list[i].getLabel().equalsIgnoreCase(labelIn)) {
            SquareAntiprism deletedSA = list[i];
            for (int j = i; j < size - 1; j++) {
               list[j] = list[j + 1];
            }
            list[size - 1] = null;
            size--;
            return deletedSA;
         }
      }
      return null;
   }
   
   /**
   * Edits a square antiprism in array.
   * @param labelIn - Label of square antiprism to be editted
   * @param edgeIn - The new edge value of the square antiprism
   * @return true -  If square antiprism exists and is editted
   */
   public boolean editSquareAntiprism(String labelIn, double edgeIn) {
      boolean result = false;
      for (int i = 0; i < size; i++) {
         if (list[i].getLabel().equalsIgnoreCase(labelIn)) {
            list[i].setEdge(edgeIn);
            result = true;
         }
      }
      return result;
   }
   
   /**
   * Finds and returns the square antiprism with the largest volume.
   * @return largestSA
   */
   public SquareAntiprism findSquareAntiprismWithLargestVolume() {
      if (size <= 0) {
         return null;
      }
      double largest = list[0].volume();
      SquareAntiprism largestSA = list[0];
      for (int i = 0; i < size; i++) {
         if (list[i].volume() > largest) {
            largestSA = new SquareAntiprism(list[i].getLabel(),
                                              list[i].getEdge());
         }
      }
      return largestSA;
   }
}