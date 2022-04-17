import java.text.DecimalFormat;
/** 
 * Abstract class that stores ball player data and provides
 * methods to access the data.
 * @author Shane Rivera - COMP1210 - 005
 * @version 4/5/2022
 */
 
public abstract class BallPlayer {
   
   // instance variables
   protected String number;
   protected String name;
   protected String position;
   protected double salary;
   protected double bonus;
   protected double battingAvg;
   protected static int count = 0;
   
   /**
   * Constructor.
   * @param numberIn - Player's number
   * @param nameIn - Player's name
   * @param positionIn - Player's position
   * @param salaryIn - Player's base salary
   * @param bonusIn - Player's bonus adjustment factor
   * @param battingAvgIn - Player's batting average
   */
   public BallPlayer(String numberIn, String nameIn, String positionIn,
                     double salaryIn, double bonusIn, double battingAvgIn) {
                     
      number = numberIn;
      name = nameIn;
      position = positionIn;
      salary = salaryIn;
      bonus = bonusIn;
      battingAvg = battingAvgIn;
      count++;
   }
   
   /**
   * Getter for number.
   * @return number
   */
   public String getNumber() {
      return number;
   }
   
   /**
   * Setter for number.
   * @param numberIn - New number
   */
   public void setNumber(String numberIn) {
      number = numberIn;
   }
   
   /**
   * Getter for name.
   * @return name
   */
   public String getName() {
      return name;
   }
   
   /**
   * Setter for name.
   * @param nameIn - New name
   */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
   /**
   * Getter for position.
   * @return position
   */
   public String getPosition() {
      return position;
   }
   
   /**
   * Setter for position.
   * @param positionIn - New position
   */
   public void setPosition(String positionIn) {
      position = positionIn;
   }
   
   /**
   * Getter for base salary.
   * @return salary
   */
   public double getBaseSalary() {
      return salary;
   }
   
   /**
   * Setter for base salary.
   * @param salaryIn - New salary
   */
   public void setBaseSalary(double salaryIn) {
      salary = salaryIn;
   }
   
   /**
   * Getter for bonus adjustment factor.
   * @return bonus
   */
   public double getBonusAdjustmentFactor() {
      return bonus;
   }
   
   /**
   * Setter for bonus adjustment factor.
   * @param bonusIn - New bonus adjustment factor
   */
   public void setBonusAdjustmentFactor(double bonusIn) {
      bonus = bonusIn;
   }
   
   /**
   * Getter for batting average.
   * @return battingAvg
   */
   public double getBattingAvg() {
      return battingAvg;
   }
   
   /**
   * Setter for batting average.
   * @param battingAvgIn - New batting average
   */
   public void setBattingAvg(double battingAvgIn) {
      battingAvg = battingAvgIn;
   }
   
   /**
   * Getter for count.
   * @return count
   */
   public static int getCount() {
      return count;
   }
   
   /**
   * Resets count to 0.
   */
   public static void resetCount() {
      count = 0;
   }
   
   /**
   * Converts the batting average from double to string.
   * @return battingAverage in ".000"
   */
   public String stats() {
      
      DecimalFormat df = new DecimalFormat(".000");
      return df.format(getBattingAvg());
   }
   
   /**
   * toString method.
   * @return output - Describes Ballplayer object
   */
   public String toString() {
      
      DecimalFormat df = new DecimalFormat("$###,##0.00");
      
      String output = number + " " + name + " (" + position + ") ";
      output += stats() + "\n";
      output += "Base Salary: " + df.format(getBaseSalary());
      output += " Bonus Adjustment Factor: " + bonus + "\n";
      output += "Total Earnings: " + df.format(totalEarnings());
      output += " (" + this.getClass() + ")";
     
      return output;
   }
   
   /**
   * Abstract total earnings.
   * @return double
   */
   public abstract double totalEarnings();
   
}