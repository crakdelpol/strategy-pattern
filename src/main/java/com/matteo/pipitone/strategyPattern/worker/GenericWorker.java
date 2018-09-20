package com.matteo.pipitone.strategyPattern.worker;

import org.springframework.stereotype.Component;

public class GenericWorker implements IWorker {

    public GenericWorker(String work, String hoursOfWork) {
        setWork(work);
        setHoursOfWork(hoursOfWork);
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getHoursOfWork() {
        return hoursOfWork;
    }

    public void setHoursOfWork(String hoursOfWork) {
        this.hoursOfWork = hoursOfWork;
    }

    private String work;
    private String hoursOfWork;

    @Override
    public String Work() {
        return work;
    }

    @Override
    public String HoursOfWork() {
        return hoursOfWork;
    }
}
