package com.example.springbootintro.BeanTest;

public class Cat implements Animal{
    public Cat() {
        makeSound();
    }

    @Override
    public void makeSound() {
        System.out.println("create Cat");
    }
}
