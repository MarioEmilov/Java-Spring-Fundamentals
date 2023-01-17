package com.example.springbootintro.BeanTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfiguration {

    //@Primary
    @Bean(value = "dog")
    @Scope(scopeName = "prototype") //Singleton create 1 dog and Prototype create second dog (different cash code)
    public Animal createDog() {
        return new Dog();
    }

    @Bean
    public Animal createCat() {
        return new Cat();
    }
}
