package com.sanchoo.entity;

import lombok.Getter;

@Getter
public enum BodyCar {
    SEDAN("седан"), ESTATE("универсал"), COUPE("купе"), PICKUP("пикап"), CABRIOLET("кабриолет");

    BodyCar(String value) {
        this.value = value;
    }

    private final String value;
}
