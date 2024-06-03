package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

import java.io.Serializable;

public class DetailDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private FactorDTO factor;
    private String priceType;

    public FactorDTO getFactor() {
        return factor;
    }

    public void setFactor(FactorDTO factor) {
        this.factor = factor;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    @Override
    public String toString() {
        return "DetailDTO{" +
                "factor=" + factor +
                ", priceType='" + priceType + '\'' +
                '}';
    }
}
