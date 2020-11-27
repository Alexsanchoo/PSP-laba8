package com.sanchoo.entity;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Engine {
    private final Fuel fuel;
    private final int volume;

    private Engine(Fuel fuel, int volume) {
        this.fuel = fuel;
        this.volume = volume;
    }

    public static Engine of(Fuel fuel, int volume) {
        return new Engine(fuel, volume);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return volume == engine.volume &&
                fuel == engine.fuel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fuel, volume);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "fuel=" + fuel +
                ", volume=" + volume +
                '}';
    }
}
