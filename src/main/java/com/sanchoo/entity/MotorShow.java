package com.sanchoo.entity;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.Preconditions.*;

public class MotorShow {
    private static MotorShow motorShow = new MotorShow();
    private List<Car> carList = new ArrayList<>();

    public static MotorShow getInstance() {
        return motorShow;
    }

    public void addCar(Car car) {
        checkNotNull(car, "car is null");
        carList.add(car);
    }

    public List<Car> getCarList() {
        return List.copyOf(carList);
    }
}
