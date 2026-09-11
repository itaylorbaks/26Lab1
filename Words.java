/**
 * The Numbers class demonstrates using a scanner 
 * 
 * @author Taylor Bakare
 */

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

 public class Words {
 
     public static void main(String[] args) {
        Scanner lineScanner = null;
        try {
            lineScanner = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Problem opening file: " + e.getMessage());
        }

        while (lineScanner.hasNextLine()) {
            String line = lineScanner.nextLine();
            Scanner wordScanner = new Scanner(line);
            while (wordScanner.hasNext()) {
                String word = wordScanner.next();
                System.out.print(word + " ");
            }
            wordScanner.close();
            System.out.println();
        }
        lineScanner.close();


        // while (scanner.hasNext()) {
        //     String word = scanner.next();
        //     System.out.print(word);
        // }
        // scanner.close();
 
     }
 
 }
 