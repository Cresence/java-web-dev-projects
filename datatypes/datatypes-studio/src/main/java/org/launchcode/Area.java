package org.launchcode;
import java.util.Scanner;

public class Area {


    public static Double getArea(double r) {
        return 3.14 * r * r;
    }

    public static void main(String[] arg) {
        double radius;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");

        try {
            radius = input.nextDouble();
            if (radius <= 0) {
                System.out.println("Please enter a number higher than 0.");
            }
            area = getArea(radius);
            System.out.println(area);
        } catch (Exception e) {
            System.out.println("Please enter a proper number");
        }
    }
}
