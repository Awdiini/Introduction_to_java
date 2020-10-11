import java.util.Scanner;
public class exercise_2_8 {
    public static void main(String[] args) {
        /*
        2.8 (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
        the current time in GMT. Revise the program so it prompts the user to enter the
        time zone offset to GMT and displays the time in the specified time zone.
         */

        Scanner input = new Scanner(System.in);	// Create new Scanner object
        System.out.print("Enter the time zone offset to GMT: ");
        int gmt = input.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        currentHour = currentHour + gmt;


        System.out.println("Current time is " + currentHour + ":"
                + currentMinute + ":" + currentSecond);

    }

}
