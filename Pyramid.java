/**
 * The Pyramid class represents a program that draws an ASCII pyramid dynamically
 * based on user input through a command line argument.
 * 
 * @author Your Name Goes Here
 */
public class Pyramid {
    /**
     * The main function is the implementation of our program.
     * 
     * @param args The command line arguments.  One should be passed in, which is the height
     *             of the pyramid to draw.
     */
    public static void main (String [] args) {
        if (args.length == 1){
            int height = Integer.parseInt(args[0]);
            System.out.println("User Input: " + height);
            String space = " ";
            String star ="*";
            for (int i = 1; i <= height; i++){
                String line = "";
                for (int j = 0; j <= height - i; j++) {
                    line += space;
                }
                line += star;
                for (int l= i; l <= height - i; l++){
                    line += space;
                }
                System.out.println(line);
                star += "**";
            }
        }
        else {
            System.out.println("User Input Incorrect.");
            System.out.println("You need to provide the number of rows of the pyramid as a command line argument. Please try again.");
            System.exit(-1);
        }
    }
}
