import java.util.Scanner;

public class exercise_2_2 {
    public static void main(String[] args) {
        /*
        2.2 (Compute the volume of a triangle) Write a program that reads in the length of
        sides of an equilateral triangle and computes the area and volume using the following formulas:
         */

        // Compute the volume of a triangle
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the side of the Triangle:");
        double a= s.nextDouble();
        double  area=(Math.sqrt(3)/4)*(a*a);
        double volume = area*a;
        String ar =String.format("%.02f", area);
        String vol =String.format("%.02f", volume);

        System.out.println("Area of Triangle is: " + ar);

        System.out.println("The volume of the Triangular prism is : " + vol);

    }
}
