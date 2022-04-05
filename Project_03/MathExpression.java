import java.text.DecimalFormat;
import java.util.Scanner;
/** 
 * Solves for the result of a specified expression using methods
 * from the Math class. (pow, sqrt, abs) and prints extra info.
 * @author Shane Rivera - COMP1210 - 005
 * @version 2/3/2022
 */
 
public class MathExpression
{
   /**
    * Solves for result = sqrt(abs(3 + 3x + 3x^2 + 3x^3 + 3x^4)) + 3x^5
    * all then divided by (abs(x) + 3).
    * Also, prints # of characters to the right and left of the decimal
    * and formats results to "#,##0.0##".
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) 
   {
      Scanner scan = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      double x;
      double result;
   
      System.out.print("Enter a value for x: ");
      x = scan.nextDouble();
   
      result = 3 + (3 * x) + (3 * Math.pow(x, 2)) + (3 * Math.pow(x, 3));
      result += (3 * Math.pow(x, 4));
      result = Math.sqrt(Math.abs(result)) + (3 * Math.pow(x, 5));
      result /= (Math.abs(x) + 3);
      System.out.println("Result: " + result);
      
      String res = Double.toString(result); // converts result to a string
      int dp = res.indexOf('.'); // locates index of decimal
      
      System.out.println("# of characters to left of decimal"
               + " point: " + res.substring(0, dp).length());
      System.out.println("# of characters to right of decimal"
               + " point: " + res.substring(dp + 1, res.length()).length());
      
      System.out.println("Formatted Result: " + df.format(result));
   }
}