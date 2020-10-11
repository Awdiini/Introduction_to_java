import java.util.Scanner;

public class exercise_2_1 {
    public static void main(String[] args) {
        /*
       2.1 (Convert mile to kilometer) Write a program that reads a mile in a double value
        from the console, converts it to kilometers, and displays the result. The formula
        for the conversion is as follows: 1 mile = 1.6 kilometers
         */
        //Problem Solution......
        int miles;
        double kilometer;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Miles: ");
        miles = input.nextInt();
        kilometer = miles * 1.6;
        String str = String.format("%.02f", kilometer);
        System.out.println(miles + " Miles is " + str + " Kilometers");
    }
}
