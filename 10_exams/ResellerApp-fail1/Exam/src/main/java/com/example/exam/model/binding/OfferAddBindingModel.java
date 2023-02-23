package com.example.exam.model.binding;

import com.example.exam.model.entity.ConditionNameEnum;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public class OfferAddBindingModel {

    @Size(min = 2, max = 50)
    private String Description;

    @NotNull
    @Positive
    private BigDecimal price;

    @NotNull
    private ConditionNameEnum condition;

    public OfferAddBindingModel() {
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public ConditionNameEnum getCondition() {
        return condition;
    }

    public void setCondition(ConditionNameEnum condition) {
        this.condition = condition;
    }
}
