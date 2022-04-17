import org.junit.Assert;
import org.junit.Test;



/** 
 * Outfielder Test Methods.
 * @author Shane Rivera - COMP1210 - 005
 * @version 4/5/2022
 */

public class OutfielderTest {

   /** A test for getNumber method. **/
   @Test public void getNumberTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 
                                  1.25, .375, .950); 
      Assert.assertEquals("32", p1.getNumber());
   }
   
   
   /** A test for setNumber method. **/
   @Test public void setNumberTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 
                                  1.25, .375, .950); 
      p1.setNumber("10");
      Assert.assertEquals("10", p1.getNumber());
   }
   
   /** A test for getName method. **/
   @Test public void getNameTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 
                                  1.25, .375, .950); 
      Assert.assertEquals("Pat Jones", p1.getName());
   }
   
   /** A test for setName method. **/
   @Test public void setNameTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 
                                  1.25, .375, .950); 
      p1.setName("Jack");
      Assert.assertEquals("Jack", p1.getName());
   }
   
   /** A test for getPosition method. **/
   @Test public void getPositionTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 
                                  1.25, .375, .950); 
      Assert.assertEquals("RF", p1.getPosition());
   }
   
   /** A test for setPosition method. **/
   @Test public void setPositionTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 
                                  1.25, .375, .950); 
      p1.setPosition("LF");
      Assert.assertEquals("LF", p1.getPosition());
   }
   
   /** A test for getBaseSalary method. **/
   @Test public void getBaseSalaryTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 
                                  1.25, .375, .950); 
      Assert.assertEquals(150000, p1.getBaseSalary(), .000001);
   }
   
   /** A test for setBaseSalary method. **/
   @Test public void setBaseSalaryTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 
                                  1.25, .375, .950); 
      p1.setBaseSalary(99999);
      Assert.assertEquals(99999, p1.getBaseSalary(), .000001);
   }
   
   /** A test for getBonusAdjustmentFactor method. **/
   @Test public void getBonusAdjustmentFactorTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 
                                  1.25, .375, .950); 
      Assert.assertEquals(1.25, p1.getBonusAdjustmentFactor(), .000001);
   }
   
   /** A test for setBonusAdjustmentFactor method. **/
   @Test public void setBonusAdjustmentFactorTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 
                                  1.25, .375, .950); 
      p1.setBonusAdjustmentFactor(1.75);
      Assert.assertEquals(1.75, p1.getBonusAdjustmentFactor(), .000001);
   }
   
   /** A test for getBattingAverage method. **/
   @Test public void getBattingAverageTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 
                                  1.25, .375, .950); 
      Assert.assertEquals(.375, p1.getBattingAvg(), .000001);
   }
   
   /** A test for setBattingAverage method. **/
   @Test public void setBattingAverageTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 
                                  1.25, .375, .950); 
      p1.setBattingAvg(.100);
      Assert.assertEquals(.100, p1.getBattingAvg(), .000001);
   }
   
   /** A test for getCount and resetCount method. **/
   @Test public void countTest() {
      BallPlayer.resetCount();
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 
                                  1.25, .375, .950); 
     
      Assert.assertEquals(1, BallPlayer.getCount());
   }
   
   
   /** A test for stats method. **/
   @Test public void statsTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 
                                  1.25, .375, .950); 
      Assert.assertEquals(".375", p1.stats());
   }
   
   /** A test for toString method. **/
   @Test public void toStringTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 
                                  1.25, .375, .950); 
      Assert.assertTrue(p1.toString().contains("(class Outfielder)"));
   }
   
   /** A test for getOutfielderFieldingAvg method. **/
   @Test public void getOutfielderFieldingAvgTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 
                                  1.25, .375, .950); 
      Assert.assertEquals(.950, p1.getOutfielderFieldingAvg(), .000001);
   }
   
   /** A test for setOutfielderFieldingAvg method. **/
   @Test public void setOutfielderFieldingAvgTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 
                                  1.25, .375, .950); 
      p1.setOutfielderFieldingAvg(.750);
      Assert.assertEquals(.750, p1.getOutfielderFieldingAvg(), .000001);
   }
   
   /** A test for totalEarnings method. **/
   @Test public void totalEarningsTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 
                                  1.25, .375, .950); 
      Assert.assertEquals(216796.88, p1.totalEarnings(), .01);
   }
   
}
