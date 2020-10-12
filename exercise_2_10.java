import java.util.Scanner;
public class exerise_2_10 {
    public static void main(String[] args) {
    /*
    2.10 (Science: calculating energy) Write a program that calculates the energy needed
    to heat water from an initial temperature to a final temperature. Your program
    should prompt the user to enter the amount of water in kilograms and the initial
    and final temperatures of the water. The formula to compute the energy is
     Q = M * (finalTemperature – initialTemperature) * 4184
     where M is the weight of water in kilograms, initial and final temperatures are in
    degrees Celsius, and energy Q is measured in joules.
     */
    //calculating energy
        double weight;
        double energy;
        double initial;
        double _final;
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter Weight of water in Kg: ");
        weight = userinput.nextDouble();
        System.out.print("Enter Initial Temperature: ");
        initial = userinput.nextDouble();
        System.out.print("Enter Final Temperature: ");
        _final = userinput.nextDouble();

        energy = weight*(_final-initial)*4184;
        System.out.println("Energy: "+ energy);
    }
}
