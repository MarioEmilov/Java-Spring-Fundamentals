package com.example.exam.init;

import com.example.exam.service.ConditionService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataBaseInit implements CommandLineRunner {

    private final ConditionService conditionService;

    public DataBaseInit(ConditionService conditionService) {
        this.conditionService = conditionService;
    }


    @Override
    public void run(String... args) throws Exception {
        conditionService.initConditions();
    }
}

