package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application
// This done by Mohammed Alwahaibi
public class Main {
   
    public static void main(String args[]) {
     
        Model model = new Model();               // Create shared database
       Controller1 c1 = new Controller1(model, "The First Screen"); // Create first controller
        Controller2 c2 = new Controller2(model, "The Second Screen"); // Create second controller
        Controller2 c3 = new Controller2(model, "The Third Screen");
        Controller2 c4 = new Controller2(model, "The Fourth Screen");
    } // main
  
} // Main
