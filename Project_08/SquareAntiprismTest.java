import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Tests all methods in Square Antiprism.
* @author Shane Rivera - COMP1210 - 005
* @version 3/23/2022
*/
public class SquareAntiprismTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   
   /** Tests get label method. **/
   @Test public void getLabel() {
      SquareAntiprism ex = new SquareAntiprism("Example", 5); 
      Assert.assertEquals("Example", ex.getLabel()); 
   }
   
   /** Tests correct set label method. **/
   @Test public void setLabel() {
      SquareAntiprism ex = new SquareAntiprism("Example", 5);
      ex.setLabel("New");
      Assert.assertEquals("New", ex.getLabel());
   }
   
   /** Tests incorrect set label method. **/
   @Test public void setLabel2() {
      SquareAntiprism ex = new SquareAntiprism("Example", 5);
      Assert.assertEquals(false, ex.setLabel(null));
   }
   
   /** Tests get edge method. **/
   @Test public void getEdge() {
      SquareAntiprism ex = new SquareAntiprism("Example", 5);
      Assert.assertEquals(5, ex.getEdge(), .000001);
   }
   
   /** Tests correct set edge method. **/
   @Test public void setEdge() {
      SquareAntiprism ex = new SquareAntiprism("Example", 5);
      ex.setEdge(15);
      Assert.assertEquals(15, ex.getEdge(), .000001);
   }
   
   /** Tests incorrect set edge method. **/
   @Test public void setEdge2() {
      SquareAntiprism ex = new SquareAntiprism("Example", 5);
      Assert.assertEquals(false, ex.setEdge(-15));
   }
   
   /** Tests height method. **/
   @Test public void height() {
      SquareAntiprism ex = new SquareAntiprism("Example", 1.25);
      Assert.assertEquals(1.075, ex.height(), .001);
   }
   
   /** Tests surface area method. **/
   @Test public void surfaceArea() {
      SquareAntiprism ex = new SquareAntiprism("Example", 10.4); 
      Assert.assertEquals(1793.84, ex.surfaceArea(), .001);
   }
   
   /** Tests volume method. **/
   @Test public void volume() {
      SquareAntiprism ex = new SquareAntiprism("Example", 32.46);
      Assert.assertEquals(145970.655, ex.volume(), .001); 
   }
   
   /** Tests toString method. **/
   @Test public void toStringTest() {
      SquareAntiprism ex = new SquareAntiprism("Example", 5);
      Assert.assertTrue(ex.toString().contains("\"Example\""));
   }
   
   /** Tests reset count method. **/
   @Test public void resetCount() {
      SquareAntiprism ex = new SquareAntiprism("Example", 5); 
      ex.resetCount();
      Assert.assertEquals(0, ex.getCount());
   }
   
   /** Tests get count method. **/
   @Test public void getCount() {
      SquareAntiprism ex = new SquareAntiprism("Example", 5);
      ex.resetCount();
      SquareAntiprism ex2 = new SquareAntiprism("Example", 10);
      Assert.assertEquals(1, ex2.getCount());
   }
   
   /** Tests equals method if true and true and true. **/
   @Test public void equals() {
      SquareAntiprism ex = new SquareAntiprism("Example", 5);
      SquareAntiprism ex2 = new SquareAntiprism("Example", 5);
      Assert.assertEquals(true, ex.equals(ex2));
   }
   
   /** Tests equals method if true and false and true/false. **/
   @Test public void equals2() {
      SquareAntiprism ex = new SquareAntiprism("Example", 5);
      SquareAntiprism ex2 = new SquareAntiprism("Not Example", 10);
      Assert.assertEquals(false, ex.equals(ex2));
   }
   
   /** Tests equals method if false and true/false and true/false. **/
   @Test public void equals3() {
      SquareAntiprism ex = new SquareAntiprism("Example", 5);
      int ex2 = 111;
      Assert.assertEquals(false, ex.equals(ex2));
   }
   
   /** Tests equals method if true and true and false. **/
   @Test public void equals4() {
      SquareAntiprism ex = new SquareAntiprism("Example", 5);
      SquareAntiprism ex2 = new SquareAntiprism("Example", 6);
      Assert.assertEquals(false, ex.equals(ex2));
   }
   
   /** Tests hash code method. **/
   @Test public void hashCodeTest() {
      SquareAntiprism ex = new SquareAntiprism("Example", 5); 
      Assert.assertEquals(0, ex.hashCode());
   }
   
   /** Tests compareTo method when equal. **/
   @Test public void compareToTest1() {
      SquareAntiprism ex = new SquareAntiprism("Example", 5);
      SquareAntiprism ex2 = new SquareAntiprism("Example Dos", 5);
      Assert.assertEquals(0, ex.compareTo(ex2));
   }
   
   /** Tests compareTo method when greater than. **/
   @Test public void compareToTest2() {
      SquareAntiprism ex = new SquareAntiprism("Example", 10);
      SquareAntiprism ex2 = new SquareAntiprism("Example Dos", 5);
      Assert.assertEquals(1, ex.compareTo(ex2));
   }
   
   /** Tests compareTo method when less than. **/
   @Test public void compareToTest3() {
      SquareAntiprism ex = new SquareAntiprism("Example", 5);
      SquareAntiprism ex2 = new SquareAntiprism("Example Dos", 10);
      Assert.assertEquals(-1, ex.compareTo(ex2));
   }
}
