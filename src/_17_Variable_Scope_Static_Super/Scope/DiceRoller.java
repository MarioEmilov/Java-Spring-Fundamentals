package _17_Variable_Scope_Static_Super.Scope;

import java.util.Random;

public class DiceRoller {
    Random random;
    int number;

    DiceRoller() {
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}
