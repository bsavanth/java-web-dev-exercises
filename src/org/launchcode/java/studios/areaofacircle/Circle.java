package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {


        while (true){
            Scanner input = new Scanner(System.in);
            System.out.println("\nEnter a radius: ");
            double radius = input.nextDouble();
            if (radius<0) {
                System.out.println("\nEnter valid radius, try again..\n");
                continue;
            }
            else {
                System.out.println("The area of a circle of radius " + radius + " is: " + getArea(radius));
            }
        }
    }
    public static Double getArea(Double radius) {
        return 3.14 * radius * radius;
    }
}


