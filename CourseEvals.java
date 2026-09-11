/**
 * The CourseEvals class represents a program for analyzing the average course evaluation
 * for summer and regular semester courses based on a data set read from file.
 *
 * @author Your Name Goes Here
 */

import java.io.FileNotFoundException;
import java.util.Random;
import java.io.File;
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
        int totalregularscore = 0; 
        int regularcount = 0;



        Scanner fileFinder = new Scanner(System.in);
        Scanner rowScanner = null;
        System.out.println("What is your filename?: ");
        try {
            rowScanner = new Scanner(new File(fileFinder.next()));
            System.out.println("File Found! Scanning Now...");
            fileFinder.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Problem opening file: " + e.getMessage());
        }

        while (rowScanner.hasNextLine()) {
            String currentLine = rowScanner.nextLine();
            Scanner colScanner = new Scanner(currentLine);
            int curEval = 0;
            for (int i = 0; i < 2; i++) {
                colScanner.nextInt();
            }
            int sem = colScanner.nextInt();
            if (sem == 1) {
                summercount++;
                curEval += 1;
                String semester = "summer";
            }
            if (sem == 2) {
                regularcount++;
                curEval +=2;
                String semester = "regular";
            }
            colScanner.nextInt();
            int score = colScanner.nextInt();
            if (curEval == 1) {
                totalsummerscore += score;
                int curscore = score;
            }
            if (curEval == 2) {
                int curscore = score;
            }
            colScanner.close();
            System.out.println("Line Evaluated As Course: " + curEval + " Score: " + curscore );
        }
        rowScanner.close();
        System.out.println("Evaluation Done!");
        int summeravg = totalsummerscore / summercount;
        int regularavg = totalregularscore / regularcount;
        System.out.println("The average evaluation of a summer class is: " + summeravg);
        System.out.println("The average evaluation of a regular class is: " + regularavg);

        }


    }

