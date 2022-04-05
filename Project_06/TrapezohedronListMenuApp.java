import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/** 
 * Program with main method and menu app for trapezohedron list
 * that provides 8 different menu options.
 * @author Shane Rivera - COMP1210 - 005
 * @version 2/22/2022
 */
 
public class TrapezohedronListMenuApp
{
   /**
    * Main method program for reading files and creating trapezohedron lists,
    * can also print the list, print summary, add a trapzohedron, delete a
    * trapezohedron, find a trapezohedron by label, and edit a trapezohedron.
    * @throws FileNotFoundException - if file is not found / does not exist
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) throws FileNotFoundException
   {
      String tzhListName = "no list name";
      ArrayList<Trapezohedron> tList = new ArrayList<Trapezohedron>();
      TrapezohedronList myTzhList = new TrapezohedronList(tzhListName, tList);
      String fileName = "no file name";
   
      String code = "";
   
      Scanner scan = new Scanner(System.in);
   
      System.out.println("Trapezohedron List System Menu\n"
                     + "R - Read File and Create Trapezohedron List\n"
                     + "P - Print Trapezohedron List\n"
                     + "S - Print Summary\n"
                     + "A - Add Trapezohedron\n"
                     + "D - Delete Trapezohedron\n"
                     + "F - Find Trapezohedron\n"
                     + "E - Edit Trapezohedron\n"
                     + "Q - Quit");
   
   
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine();
         code = code.toUpperCase();
         if (code.length() == 0) {
            continue;
         }
         char codeChar = code.charAt(0);
         
         switch (codeChar) {
            case 'R': // read file
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();
            
               myTzhList = myTzhList.readFile(fileName);
            
               System.out.println("\tFile read in and "
                              + "Trapezohedron List created\n");
               break;
               
            case 'P': // print list
               System.out.println(myTzhList);
               break;
               
            case 'S': // print summary
               System.out.println(myTzhList.summaryInfo() + "\n");
               break;
               
            case 'A': // add trapezohedron
               System.out.print("\tLabel: ");
               String addLabel = scan.nextLine();
               System.out.print("\tColor: ");
               String addColor = scan.nextLine();
               System.out.print("\tShort Edge: ");
               double addEdge = Double.parseDouble(scan.nextLine());
               
               myTzhList.addTrapezohedron(addLabel, addColor, addEdge);
               
               System.out.println("\t*** Trapezohedron added ***\n");
               break;
               
            case 'D': // delete trapezohedron
               System.out.print("\tLabel: ");
               String delLabel = scan.nextLine();
               
               if (myTzhList.deleteTrapezohedron(delLabel) != null) {
                  System.out.println("\t\"" + delLabel + "\" deleted\n");
               }
               else {
                  System.out.println("\t\"" + delLabel + "\" not found\n");
               }
               break;
               
            case 'F': // find trapezohedron
               System.out.print("\tLabel: ");
               String findLabel = scan.nextLine();
               
               if (myTzhList.findTrapezohedron(findLabel) != null) {
                  System.out.println(
                     myTzhList.findTrapezohedron(findLabel) + "\n");
               }
               else {
                  System.out.println("\t\"" + findLabel + "\" not found\n");
               }
               break;
               
            case 'E': // edit trapezohedron
               System.out.print("\tLabel: ");
               String editLabel = scan.nextLine();
               System.out.print("\tColor: ");
               String editColor = scan.nextLine();
               System.out.print("\tShort Edge: ");
               double editEdge = Double.parseDouble(scan.nextLine());
               
               if (myTzhList.editTrapezohedron(editLabel,
                                              editColor, editEdge)) {
                  System.out.println("\t\"" + editLabel
                                     + "\" successfully edited\n");
               }
               else {
                  System.out.println("\t\"" + editLabel + "\" not found\n");
               }
               break;
               
            case 'Q': // quit
               break;
               
            default: // invalid code
               System.out.println("\t*** invalid code ***\n");
               break;
         }
      }  while (!code.equals("Q"));
   }
}