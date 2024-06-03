package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

import java.io.Serializable;
import java.util.Date;

public class ExchangeRateDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Date date;
    private String baseCurrency;
    private String targetCurrency;
    private DetailDTO detail;
    private Date exchangeRateDate;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public DetailDTO getDetail() {
        return detail;
    }

    public void setDetail(DetailDTO detail) {
        this.detail = detail;
    }

    public Date getExchangeRateDate() {
        return exchangeRateDate;
    }

    public void setExchangeRateDate(Date exchangeRateDate) {
        this.exchangeRateDate = exchangeRateDate;
    }

    @Override
    public String toString() {
        return "ExchangeRateDTO{" +
                "date=" + date +
                ", baseCurrency='" + baseCurrency + '\'' +
                ", targetCurrency='" + targetCurrency + '\'' +
                ", detail=" + detail +
                ", exchangeRateDate=" + exchangeRateDate +
                '}';
    }
}
