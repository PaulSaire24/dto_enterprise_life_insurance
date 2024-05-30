package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

import java.io.Serializable;

public class DetailRateUnitDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String unitType;
    private Double percentage;
    private Double amount;
    private String currency;

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "DetailRateUnitDTO{" +
                "unitType='" + unitType + '\'' +
                ", percentage=" + percentage +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
