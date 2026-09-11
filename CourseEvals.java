/**
 * The CourseEvals class represents a program for analyzing the average course evaluation
 * for summer and regular semester courses based on a data set read from file.
 *
 * @author Your Name Goes Here
 */

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class CourseEvals {
    /**
     * The main function is the implementation of our program.
     * 
     * @param args The command line arguments.  One should be passed in, which is the name
     *             of the data file to read.
     */
    public static void main(String[] args) {
        int totalsummerscore = 0;
        int summercount = 0;
        int summeravg = (totalsummerscore / summercount);
        int totalregularscore = 0; 
        int regularcount = 0;
        int regularavg = (totalregularscore / regularcount);

        Scanner rowScanner = null;
        System.out.println("What is your filename?: ");
        try {
            rowScanner = new Scanner(File(System.in));
            System.out.println("File Found!");
        }
        catch (FileNotFoundException e) {
            System.out.println("Problem opening file: " + e.getMessage());
        }

        }


    }
}
