import java.util.Scanner;
public class exercise_2_3 {
    public static void main(String[] args) {
        /*
        (Convert meters into feet) Write a program that reads a number in meters, converts
        it to feet, and displays the result. One meter is 3.2786 feet
         */
        //Convert meters into feet
        int meter;
        double feet;
        Scanner m  =new Scanner(System.in);
        System.out.print("Enter a value for meter: ");
        meter = m.nextInt();
        feet = meter*3.2786;
        System.out.println(meter + " Meter(s) is: "+ feet+ " Feet");


    }
}
