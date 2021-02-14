package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application

public class Main {
   
    public static void main(String args[]) {
     
        Model model = new Model();               // Create shared database
        Controller1 c1 = new Controller1(model,"first Screen"); // Create first controller
        Controller2 c2 = new Controller2(model,"second Screen"); // Create second controller
        Controller2 c3 = new Controller2(model,"third Screen"); 
        Controller2 c4 = new Controller2(model,"fourth Screen"); 

        
    } // main
  
} // Main
