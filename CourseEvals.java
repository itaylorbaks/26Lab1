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
            // int curscore = 0;
            String semester = "";
            for (int i = 0; i < 2; i++) {
                colScanner.nextInt();
            }
            int sem = colScanner.nextInt();
            if (sem == 1) {
                summercount++;
                semester = "summer";
            }
            if (sem == 2) {
                regularcount++;
                semester = "regular";
            }
            colScanner.nextInt();
            int score = colScanner.nextInt();
            if (semester == "summer") {
                totalsummerscore += score;
                curscore += score;
                linesCount += 1;
            }
            if (semester == "regular") {
                curscore += score;
                totalregularscore += score;
                linesCount += 1;
            }
            colScanner.close();
            //Method to check whether the program is assessing each line correctly
            // System.out.println("Line Evaluated As Course: " + semester + " Score: " + curscore );
           

        }

        rowScanner.close();
        System.out.println("Evaluation Done!");
        int summeravg = (totalsummerscore / summercount);
        int regularavg = (totalregularscore / regularcount);
        System.out.println("The average evaluation of a summer class is: " + summeravg);
        System.out.println("The average evaluation of a regular class is: " + regularavg);

        }


    }

