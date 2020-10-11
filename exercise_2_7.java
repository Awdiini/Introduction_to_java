import java.util.Scanner;
public class exercise_2_7 {
    public static void main(String[] args) {

    /*
   2.7 (Find the number of years) Write a program that prompts the user to enter the
    minutes (e.g., 1 billion), and displays the number of years and remaining days for
    the minutes. For simplicity, assume that a year has 365 days.
     */

        //Find the number of years
        // hint
        // 1 day = 1440 minutes;
        //  so  year = 525600 minutes(1440* 365);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();
        int years = minutes / 525600;
        int days = (minutes % 525600) / 1440;
        System.out.println(minutes + " minutes is approximately " + years
                + " years and " + days + " days");
    }
}
