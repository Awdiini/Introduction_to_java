import java.util.Scanner;


public class exerxise_2_4 {
        public static void main(String[] args) {
        /*
       (Convert square meter into ping) Write a program that converts square meter into ping.
        The program prompts the user to enter a number in square meter, converts it to ping,
        and displays the result. One square meter is 0.3025 ping.

         */
            //Convert square meter into ping
            double sqr_meter;
            double ping;
            Scanner in  =new Scanner(System.in);
            System.out.print("Enter a number in square meters: ");
            sqr_meter = in.nextDouble();
            ping = sqr_meter * 0.3025;
            System.out.println(sqr_meter + " SquareMeter is: "+ ping+ " pings");



    }

}
