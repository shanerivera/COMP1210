import org.junit.Assert;
import org.junit.Test;



/** 
 * Infielder Test Methods.
 * @author Shane Rivera - COMP1210 - 005
 * @version 4/5/2022
 */

public class InfielderTest {

   /** A test for getNumber method. **/
   @Test public void getNumberTest() {
      Infielder p1 = new Infielder("23", "Jackie Smith", "3B", 150000, 
                                  2.50, .275, .850); 
      Assert.assertEquals("23", p1.getNumber());
   }
   
   
   /** A test for setNumber method. **/
   @Test public void setNumberTest() {
      Infielder p1 = new Infielder("23", "Jackie Smith", "3B", 150000, 
                                  2.50, .275, .850); 
      p1.setNumber("10");
      Assert.assertEquals("10", p1.getNumber());
   }
   
   /** A test for getName method. **/
   @Test public void getNameTest() {
      Infielder p1 = new Infielder("23", "Jackie Smith", "3B", 150000, 
                                  2.50, .275, .850); 
      Assert.assertEquals("Jackie Smith", p1.getName());
   }
   
   /** A test for setName method. **/
   @Test public void setNameTest() {
      Infielder p1 = new Infielder("23", "Jackie Smith", "3B", 150000, 
                                  2.50, .275, .850); 
      p1.setName("Jack");
      Assert.assertEquals("Jack", p1.getName());
   }
   
   /** A test for getPosition method. **/
   @Test public void getPositionTest() {
      Infielder p1 = new Infielder("23", "Jackie Smith", "3B", 150000, 
                                  2.50, .275, .850); 
      Assert.assertEquals("3B", p1.getPosition());
   }
   
   /** A test for setPosition method. **/
   @Test public void setPositionTest() {
      Infielder p1 = new Infielder("23", "Jackie Smith", "3B", 150000, 
                                  2.50, .275, .850); 
      p1.setPosition("LF");
      Assert.assertEquals("LF", p1.getPosition());
   }
   
   /** A test for getBaseSalary method. **/
   @Test public void getBaseSalaryTest() {
      Infielder p1 = new Infielder("23", "Jackie Smith", "3B", 150000, 
                                  2.50, .275, .850); 
      Assert.assertEquals(150000, p1.getBaseSalary(), .000001);
   }
   
   /** A test for setBaseSalary method. **/
   @Test public void setBaseSalaryTest() {
      Infielder p1 = new Infielder("23", "Jackie Smith", "3B", 150000, 
                                  2.50, .275, .850); 
      p1.setBaseSalary(99999);
      Assert.assertEquals(99999, p1.getBaseSalary(), .000001);
   }
   
   /** A test for getBonusAdjustmentFactor method. **/
   @Test public void getBonusAdjustmentFactorTest() {
      Infielder p1 = new Infielder("23", "Jackie Smith", "3B", 150000, 
                                  2.50, .275, .850); 
      Assert.assertEquals(2.50, p1.getBonusAdjustmentFactor(), .000001);
   }
   
   /** A test for setBonusAdjustmentFactor method. **/
   @Test public void setBonusAdjustmentFactorTest() {
      Infielder p1 = new Infielder("23", "Jackie Smith", "3B", 150000, 
                                  2.50, .275, .850); 
      p1.setBonusAdjustmentFactor(1.75);
      Assert.assertEquals(1.75, p1.getBonusAdjustmentFactor(), .000001);
   }
   
   /** A test for getBattingAverage method. **/
   @Test public void getBattingAverageTest() {
      Infielder p1 = new Infielder("23", "Jackie Smith", "3B", 150000, 
                                  2.50, .275, .850); 
      Assert.assertEquals(.275, p1.getBattingAvg(), .000001);
   }
   
   /** A test for setBattingAverage method. **/
   @Test public void setBattingAverageTest() {
      Infielder p1 = new Infielder("23", "Jackie Smith", "3B", 150000, 
                                  2.50, .275, .850); 
      p1.setBattingAvg(.100);
      Assert.assertEquals(.100, p1.getBattingAvg(), .000001);
   }
   
   /** A test for getCount and resetCount method. **/
   @Test public void countTest() {
      BallPlayer.resetCount();
      Infielder p1 = new Infielder("23", "Jackie Smith", "3B", 150000, 
                                  2.50, .275, .850); 
     
      Assert.assertEquals(1, BallPlayer.getCount());
   }
   
   
   /** A test for stats method. **/
   @Test public void statsTest() {
      Infielder p1 = new Infielder("23", "Jackie Smith", "3B", 150000, 
                                  2.50, .275, .850); 
      Assert.assertEquals(".275", p1.stats());
   }
   
   /** A test for toString method. **/
   @Test public void toStringTest() {
      Infielder p1 = new Infielder("23", "Jackie Smith", "3B", 150000, 
                                  2.50, .275, .850);  
      Assert.assertTrue(p1.toString().contains("(class Infielder)"));
   }
   
   /** A test for getInfielderFieldingAvg method. **/
   @Test public void getInfielderFieldingAvgTest() {
      Infielder p1 = new Infielder("23", "Jackie Smith", "3B", 150000, 
                                  2.50, .275, .850); 
      Assert.assertEquals(.850, p1.getInfielderFieldingAvg(), .000001);
   }
   
   /** A test for setInfielderFieldingAvg method. **/
   @Test public void setInfielderFieldingAvgTest() {
      Infielder p1 = new Infielder("23", "Jackie Smith", "3B", 150000, 
                                  2.50, .275, .850); 
      p1.setInfielderFieldingAvg(.750);
      Assert.assertEquals(.750, p1.getInfielderFieldingAvg(), .000001);
   }
   
   /** A test for totalEarnings method. **/
   @Test public void totalEarningsTest() {
      Infielder p1 = new Infielder("23", "Jackie Smith", "3B", 150000, 
                                  2.50, .275, .850); 
      Assert.assertEquals(237656.25, p1.totalEarnings(), .01);
   }
  
}
