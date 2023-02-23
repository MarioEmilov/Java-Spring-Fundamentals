package com.example.exam.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "conditions")
public class Condition extends BaseEntity {

    @Column(unique = true, nullable = false)
    @Enumerated(EnumType.STRING)
    private ConditionNameEnum name;

    @Column(nullable = false)
    private String description;


    public Condition() {
    }

    public ConditionNameEnum getName() {
        return name;
    }

    public void setName(ConditionNameEnum category) {
        this.name = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

