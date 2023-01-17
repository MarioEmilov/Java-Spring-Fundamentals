package com.example.springbootintro.BeanTest;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {

    private final Animal cat;
    private final Animal dog;
    private final List<Animal> animals;

    @Autowired
    public HomeService(@Qualifier("createCat") Animal cat, Animal dog, List<Animal> animals) {
        System.out.println("1. I'm in home");
        this.cat = cat;
        this.dog = dog;
        this.animals = animals;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("2. Post construct of home");
        this.cat.makeSound();
        this.dog.makeSound();
        System.out.println(this.cat.hashCode());
        System.out.println(this.dog.hashCode());
        System.out.println("3. list of animals activities");
        this.animals.forEach(Animal::makeSound);
    }

    /*
    @Autowired
    public HomeService(Animal dog,
                       @Qualifier("createCat") Animal cat,
                       List<Animal> animal) {
        System.out.println("Before two is from Constructor and after that is from Service implementation:");
        dog.makeSound();
        cat.makeSound();
        animal.forEach(Animal::makeSound);
        }

     */
}
