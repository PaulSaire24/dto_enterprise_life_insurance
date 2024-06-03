package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

import java.io.Serializable;

public class FactorDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Double value;
    private Double ratio;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getRatio() {
        return ratio;
    }

    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }

    @Override
    public String toString() {
        return "FactorDTO{" +
                "value=" + value +
                ", ratio=" + ratio +
                '}';
    }
}
