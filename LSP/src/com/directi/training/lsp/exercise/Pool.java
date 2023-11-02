package com.directi.training.lsp.exercise;

public class Pool
{
    public void run()
    {
    	DuckType donaldDuck = new Duck();
    	DuckType electricDuck = new ElectronicDuck();
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(DuckType... ducks)
    {
        for (DuckType duck : ducks) {
            duck.quack();
        }
    }

    private void swim(DuckType... ducks)
    {
        for (DuckType duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
