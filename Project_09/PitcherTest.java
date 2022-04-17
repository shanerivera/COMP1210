import org.junit.Assert;
import org.junit.Test;



/** 
 * Pitcher Test Methods.
 * @author Shane Rivera - COMP1210 - 005
 * @version 4/5/2022
 */

public class PitcherTest {

   
   /** A test for get/set Number method. **/
   @Test public void setNumberTest() {
      Pitcher p1 = new Pitcher("43", "Jo Williams", "RHP", 150000, 
                              3.50, .125, 22, 4, 2.85); 
      p1.setNumber("10");
      Assert.assertEquals("10", p1.getNumber());
   }
   
   /** A test for get/set Name method. **/
   @Test public void setNameTest() {
      Pitcher p1 = new Pitcher("43", "Jo Williams", "RHP", 150000, 
                              3.50, .125, 22, 4, 2.85); 
      p1.setName("Jack");
      Assert.assertEquals("Jack", p1.getName());
   }
   
   /** A test for get/set Position method. **/
   @Test public void setPositionTest() {
      Pitcher p1 = new Pitcher("43", "Jo Williams", "RHP", 150000, 
                              3.50, .125, 22, 4, 2.85); 
      p1.setPosition("LF");
      Assert.assertEquals("LF", p1.getPosition());
   }
   
   /** A test for get/set BaseSalary method. **/
   @Test public void setBaseSalaryTest() {
      Pitcher p1 = new Pitcher("43", "Jo Williams", "RHP", 150000, 
                              3.50, .125, 22, 4, 2.85); 
      p1.setBaseSalary(99999);
      Assert.assertEquals(99999, p1.getBaseSalary(), .000001);
   }
   
   /** A test for get/set BonusAdjustmentFactor method. **/
   @Test public void setBonusAdjustmentFactorTest() {
      Pitcher p1 = new Pitcher("43", "Jo Williams", "RHP", 150000, 
                              3.50, .125, 22, 4, 2.85); 
      p1.setBonusAdjustmentFactor(1.75);
      Assert.assertEquals(1.75, p1.getBonusAdjustmentFactor(), .000001);
   }
   
   /** A test for get/set BattingAverage method. **/
   @Test public void setBattingAverageTest() {
      Pitcher p1 = new Pitcher("43", "Jo Williams", "RHP", 150000, 
                              3.50, .125, 22, 4, 2.85);  
      p1.setBattingAvg(.100);
      Assert.assertEquals(.100, p1.getBattingAvg(), .000001);
   }
   
   /** A test for getCount and resetCount method. **/
   @Test public void countTest() {
      BallPlayer.resetCount();
      Pitcher p1 = new Pitcher("43", "Jo Williams", "RHP", 150000, 
                              3.50, .125, 22, 4, 2.85); 
     
      Assert.assertEquals(1, BallPlayer.getCount());
   }
   
   
   /** A test for stats method. **/
   @Test public void statsTest() {
      Pitcher p1 = new Pitcher("43", "Jo Williams", "RHP", 150000, 
                              3.50, .125, 22, 4, 2.85);  
      Assert.assertEquals("22 wins, 4 losses, 2.85 ERA", p1.stats());
   }
   
   /** A test for toString method. **/
   @Test public void toStringTest() {
      Pitcher p1 = new Pitcher("43", "Jo Williams", "RHP", 150000, 
                              3.50, .125, 22, 4, 2.85); 
      Assert.assertTrue(p1.toString().contains("(class Pitcher)"));
   }
   
   /** A test for totalEarnings method. **/
   @Test public void totalEarningsTest() {
      Pitcher p1 = new Pitcher("43", "Jo Williams", "RHP", 150000, 
                              3.50, .125, 22, 4, 2.85); 
      Assert.assertEquals(248181.82, p1.totalEarnings(), .01);
   }
   
   /** A test for get/set Wins method. **/
   @Test public void winsTest() {
      Pitcher p1 = new Pitcher("43", "Jo Williams", "RHP", 150000, 
                              3.50, .125, 22, 4, 2.85); 
      p1.setWins(45);
      Assert.assertEquals(45, p1.getWins(), .000001);
   }
   
   /** A test for get/set Losses method. **/
   @Test public void lossesTest() {
      Pitcher p1 = new Pitcher("43", "Jo Williams", "RHP", 150000, 
                              3.50, .125, 22, 4, 2.85); 
      p1.setLosses(10);
      Assert.assertEquals(10, p1.getLosses(), .000001);
   }
   
   /** A test for get/set Era method. **/
   @Test public void eraTest() {
      Pitcher p1 = new Pitcher("43", "Jo Williams", "RHP", 150000, 
                              3.50, .125, 22, 4, 2.85); 
      p1.setEra(1.90);
      Assert.assertEquals(1.90, p1.getEra(), .000001);
   }
 
 
}
