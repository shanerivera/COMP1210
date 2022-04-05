import java.util.Scanner;
/** 
 * Program finds the result of a specified expression with
 * variables x, y, and z.
 * @author Shane Rivera - COMP1210 - 005
 * @version 1/27/2022
 */
 
public class ThreeVariableExpression
{
   /**
    * Program uses inputs x, y, and z and solves the equation
    * result = (3.5x-7.75)(2.85y+6.0)(1.5z-3.1) / xyz for xyz != 0.
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) 
   {
      Scanner scan = new Scanner(System.in);
      double x = 0;
      double y = 0;
      double z = 0;
      double result = 0;
      
      System.out.println("result = (3.5x - 7.75) (2.85y + 6.0)"
               + " (1.5z - 3.1) / xyz");
      //asks user for x, y, and z
      System.out.print("\tx = ");
      x = scan.nextDouble();
      System.out.print("\ty = ");
      y = scan.nextDouble();
      System.out.print("\tz = ");
      z = scan.nextDouble();
      
      if (x * y * z == 0) {
         System.out.println("result is \"undefined\"");
      }
      //solves given equation if xyz != 0 and prints result
      else {
         result = (3.5 * x - 7.75) * (2.85 * y + 6.0) * (1.5 * z - 3.1);
         result /= (x * y * z);
         System.out.println("result = " + result);
      }
   }
}