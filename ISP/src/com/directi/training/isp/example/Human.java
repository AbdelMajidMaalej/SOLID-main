package com.directi.training.isp.example;

public class Human implements HumanWorker
{
    @Override
    public String work()
    {
        return "Human works";
    }

    @Override
    public String eat()
    {
        return "Human eats";
    }
}
