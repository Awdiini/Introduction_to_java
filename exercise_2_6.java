import javax.swing.*;
import java.util.Scanner;
public class exercise_2_6 {
    public static void main(String[] args) {
        /*
        2.6 (Multiply the digits in an integer) Write a program that reads an integer between
    0 and 1000 and multiplies all the digits in the integer. For example, if an integer
    is 932, the multiplication of all its digits is 54.
    Hint: Use the % operator to extract digits, and use the / operator to remove the
    extracted digit.
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = in.nextInt();
        int temp = number;
        int less10 = number%10;
        number /= 10;
        int tens = number % 10;
        number /= 10;
        int hundreds = number % 10;
        number /= 10;
        int total = hundreds * tens * less10;
        System.out.println("The product of the digits in " + temp +  " is " + total);

    }
}
