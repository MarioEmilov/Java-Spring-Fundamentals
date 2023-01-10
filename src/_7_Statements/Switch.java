package _7_Statements;

import java.util.Random;

public class Switch {
    public static void main(String[] args) {

        // switch = statement that allows a variable to be tested for equality against a list of values
        Random random = new Random();

        int day = random.nextInt(7) + 1;

        switch (day) {
            case 7:
                System.out.println("It is Sunday!");
                break;
            case 1:
                System.out.println("It is Monday!");
                break;
            case 2:
                System.out.println("It is Tuesday!");
                break;
            case 3:
                System.out.println("It is Wednesday!");
                break;
            case 4:
                System.out.println("It is Thursday!");
                break;
            case 5:
                System.out.println("It is Friday!");
                break;
            case 6:
                System.out.println("It is Saturday!");
                break;
            default:
                System.out.println("That is not a day!");
        }
    }
}
