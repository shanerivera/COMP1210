/** 
 * Exception that can be thrown in readBallPlayerFile method.
 * @author Shane Rivera - COMP1210 - 005
 * @version 4/17/2022
 */
 
public class InvalidCategoryException extends Exception {
   
   /**
   * Constructor.
   * @param category - Invalid
   */
   public InvalidCategoryException(String category) {
      super("For category: " + "\"" + category + "\"");
   }

}