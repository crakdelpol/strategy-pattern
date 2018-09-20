package com.matteo.pipitone.strategyPattern.worker;

import org.springframework.stereotype.Component;

@Component
public class Trader implements IWorker {
    @Override
    public String Work() {
        return "Trading some titles";
    }

    @Override
    public String HoursOfWork() {
        return "8 hours";
    }
}
