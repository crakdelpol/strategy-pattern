package com.matteo.pipitone.strategyPattern.worker;

public class Developer implements IWorker{

    @Override
    public String Work() {
        return "Developing new features";
    }

    @Override
    public String HoursOfWork() {
        return "10 hours";
    }
}
