/**
 * The GuessingGame class represents a program that plays a "What number am I thinking of?"
 * game with the user.  It should provide hints for each incorrect guess.
 *
 * @author Your Name Goes Here
 */

import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
    /**
     * The main function is the implementation of our program.
     * 
     * @param args The command line arguments, unused
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        int target = rnd.nextInt(1000) +1;
        int tryiterator = 0;
        boolean won = false;
        Scanner intScan = new Scanner(System.in);

        System.out.println("Guess my number between 0 and 1000");
    
        while (!won) {
            if (intScan.hasNextInt() == false) {
                System.out.println("Only integer guesses please!");
                intScan.next();
                continue;
                
            }

            else {
                int userGuess = intScan.nextInt();
                if (userGuess > target) {
                    System.out.println("Too high!");
                    tryiterator++;
                }
                else if (userGuess < target) {
                    System.out.println("Too low!");
                    tryiterator++;
                }
                else if (userGuess == target) {
                    tryiterator++;
                    System.out.println("You guessed my number!");
                    System.out.println("You had " + tryiterator + " number guesses.");
                    won = true;
                }

            }
        }
        intScan.close();


    }
}
