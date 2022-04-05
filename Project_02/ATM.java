import java.util.Scanner;
/** 
 * Program allows user to enter amount of whole
 * dollars and displays the number of bills by
 * denomination starting at $20.
 * @author Shane Rivera - COMP1210 - 005
 * @version 1/27/2022
 */
 
public class ATM
{
   /**
    * Program displays number of $20s, $10s, $5s, and $1s
    * possible when the user enters a whole dollar amount
    * less than $500.
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) 
   {
      Scanner scan = new Scanner(System.in);
      int amount = 0;
      int twenties = 0;
      int tens = 0;
      int fives = 0;
      int ones = 0;
      System.out.print("Enter the amount: ");
      amount = scan.nextInt();
      int total = amount;
      //checks if amount exceeds 500 first
      if (amount > 500) {
         System.out.println("Limit of $500 exceeded!");
      }
      //figures out how many of each bill denominations there are
      else {
         twenties = amount / 20;
         amount %= 20;
         tens = amount / 10;
         amount %= 10;
         fives = amount / 5;
         amount %= 5;
         ones = amount;
         System.out.println("Bills by denomination:");
         System.out.println("\t$20: " + twenties);
         System.out.println("\t$10: " + tens);
         System.out.println("\t$5: " + fives);
         System.out.println("\t$1: " + ones);
         System.out.println("$" + total + " = (" + twenties
                  + " * $20) + (" + tens + " * $10) + (" + fives
                  + " * $5) + (" + ones + " * $1)");
      }
   }
}