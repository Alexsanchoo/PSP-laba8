package com.sanchoo.entity;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Transmission {
    private final TransmissionType type;
    private final int stageNumber;

    private Transmission(TransmissionType type, int stageNumber) {
        this.type = type;
        this.stageNumber = stageNumber;
    }

    public static Transmission of(TransmissionType type, int stageNumber) {
        return new Transmission(type, stageNumber);
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "type=" + type +
                ", stageNumber=" + stageNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transmission that = (Transmission) o;
        return stageNumber == that.stageNumber &&
                type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, stageNumber);
    }
}
