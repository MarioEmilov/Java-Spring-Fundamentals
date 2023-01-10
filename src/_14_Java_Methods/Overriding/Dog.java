package _14_Java_Methods.Overriding;

public class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("The dog goes *bark*");
    }
}
