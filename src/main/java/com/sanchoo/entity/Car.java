package com.sanchoo.entity;


import lombok.Getter;

import java.util.Objects;
import java.util.UUID;

@Getter
public class Car {
    private final UUID id;
    private final String brand;
    private final String model;
    private final BodyCar bodyCar;
    private Engine engine;
    private Transmission transmission;
    private int price;

    private Car(String brand, String model, BodyCar bodyCar) {
        id = UUID.randomUUID();
        this.brand = brand;
        this.model = model;
        this.bodyCar = bodyCar;
    }

    public static Car of(String brand, String model, BodyCar bodyCar) {
        return new Car(brand, model, bodyCar);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", bodyCar=" + bodyCar +
                '}';
    }
}
