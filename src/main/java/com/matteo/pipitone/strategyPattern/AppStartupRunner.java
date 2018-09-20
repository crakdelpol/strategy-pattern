package com.matteo.pipitone.strategyPattern;

import com.matteo.pipitone.strategyPattern.worker.Bricklayer;
import com.matteo.pipitone.strategyPattern.worker.Developer;
import com.matteo.pipitone.strategyPattern.worker.Trader;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@SuppressWarnings("unused")
public class AppStartupRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {

        Bricklayer bricklayer = new Bricklayer();
        Developer developer = new Developer();
        Trader trader = new Trader();
        System.out.println("There are some workers, all of them have a work and work for different hours ");
        System.out.println("I'm a bricklayer and my work is ".concat(bricklayer.Work()).concat(" and he work for ").concat(bricklayer.HoursOfWork()));
        System.out.println("I'm a developer and my work is ".concat(developer.Work()).concat(" and he work for ").concat(bricklayer.HoursOfWork()));
        System.out.println("I'm a trader and my work is ".concat(trader.Work()).concat(" and he work for ").concat(bricklayer.HoursOfWork()));

    }
}
