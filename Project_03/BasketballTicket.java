import java.text.DecimalFormat;
import java.util.Scanner;
/** 
 * Programs accept coded ticket information as input that 
    * includes the price, discount, time, date, section, row,
    * seat, followed by the description of the ticket.
 * @author Shane Rivera - COMP1210 - 005
 * @version 2/3/2022
 */
 
public class BasketballTicket
{
   /**
    * Program determines the price, discount, time, date,
    * section, row, seat, and game of inputed String 28
    * characters or greater.
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) 
   {
      Scanner scan = new Scanner(System.in);
      DecimalFormat dPrice = new DecimalFormat("$#,##0.00");
      DecimalFormat dDiscount = new DecimalFormat("0%");
      DecimalFormat dCost = new DecimalFormat("$#,##0.00");
      DecimalFormat dPrize = new DecimalFormat("000000");
   
      String ticket;
      System.out.print("Enter ticket code: ");
      ticket = scan.nextLine();
      System.out.println("");
   
      if (ticket.length() < 28) {
         System.out.println("*** Invalid Ticket Code ***");
         System.out.println("Ticket code must have at least" 
                  + " 28 characters.");
      }
      else {
       
         ticket = ticket.trim();
         
         String description = ticket.substring(27, ticket.length());
         String sPrice = ticket.substring(0, 6);
         String sDiscount = ticket.substring(6, 8);
         String hour = ticket.substring(8, 10);
         String minute = ticket.substring(10, 12);
         String month = ticket.substring(12, 14);
         String day = ticket.substring(14, 16);
         String year = ticket.substring(16, 20);
         String section = ticket.substring(20, 23);
         String row = ticket.substring(23, 25);
         String seat = ticket.substring(25, 27);
         
         double price = Double.parseDouble(sPrice);
         price /= 100;
         double discount = Double.parseDouble(sDiscount);
         double cost = price * (1 - (discount / 100));
         
      
      
         
         System.out.println("Ticket: " + description);
         System.out.print("Date: " + month + "/" + day + "/" + year);
         System.out.println("   Time: " + hour + ":" + minute);
         System.out.println("Section: " + section + "   Row: " + row
                  + "   Seat: " + seat);
         System.out.println("Price: " + dPrice.format(price)
                  + "   Discount: " + dDiscount.format(discount / 100)
                  + "   Cost: " + dCost.format(cost));
      
         int prize;
         prize = (int) (Math.random() * 999999);
         
         System.out.println("Prize Number: " + dPrize.format(prize));
      }
   }
}