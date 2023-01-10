package _2_Variables;

public class Swap2Variables {
    public static void main(String[] args) {

        String x = "water";
        String y = "Kool-Aid";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}

/*
int x = 10;
int y = 20;

Swap the values of x and y
        x = x + y;
        y = x - y;
        x = x - y;
 */