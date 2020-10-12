import java.util.Scanner;
public class exercise_2_9 {
    public static void main(String[] args) {
        /*
       2.9 (Physics: acceleration) Average acceleration is defined as the change of velocity
        divided by the time taken to make the change.
        Write a program that prompts the user to enter the starting velocity v0 in meters/
        second, the ending velocity v1 in meters/second, and the time span t in seconds,
        then displays the average acceleration.
         */

        // Physics: acceleration
        double v0;
        double v1;
        double t;
        double total;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter V0, V1, T: ");
        v0 = input.nextDouble();
        v1 = input.nextDouble();
        t = input.nextDouble();
        total =  (v1 - v0) / t;
//            Math.round(total);
        System.out.println("The average acceleration is "+ Math.round(total));

    }
}
