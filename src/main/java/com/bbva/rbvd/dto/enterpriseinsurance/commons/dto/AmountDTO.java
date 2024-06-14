package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AmountDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Double amount;
    private String currency;
    private DescriptionDTO period;
    private ExchangeRateDTO exchangeRate;


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

    public ExchangeRateDTO getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(ExchangeRateDTO exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public String toString() {
        return "AmountDTO{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                ", period=" + period +
                ", exchangeRate=" + exchangeRate +
                '}';
    }
}
