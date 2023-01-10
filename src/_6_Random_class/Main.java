package _6_Random_class;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(6) + 1; //dice from 1 to 6

        /*
        random.nextInt()
        random.nextDouble()
        random.nextBoolean()

        double y = random.nextDouble();
        boolean z = random.nextBoolean();
         */

        System.out.println(x);

    }
}
