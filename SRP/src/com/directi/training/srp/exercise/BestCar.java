package com.directi.training.srp.exercise;

public class BestCar {
	 public Car getBestCar()
	    {
		 CarDatabase db = new CarDatabase();
	        Car bestCar = null;
	        for (Car car : db.get_carsDb()) {
	            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
	                bestCar = car;
	            }
	        }
	        return bestCar;
	    }
}
