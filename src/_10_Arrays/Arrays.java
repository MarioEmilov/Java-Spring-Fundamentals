package _10_Arrays;

public class Arrays {
    public static void main(String[] args) {
        String[] car = {"Camaro", "Tesla", "Corvette", "BMW"};
        car[0] = "Mustang";
        System.out.println(car[3]);
        System.out.println(car[0]);

        String[] cars = new String[3];
        cars[0] = "Renault";
        cars[1] = "Opel";
        cars[2] = "VW";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
