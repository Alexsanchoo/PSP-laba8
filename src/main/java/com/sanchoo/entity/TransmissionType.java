package com.sanchoo.entity;

import lombok.Getter;

@Getter
public enum TransmissionType {
    AUTO("АКПП"), MANUAL("МКПП");

    TransmissionType(String value) {
        this.value = value;
    }

    private final String value;
}
