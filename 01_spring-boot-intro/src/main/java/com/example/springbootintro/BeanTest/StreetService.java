package com.example.springbootintro.BeanTest;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class StreetService {
    private final Animal cat;
    private final Animal dog;

    @Autowired
    public StreetService(@Qualifier("createCat") Animal cat, Animal dog) {
        System.out.println("4. I'm on the street");
        this.cat = cat;
        this.dog = dog;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("5. Post construct of street");
        this.cat.makeSound();
        this.dog.makeSound();
        System.out.println(this.cat.hashCode());
        System.out.println(this.dog.hashCode());
    }
}
