package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import pojoClasses.Footballer;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class FootballerRepository
{
    private static final Map<String, Footballer> footballer = new HashMap<>();

    @PostConstruct
    public void initData()
    {
        Footballer firstfootballer = new Footballer();
        firstfootballer.setName("Messi");
        firstfootballer.setClub("Barcelona");
        firstfootballer.setCountry("Argentina");

        footballer.put(firstfootballer.getName(), firstfootballer);

        Footballer secondfootballer = new Footballer();
        secondfootballer.setName("Ronaldo");
        secondfootballer.setClub("Juventus");
        secondfootballer.setCountry("Portugal");

        footballer.put(secondfootballer.getName(), secondfootballer);

        Footballer thirdfootballer = new Footballer();
        thirdfootballer.setName("Neymar");
        thirdfootballer.setClub("PSG");
        thirdfootballer.setCountry("Brazil");

        footballer.put(thirdfootballer.getName(), thirdfootballer);

    }
    public Footballer findFootballer (String name)
    {
        Assert.notNull(name,"Please enter a name");
        return footballer.get(name);

    }




}
