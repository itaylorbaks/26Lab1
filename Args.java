/**
 * The Args class demonstrates how command line arguments work
 * 
 * @author Your Name Goes Here
 */

public class Args {
   /**
     * The main function is the implementation of our program.
     * 
     * @param args The command line arguments.  
     */
    public static void main(String[] args) {
      for (int i = args.length -1; i >= 0; i--) {
        System.out.println(args[i]);
      }


    }

}
