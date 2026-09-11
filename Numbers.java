/**
 * The Numbers class demonstrates using a scanner 
 * 
 * @author Taylor Bakare
 */

import java.util.Scanner;

 public class Numbers {
 
     public static void main(String[] args) {
        String numbers = "86 75 309";
        Scanner scanner = new Scanner(numbers);

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            System.out.println(num);
        }
        scanner.close();
 
     }
 
 }
 