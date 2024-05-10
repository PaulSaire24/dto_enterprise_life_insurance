package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

import java.io.Serializable;

public class AmountDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Double amount;
    private String currency;
    private DescriptionDTO period;


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

    public DescriptionDTO getPeriod() {
        return period;
    }

    public void setPeriod(DescriptionDTO period) {
        this.period = period;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AmountDTO{");
        sb.append("amount=").append(amount);
        sb.append(", currency='").append(currency).append('\'');
        sb.append(", period='").append(period);
        sb.append('}');
        return sb.toString();
    }
}
