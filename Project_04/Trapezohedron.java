import java.text.DecimalFormat;
/** 
 * Program stores the label, color, and short edge length,
 * which must be non-negative to then calculate the edge length 
 * antiprism, the long edge length, surface area, and volume of
 * the Trapezohedron object, and a method to provide a 
 * String value of an Trapezohedron object.
 * @author Shane Rivera - COMP1210 - 005
 * @version 2/10/2022
 */
 
public class Trapezohedron {
   
   // instance variables
   private String label = "";
   private String color = "";
   private double shortEdge = 0;
   
   // constructor
  /**
   * Trapezohedron constructor.
   * @param labelIn - label
   * @param colorIn - color
   * @param shortEdgeIn - shortEdge
   */
   public Trapezohedron(String labelIn, String colorIn, double shortEdgeIn) {
      setLabel(labelIn);
      setColor(colorIn);
      setShortEdge(shortEdgeIn);
   }
   // methods
  /**
   * Get Label Method.
   * @return the label content
   */
   public String getLabel() {
      return label;
   }
  /**
   * Set's label and trims it if a String is entered.
   * @param labelIn - The entered string label
   * @return - true if one is entered, false if not
   */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      else {
         return false;
      }
   }
  /**
   * Get Color Method.
   * @return the color content
   */
   public String getColor() {
      return  color;
   }
  /**
   * Set's color and trims it if a String is entered.
   * @param colorIn - The entered string label
   * @return - true if one is entered, false if not
   */
   public boolean setColor(String colorIn) {
      if (colorIn != null) {
         color = colorIn.trim();
         return true;
      }
      else {
         return false;
      }
   }
  /**
   * Get Short Edge Method.
   * @return - the short edge value
   */
   public double getShortEdge() {
      return shortEdge;
   }
  /**
   * Set's short edge if it is greater than 0.
   * @param shortEdgeIn - short edge length
   * @return - true if there length is greater than 0, if not then false
   */
   public boolean setShortEdge(double shortEdgeIn) {
      if (shortEdgeIn > 0) {
         shortEdge = shortEdgeIn;
         return true;
      }
      else {
         return false;
      }
   }
  /**
   * Solves for edge length antiprism value.
   * @return - value of edge length antiprism
   */
   public double edgeLengthAntiprism() {
      return shortEdge / ((Math.sqrt(5) - 1) / 2);
   }
  /**
   * Solves for long edge value.
   * @return - value of long edge
   */
   public double longEdge() {
      return ((Math.sqrt(5) + 1) / 2) * edgeLengthAntiprism();
   }
  /**
   * Solves for surface area.
   * @return - value of surface area
   */
   public double surfaceArea() {
      return (Math.pow(edgeLengthAntiprism(), 2)) 
         * (Math.sqrt(((25 / 2.0) * (5 + Math.sqrt(5)))));
   }
  /**
   * Solves for volume.
   * @return - value of volume
   */
   public double volume() {
      return ((5.0 / 12) * (3 + Math.sqrt(5))) 
         * (Math.pow(edgeLengthAntiprism(), 3));
   }
   
  /**
   * Main method that returns output to user as a String.
   * @return - output in string form of all values with descriptions before
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0###");
      String output = "Trapezohedron \"" + label + "\" is \""
            + color + "\" with 20 edges and 12 vertices.\n";
      output += "\tedge length antiprism = " + df.format(edgeLengthAntiprism());
      output += " units\n";
      output += "\tshort edge = " + df.format(shortEdge) + " units\n";
      output += "\tlong edge = " + df.format(longEdge()) + " units\n";
      output += "\tsurface area = " + df.format(surfaceArea());
      output += " square units\n"; 
      output += "\tvolume = " + df.format(volume()) + " cubic units\n";
      return output;
   }
   
   
}