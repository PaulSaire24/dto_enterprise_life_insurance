package com.bbva.rbvd.dto.enterpriseinsurance.getquotation.dao;

import java.math.BigDecimal;

public class PaymentDAO {

    private String automaticDebitIndicatorType;
    private String domicileContractId;
    private String paymentFrequencyName;
    private String entity;
    private String branch;
    private BigDecimal insuredAmount;
    private String currency;

    public String getAutomaticDebitIndicatorType() {
        return automaticDebitIndicatorType;
    }

    public void setAutomaticDebitIndicatorType(String automaticDebitIndicatorType) {
        this.automaticDebitIndicatorType = automaticDebitIndicatorType;
    }

    public String getDomicileContractId() {
        return domicileContractId;
    }

    public void setDomicileContractId(String domicileContractId) {
        this.domicileContractId = domicileContractId;
    }

    public String getPaymentFrequencyName() {
        return paymentFrequencyName;
    }

    public void setPaymentFrequencyName(String paymentFrequencyName) {
        this.paymentFrequencyName = paymentFrequencyName;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public BigDecimal getInsuredAmount() {
        return insuredAmount;
    }

    public void setInsuredAmount(BigDecimal insuredAmount) {
        this.insuredAmount = insuredAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "PaymentDAO{" +
                "automaticDebitIndicatorType='" + automaticDebitIndicatorType + '\'' +
                ", domicileContractId='" + domicileContractId + '\'' +
                ", paymentFrequencyName='" + paymentFrequencyName + '\'' +
                ", entity='" + entity + '\'' +
                ", branch='" + branch + '\'' +
                ", insuredAmount=" + insuredAmount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
