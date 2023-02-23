package com.example.exam.model.service;

import com.example.exam.model.entity.Condition;

import java.math.BigDecimal;

public class OfferServiceModel {

    private String description;
    private BigDecimal price;
    private Condition condition;

    public OfferServiceModel() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }
}
