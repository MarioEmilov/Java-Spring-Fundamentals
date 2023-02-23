package com.example.exam.service;

import com.example.exam.model.entity.Condition;
import com.example.exam.model.entity.ConditionNameEnum;

public interface ConditionService {

    void initConditions();

    Condition findByConditionNameEnum (ConditionNameEnum conditionNameEnum);
}
