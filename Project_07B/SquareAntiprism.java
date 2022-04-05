import java.text.DecimalFormat;
/** 
 * SquareAntiprism program that stores label and edge.
 * Program also includes methods to set and get both label and edge,
 * as well as methods to calculate the height, surface area, and volume
 * of a SquareAntiprism object, and a method to provide a String value
 * that describes a SquareAntiprism object.
 * @author Shane Rivera - COMP1210 - 005
 * @version 3/23/2022
 */
 
 
 // Copied and edited program which adds compareTo method.
 
public class SquareAntiprism implements Comparable<SquareAntiprism> {

   // instance variables
   private String label = "";
   private double edge = 0;
   private static int count = 0;
   
   /**
    * Contructor.
    * @param labelIn - Label for square antiprism
    * @param edgeIn - Edge size
    */
   public SquareAntiprism(String labelIn, double edgeIn) {
      setLabel(labelIn);
      setEdge(edgeIn);
      count++;
   }
   
   //methods
   /**
   * Getter for label.
   * @return label - Returns label
   */
   public String getLabel() {
      return label;
   }
   
   /**
   * Setter for label if it exists.
   * @param labelIn - New label
   * @return true - If label exists
   */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      return false;
   }
   
   /**
   * Getter for edge.
   * @return edge - Returns edge
   */
   public double getEdge() {
      return edge;
   }
   
   /**
   * Setter for edge if it is greater than 0.
   * @param edgeIn - New edge
   * @return true - If edge is a positive number
   */
   public boolean setEdge(double edgeIn) {
      if (edgeIn >= 0) {
         edge = edgeIn;
         return true;
      }
      return false;
   }
   
   /**
   * Calculates height of square antiprism.
   * @return height
   */
   public double height() {
      double height = Math.sqrt(1 - ((Math.pow(1 / Math.cos(Math.PI / 16), 2)
                     / 4))) * edge;
      return height;
   }
   
   /**
   * Calculates surface area.
   * @return surfaceArea
   */
   public double surfaceArea() {
      double surfaceArea = 4 * ((Math.cos(Math.PI / 8) / Math.sin(Math.PI / 8))
                  + Math.sqrt(3)) * Math.pow(edge, 2);
      return surfaceArea;
   }

   /**
   * Calculates volume.
   * @return volume
   */
   public double volume() {
      double volume = 8 * Math.sqrt(4 * Math.pow(Math.cos(Math.PI / 16), 2) - 1)
                     * Math.sin((3 * Math.PI) / 16) * Math.pow(edge, 3)
                     / (12 * Math.pow(Math.sin(Math.PI / 8), 2));
      return volume;
   }
   
   /**
   * toString method returns calculated height, surface area,
   * and volume as a String.
   * @return output
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "SquareAntiprism \"" + getLabel() + "\" with edge of "
            + getEdge() + " units has:\n"
            + "\theight = " + df.format(height()) + " units\n"
            + "\tsurface area = " + df.format(surfaceArea()) + " square units\n"
            + "\tvolume = " + df.format(volume()) + " cubic units";      
      return output;
   }
   
   /**
   * Getter for the count of objects created.
   * @return count
   */
   public static int getCount() {
      return count;
   }
   
   /**
   * Resets count of objects created to 0.
   */
   public static void resetCount() {
      count = 0;
   }
   
   /**
   * Instance method checks to see if an object is a SquareAntiprism.
   * @param obj - Possible square antiprism object
   * @return false  If parameter is not a square antiprism
   */
   public boolean equals(Object obj) {
      if (!(obj instanceof SquareAntiprism)) {
         return false;
      }
      else {
         SquareAntiprism d = (SquareAntiprism) obj;
         return (label.equalsIgnoreCase(d.getLabel()) 
                  && (Math.abs(edge - d.getEdge()) < .000001)); 
      }
   }
   
   /**
   * Required by checkstyle for equals method above.
   * @return x - Which is 0
   */
   public int hashCode() {
      int x = 0;
      return x;
   }
   
   /**
   * Compare to method.
   * @param obj - A square antiprism object that "this" is being compared to.
   * @return 0 - If the objects are equal in volume
   * Positive if greater than the parameter's volume and negative if less
   */
   public int compareTo(SquareAntiprism obj) {
      if (Math.abs(this.volume() - obj.volume()) < 0.000001) {
         return 0;
      }
      else if (this.volume() > obj.volume()) {
         return 1;
      }
      else {
         return -1;
      }
   }
}