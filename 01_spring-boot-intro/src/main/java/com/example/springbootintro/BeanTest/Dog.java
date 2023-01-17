package com.example.springbootintro.BeanTest;

public class Dog implements Animal{
    public Dog() {
        makeSound();
    }

    @Override
    public void makeSound() {
        System.out.println("create Dog");
    }
}
