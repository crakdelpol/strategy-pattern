package com.matteo.pipitone.strategyPattern.worker;

import org.springframework.stereotype.Component;

@Component
public class Bricklayer implements IWorker {

    @Override
    public String Work() {
        return "Building an house!";
    }

    @Override
    public String HoursOfWork() {
        return "12 hours";
    }

}
