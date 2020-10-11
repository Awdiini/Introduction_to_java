import java.util.Scanner;
public class exercise_2_5 {
    public static void main(String[] args) {

    /*
    (Financial application: calculate tips) Write a program that reads the subtotal
    and the gratuity rate and then computes the gratuity and total. For example, if the
    user enters 10 for subtotal and 12% for gratuity rate, the program displays $1.2
    as gratuity and $11.2 as total
     */

    //Financial application
        double subtotal;
        double gratuityRate;
        System.out.print("Enter the subtotal and a gratuity rate: ");
        Scanner in  = new Scanner(System.in);
        subtotal = in.nextDouble();
        gratuityRate = in.nextDouble();
        double gratuity = subtotal * (gratuityRate/100);
        double total = subtotal + gratuity;
        System.out.println("The gratuity is $" + gratuity +
                " and total is $" + total);
    }
}
