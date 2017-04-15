package Lab10;

import java.util.Scanner;

public class Problem13_1Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides of a triangle: ");
        double[] sides = new double[3];
        for (int i = 0; i < sides.length; i++) {
            sides[i] = input.nextDouble();
        }
        System.out.print("Enter a triangle color: ");
        String color = input.next();
        System.out.print("Is the triangle filled? true/false: ");
        String isFilledString = input.next();
        boolean isFilled = (isFilledString.equals("true"));

        Triangle triangle = new Triangle(sides[0], sides[1], sides[2]);
        triangle.setColor(color);
        triangle.setFilled(isFilled);
        System.out.println("Triangle 1:");
        System.out.println("Area = " + triangle.getArea());
        System.out.println("Perimeter = " + triangle.getPerimeter());
        System.out.println("Color = " + triangle.getColor());
        System.out.println("Is filled? " + triangle.isFilled());


    }

	}
