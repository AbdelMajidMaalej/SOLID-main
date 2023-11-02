package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarManager
{

	CarDatabase db = new CarDatabase();
    public String getCarsNames()
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : db.get_carsDb()) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

}
