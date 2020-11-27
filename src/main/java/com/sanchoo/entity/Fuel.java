package com.sanchoo.entity;

import lombok.Getter;

@Getter
public enum Fuel {
    PETROL("бензин"), DIESEL("дизельное"), GAS("газ"), HYBRID("гибрид"), ELECTRO("электро");

    Fuel(String value) {
        this.value = value;
    }

    private final String value;
}
