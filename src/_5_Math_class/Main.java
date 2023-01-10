package _5_Math_class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x * x) + (y * y));

        System.out.println("The hypotenuse is : " + z);

        scanner.close();
    }
}

/*
Math.max(x,y) -> give bigger number
Math.min(x,y) -> give smaller number
Math.abs(y)   -> give absolute value of integer -10 => 10
Math.sqrt(x)  -> 2 sqrt 2 => 4
Math.round(x) -> 3.14 => 3.0 or 3.55 => 4.0
Math.ceil(x)  -> 3.14 => 4.0
Math.floor(x) -> 3.14 => 3.0
 */
