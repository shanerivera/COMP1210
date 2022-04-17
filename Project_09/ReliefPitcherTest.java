import org.junit.Assert;
import org.junit.Test;

/** 
 * ReliefPitcher Test Methods.
 * @author Shane Rivera - COMP1210 - 005
 * @version 4/5/2022
 */

public class ReliefPitcherTest {

   /** A test for get/set Number method. **/
   @Test public void setNumberTest() {
      ReliefPitcher p1 = new ReliefPitcher("34", "Sammi James", "LHP", 150000, 
                              3.50, .125, 5, 4, 3.85, 17); 
      p1.setNumber("10");
      Assert.assertEquals("10", p1.getNumber());
   }
   
   /** A test for get/set Name method. **/
   @Test public void setNameTest() {
      ReliefPitcher p1 = new ReliefPitcher("34", "Sammi James", "LHP", 150000, 
                              3.50, .125, 5, 4, 3.85, 17); 
      p1.setName("Jack");
      Assert.assertEquals("Jack", p1.getName());
   }
   
   /** A test for get/set Position method. **/
   @Test public void setPositionTest() {
      ReliefPitcher p1 = new ReliefPitcher("34", "Sammi James", "LHP", 150000, 
                              3.50, .125, 5, 4, 3.85, 17); 
      p1.setPosition("LF");
      Assert.assertEquals("LF", p1.getPosition());
   }
   
   /** A test for get/set BaseSalary method. **/
   @Test public void setBaseSalaryTest() {
      ReliefPitcher p1 = new ReliefPitcher("34", "Sammi James", "LHP", 150000, 
                              3.50, .125, 5, 4, 3.85, 17); 
      p1.setBaseSalary(99999);
      Assert.assertEquals(99999, p1.getBaseSalary(), .000001);
   }
   
   /** A test for get/set BonusAdjustmentFactor method. **/
   @Test public void setBonusAdjustmentFactorTest() {
      ReliefPitcher p1 = new ReliefPitcher("34", "Sammi James", "LHP", 150000, 
                              3.50, .125, 5, 4, 3.85, 17);  
      p1.setBonusAdjustmentFactor(1.75);
      Assert.assertEquals(1.75, p1.getBonusAdjustmentFactor(), .000001);
   }
   
   /** A test for get/set BattingAverage method. **/
   @Test public void setBattingAverageTest() {
      ReliefPitcher p1 = new ReliefPitcher("34", "Sammi James", "LHP", 150000, 
                              3.50, .125, 5, 4, 3.85, 17); 
      p1.setBattingAvg(.100);
      Assert.assertEquals(.100, p1.getBattingAvg(), .000001);
   }
   
   /** A test for getCount and resetCount method. **/
   @Test public void countTest() {
      BallPlayer.resetCount();
      ReliefPitcher p1 = new ReliefPitcher("34", "Sammi James", "LHP", 150000, 
                              3.50, .125, 5, 4, 3.85, 17); 
     
      Assert.assertEquals(1, BallPlayer.getCount());
   }
   
   
   /** A test for stats method. **/
   @Test public void statsTest() {
      ReliefPitcher p1 = new ReliefPitcher("34", "Sammi James", "LHP", 150000, 
                              3.50, .125, 5, 4, 3.85, 17);  
      Assert.assertEquals("5 wins, 4 losses, 17 saves, 3.85 ERA", p1.stats());
   }
   
   /** A test for toString method. **/
   @Test public void toStringTest() {
      ReliefPitcher p1 = new ReliefPitcher("34", "Sammi James", "LHP", 150000, 
                              3.50, .125, 5, 4, 3.85, 17); 
      Assert.assertTrue(p1.toString().contains("(class ReliefPitcher)"));
   }
   
   /** A test for totalEarnings method. **/
   @Test public void totalEarningsTest() {
      ReliefPitcher p1 = new ReliefPitcher("34", "Sammi James", "LHP", 150000, 
                              3.50, .125, 5, 4, 3.85, 17); 
      Assert.assertEquals(214948.45, p1.totalEarnings(), .01);
   }
   
   /** A test for get/set Wins method. **/
   @Test public void winsTest() {
      ReliefPitcher p1 = new ReliefPitcher("34", "Sammi James", "LHP", 150000, 
                              3.50, .125, 5, 4, 3.85, 17); 
      p1.setWins(45);
      Assert.assertEquals(45, p1.getWins(), .000001);
   }
   
   /** A test for get/set Losses method. **/
   @Test public void lossesTest() {
      ReliefPitcher p1 = new ReliefPitcher("34", "Sammi James", "LHP", 150000, 
                              3.50, .125, 5, 4, 3.85, 17); 
      p1.setLosses(10);
      Assert.assertEquals(10, p1.getLosses(), .000001);
   }
   
   /** A test for get/set Era method. **/
   @Test public void eraTest() {
      ReliefPitcher p1 = new ReliefPitcher("34", "Sammi James", "LHP", 150000, 
                              3.50, .125, 5, 4, 3.85, 17); 
      p1.setEra(1.90);
      Assert.assertEquals(1.90, p1.getEra(), .000001);
   }
 
   /** A test for get/set Saves method. **/
   @Test public void savesTest() {
      ReliefPitcher p1 = new ReliefPitcher("34", "Sammi James", "LHP", 150000, 
                              3.50, .125, 5, 4, 3.85, 17); 
      p1.setSaves(9);
      Assert.assertEquals(9, p1.getSaves(), .000001);
   }
}
