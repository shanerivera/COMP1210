import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;

/**
* Tests all methods in Square Antiprism List.
* @author Shane Rivera - COMP1210 - 005
* @version 3/29/2022
*/

public class SquareAntiprismListTest {

   /** A test for getName method. **/
   @Test public void getNameTest() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25); 
      SquareAntiprism ex2 = new SquareAntiprism(" Medium Example ", 10.4); 
      SquareAntiprism ex3 = new SquareAntiprism("Large Example", 32.46);
      SquareAntiprism[] exs = {ex1, ex2, ex3};
      SquareAntiprismList exList = new SquareAntiprismList("Examples", exs, 3);
      
      Assert.assertEquals("Examples", exList.getName());
   }
   
   /** A test for numberOfSquareAntiprisms method. **/
   @Test public void numberOfSquareAntiprismsTest() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25); 
      SquareAntiprism ex2 = new SquareAntiprism(" Medium Example ", 10.4); 
      SquareAntiprism ex3 = new SquareAntiprism("Large Example", 32.46);
      SquareAntiprism[] exs = {ex1, ex2, ex3};
      SquareAntiprismList exList = new SquareAntiprismList("Examples", exs, 3);
      
      Assert.assertEquals(3, exList.numberOfSquareAntiprisms());
   }
   
   /** A test for totalSurfaceArea method. **/
   @Test public void totalSurfaceAreaTest() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25); 
      SquareAntiprism ex2 = new SquareAntiprism(" Medium Example ", 10.4); 
      SquareAntiprism ex3 = new SquareAntiprism("Large Example", 32.46);
      SquareAntiprism[] exs = {ex1, ex2, ex3};
      SquareAntiprismList exList = new SquareAntiprismList("Examples", exs, 3);
      
      Assert.assertEquals(19294.626, exList.totalSurfaceArea(), 0.001);
   }
   
   /** A test for totalVolume method. **/
   @Test public void totalVolumeTest() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25); 
      SquareAntiprism ex2 = new SquareAntiprism(" Medium Example ", 10.4); 
      SquareAntiprism ex3 = new SquareAntiprism("Large Example", 32.46);
      SquareAntiprism[] exs = {ex1, ex2, ex3};
      SquareAntiprismList exList = new SquareAntiprismList("Examples", exs, 3);
      
      Assert.assertEquals(150779.862, exList.totalVolume(), 0.001);
   }
   
   /** A test for averageSurfaceArea method. **/
   @Test public void averageSurfaceAreaTest() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25); 
      SquareAntiprism ex2 = new SquareAntiprism(" Medium Example ", 10.4); 
      SquareAntiprism ex3 = new SquareAntiprism("Large Example", 32.46);
      SquareAntiprism[] exs = {ex1, ex2, ex3};
      SquareAntiprismList exList = new SquareAntiprismList("Examples", exs, 3);
      
      Assert.assertEquals(6431.542, exList.averageSurfaceArea(), 0.001);
   }
   
   /** A test for averageSurfaceArea method if size = 0. **/
   @Test public void averageSurfaceAreaTest2() {
      SquareAntiprism[] exs = {};
      SquareAntiprismList exList = new SquareAntiprismList("Examples", exs, 0);
      
      Assert.assertEquals(0, exList.averageSurfaceArea(), 0.000001);
   }
   
   /** A test for averageVolume method. **/
   @Test public void averageVolumeTest() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25); 
      SquareAntiprism ex2 = new SquareAntiprism(" Medium Example ", 10.4); 
      SquareAntiprism ex3 = new SquareAntiprism("Large Example", 32.46);
      SquareAntiprism[] exs = {ex1, ex2, ex3};
      SquareAntiprismList exList = new SquareAntiprismList("Examples", exs, 3);
      
      Assert.assertEquals(50259.954, exList.averageVolume(), 0.001);
   }
   
   /** A test for averageVolume method if size = 0. **/
   @Test public void averageVolumeTest2() {
      SquareAntiprism[] exs = {};
      SquareAntiprismList exList = new SquareAntiprismList("Examples", exs, 0);
      
      Assert.assertEquals(0, exList.averageVolume(), 0.000001);
   }
   
   /** A test for toString method. **/
   @Test public void toStringTest() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25); 
      SquareAntiprism ex2 = new SquareAntiprism(" Medium Example ", 10.4); 
      SquareAntiprism ex3 = new SquareAntiprism("Large Example", 32.46);
      SquareAntiprism[] exs = {ex1, ex2, ex3};
      SquareAntiprismList exList = new SquareAntiprismList("Examples", exs, 3);
      
      Assert.assertTrue(exList.toString().contains(
                          "----- Summary for Examples -----"));
   }
   
   /** A test for getList method. **/
   @Test public void getListTest() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25); 
      SquareAntiprism ex2 = new SquareAntiprism(" Medium Example ", 10.4); 
      SquareAntiprism ex3 = new SquareAntiprism("Large Example", 32.46);
      SquareAntiprism[] exs = {ex1, ex2, ex3};
      SquareAntiprismList exList = new SquareAntiprismList("Examples", exs, 3);
      
      Assert.assertArrayEquals(exs, exList.getList());
   }
   
   /** A test for addSquareAntiprism method. **/
   @Test public void addSquareAntiprismTest() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25); 
      SquareAntiprism ex2 = new SquareAntiprism(" Medium Example ", 10.4); 
      SquareAntiprism ex3 = new SquareAntiprism("Large Example", 32.46);
      SquareAntiprism[] exs = {ex1, ex2, ex3, null};
      SquareAntiprismList exList = new SquareAntiprismList("Examples", exs, 3);
      
      SquareAntiprism addEx = new SquareAntiprism("Add Example", 6.20);
      exList.addSquareAntiprism("Add Example", 6.20);
      
      Assert.assertEquals(addEx, exs[3]);
   }
   
   /** A test for findSquareAntiprism method. **/
   @Test public void findSquareAntiprismTest() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25); 
      SquareAntiprism ex2 = new SquareAntiprism(" Medium Example ", 10.4); 
      SquareAntiprism ex3 = new SquareAntiprism("Large Example", 32.46);
      SquareAntiprism[] exs = {ex1, ex2, ex3};
      SquareAntiprismList exList = new SquareAntiprismList("Examples", exs, 3);
      
      Assert.assertEquals(exs[0], exList.findSquareAntiprism("Small Example"));
   }
   
   /** A test for findSquareAntiprism method if none exist. **/
   @Test public void findSquareAntiprismTest2() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25); 
      SquareAntiprism ex2 = new SquareAntiprism(" Medium Example", 10.4); 
      SquareAntiprism ex3 = new SquareAntiprism("Large Example", 32.46);
      SquareAntiprism[] exs = {ex1, ex2, ex3};
      SquareAntiprismList exList = new SquareAntiprismList("Examples", exs, 3);
      
      Assert.assertEquals(null, exList.findSquareAntiprism("N/A"));
   }
   
   /** A test for findSquareAntiprism method if size = 0. **/
   @Test public void findSquareAntiprismTest3() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25); 
      SquareAntiprism ex2 = new SquareAntiprism(" Medium Example", 10.4); 
      SquareAntiprism ex3 = new SquareAntiprism("Large Example", 32.46);
      SquareAntiprism[] exs = {};
      SquareAntiprismList exList = new SquareAntiprismList("Examples", exs, 0);
      
      Assert.assertEquals(null, exList.findSquareAntiprism("none"));
   }
   
   /** A test for deleteSquareAntiprism method. **/
   @Test public void deleteSquareAntiprismTest() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25); 
      SquareAntiprism ex2 = new SquareAntiprism(" Medium Example", 10.4); 
      SquareAntiprism ex3 = new SquareAntiprism("Large Example", 32.46);
      SquareAntiprism[] exs = {ex1, ex2, ex3};
      SquareAntiprismList exList = new SquareAntiprismList("Examples", exs, 3);
      
      Assert.assertEquals(exs[1],
                exList.deleteSquareAntiprism("Medium Example"));
   }
   
   /** A test for deleteSquareAntiprism method if none exist. **/
   @Test public void deleteSquareAntiprismTest2() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25); 
      SquareAntiprism ex2 = new SquareAntiprism(" Medium Example", 10.4); 
      SquareAntiprism ex3 = new SquareAntiprism("Large Example", 32.46);
      SquareAntiprism[] exs = {ex1, ex2, ex3};
      SquareAntiprismList exList = new SquareAntiprismList("Examples", exs, 0);
      
      Assert.assertEquals(null, exList.deleteSquareAntiprism("N/A"));
   }
   
   /** A test for editSquareAntiprism method. **/
   @Test public void editSquareAntiprismTest() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25); 
      SquareAntiprism ex2 = new SquareAntiprism(" Medium Example", 10.4); 
      SquareAntiprism ex3 = new SquareAntiprism("Large Example", 32.46);
      SquareAntiprism[] exs = {ex1, ex2, ex3};
      SquareAntiprismList exList = new SquareAntiprismList("Examples", exs, 3);
      Assert.assertEquals(true,
             exList.editSquareAntiprism("Small Example", 2.0));
   }
   
   /** A test for editSquareAntiprism method if none exist. **/
   @Test public void editSquareAntiprismTest2() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25); 
      SquareAntiprism ex2 = new SquareAntiprism(" Medium Example", 10.4); 
      SquareAntiprism ex3 = new SquareAntiprism("Large Example", 32.46);
      SquareAntiprism[] exs = {ex1, ex2, ex3};
      SquareAntiprismList exList = new SquareAntiprismList("Examples", exs, 3);
      
      Assert.assertEquals(false, exList.editSquareAntiprism("N/A", 0.0));
   }
   
   /** A test for findSquareAntiprismWithLargestVolume method
   * (if statement = false). 
   **/
   @Test public void findSquareAntiprismWithLargestVolumeTest() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25); 
      SquareAntiprism ex2 = new SquareAntiprism(" Medium Example", 10.4); 
      SquareAntiprism ex3 = new SquareAntiprism("Large Example", 32.46);
      SquareAntiprism[] exs = {};
      SquareAntiprismList exList = new SquareAntiprismList("Examples", exs, 0);
      
      Assert.assertEquals(null, exList.findSquareAntiprismWithLargestVolume());
   }
   
   /** A test for findSquareAntiprismWithLargestVolume method
   * (if statement = true).
   **/
   @Test public void findSquareAntiprismWithLargestVolumeTest2() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25); 
      SquareAntiprism ex2 = new SquareAntiprism(" Medium Example", 10.4); 
      SquareAntiprism ex3 = new SquareAntiprism("Large Example", 32.46);
      SquareAntiprism[] exs = {ex1, ex2, ex3};
      SquareAntiprismList exList = new SquareAntiprismList("Examples", exs, 3);
      
      Assert.assertEquals(exs[2],
             exList.findSquareAntiprismWithLargestVolume());
   }
   
   /** A test for findSquareAntiprismWithLargestVolume method if size = 0. **/
   @Test public void findSquareAntiprismWithLargestVolumeTest3() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25); 
      SquareAntiprism ex2 = new SquareAntiprism(" Medium Example", 10.4); 
      SquareAntiprism ex3 = new SquareAntiprism("Large Example", 32.46);
      SquareAntiprism[] exs = {ex3, ex2, ex1};
      SquareAntiprismList exList = 
                           new SquareAntiprismList("Examples", exs, 3);
      Assert.assertEquals(exs[0],
                   exList.findSquareAntiprismWithLargestVolume());
   }
}
