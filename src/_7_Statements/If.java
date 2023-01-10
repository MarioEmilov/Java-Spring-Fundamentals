package _7_Statements;

import java.util.Random;

public class If {
    public static void main(String[] args) {

        // if statement = performs a block of code if it's condition evaluates to be true
        Random random = new Random();

        int age = random.nextInt(90) + 1;

        if (age == 75) {
            System.out.println("Ok Boomer!");
        } else if (age >= 18) {
            System.out.println("You are an adult!");
        } else if (age >= 13) {
            System.out.println("You are a teenager!");
        } else {
            System.out.println("You are not an adult!");
        }
    }
}
