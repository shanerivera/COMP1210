import java.util.Scanner;
/** 
 * Program has a main method that reads in values for label,
 * color, and edge. After the values have been read in,
 * main creates an Trapezohedron object and then prints a
 * new line and the object.   
 * @author Shane Rivera - COMP1210 - 005
 * @version 2/10/2022
 */
 
public class TrapezohedronApp {

  /**
   * Asks user for input values and uses Trapezohedron class
   * to solve for values and print them.
   * @param args Command line arguments (not used).
   */
   public static void main(String[] args) {
   
      Scanner scan = new Scanner(System.in);
      String label;
      String color;
      double shortEdge;
      
      System.out.println("Enter label, color, and short edge "
         + "length for a trapezohedron.");
      System.out.print("\tlabel: ");
      label = scan.nextLine();
      System.out.print("\tcolor: ");
      color = scan.nextLine();
      System.out.print("\tshort edge: ");
      String shortEdgeString = scan.nextLine();
      shortEdge = Double.parseDouble(shortEdgeString);
      
      if (shortEdge > 0) {
         Trapezohedron trap = new Trapezohedron(label, color, shortEdge);
         System.out.print("\n" + trap);
      }
      else {
         System.out.println("Error: short edge must be greater than zero.");
      }
   
   }

}